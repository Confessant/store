package cn.edu.nuc.store.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.nuc.store.dao.interfaces.UserMapper;
import cn.edu.nuc.store.exception.LoginException;
import cn.edu.nuc.store.service.interfaces.UserService;

@Service
public class UserServiceImpl implements UserService {

	private transient Logger log = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private UserMapper usermapper;
	
	@Override
	public String login(String userName, String password) {
		String realPass = usermapper.findPass(userName);
		log.info("账号{}尝试登陆,密码{}",userName,password);
		System.out.println(realPass);
		if( userName == null || (!password.equals(realPass))){
			log.error("{} 帐号登录错误!", userName);
			throw new LoginException("用户名或密码错误!");
		}
		log.info("{}帐号登录成功!", userName);
		return realPass;
	}

}
