package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.User;
import com.example.demo.service.UserService;


@RestController
@RequestMapping("home")
public class HelloController {
	
	@Autowired
    private UserService userService;

    @RequestMapping(value="/register", method = RequestMethod.POST)
    public User requestUser(@RequestBody User user) {
        return userService.save(user);
    }
	@RequestMapping(value = "/hey", method= RequestMethod.GET)
    public String sayHey(){
       return "hello";
    }
	
	@RequestMapping(value = "/hello", method= RequestMethod.GET)
    public User sayHello(){
		User user = new User();
		user.setUserId(1L);
		user.setUsername("ztt");
		user.setPassword("123");
       return user;
    }
	@RequestMapping(value = "/hi" ,method= RequestMethod.GET)
    public User sayHi(){
		User user = new User();
		user.setUserId(2L);
		user.setUsername("aaa");
		user.setPassword("223");
       return user;
    }
	@RequestMapping(value = "/error" ,method= RequestMethod.GET)
    public String error(){
       return "出现错误";
    }
}
