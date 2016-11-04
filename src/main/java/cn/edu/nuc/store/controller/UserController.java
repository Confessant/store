package cn.edu.nuc.store.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.edu.nuc.store.service.interfaces.UserService;


@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	

	@RequestMapping(value="/collection",method = RequestMethod.POST)
	public String index(
			String inputusername,String inputPassword,
			//@RequestParam(name="current",defaultValue="1") int current,
			HttpSession session, 
			Model model){
		System.out.println(inputusername);
		System.out.println(inputPassword);
		String realpassword = userService.login(inputusername, inputPassword);
		if( inputusername == null || realpassword != inputPassword ){
			return "redirect:/login";
		}
		/*
		PageInfo pi = weiboService.weibo(aid, current);
		
		model.addAttribute("pi", pi);*/
		System.out.println("ok");
		return "index";
	}
}
