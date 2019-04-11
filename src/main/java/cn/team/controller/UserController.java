package cn.team.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.team.bean.User;
import cn.team.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/getUserByUsername/{username}") 
    public String getUserByUsername(@PathVariable String username){
        return (userService.getUserByUsername(username)).toString();
    }
	@RequestMapping(value="/addUser") 
    public String addUser(){
		User user = null;
		user.setUsername("1111");
		user.setPassword("123");
		int i = userService.addUser(user);
        return i==1?"cg":"sb";
    }
	
	
}
