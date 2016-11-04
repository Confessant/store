package cn.edu.nuc.store.service.impl;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.edu.nuc.store.BaseTest;
import cn.edu.nuc.store.service.interfaces.UserService;

public class UserServiceImplTest extends BaseTest{

	@Autowired
	private UserService userService;
	
	@Test
	public void testLogin() {
		
		String pass = userService.login("三","m3");
		
		Assert.assertNotNull(pass);
	}

}
