package com.login.controller;

import java.util.HashMap;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.login.pojo.User;
import com.login.service.LoginService;

@RestController
public class loginAction {
	
	@Autowired
	private LoginService userService;
	
	
	@RequestMapping("/userlogin.do")
	public Map<String, String> name(User user){
		User user2=userService.find(user);
		Map<String, String> map=new HashMap<>();
		if (user2==null) {
			map.put("msg", "no");
		} else {
			map.put("username", user2.getUsername());
			map.put("msg", "yes");
		}		
		System.out.println(map);
		return map;		
	}
}
