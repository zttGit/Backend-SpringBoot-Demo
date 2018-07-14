package com.example.demo.controller;

import java.util.Date;
import java.util.Map;
import javax.servlet.ServletException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.bean.User;
import com.example.demo.service.UserService;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
@RequestMapping("/user")
public class UserController {
	 	@Autowired  
	    private UserService userService; 

	    @RequestMapping(value="/register", method = RequestMethod.POST, consumes = "application/json")
	    public User requestUser(@RequestBody User user) {
	        return userService.save(user);
	    }

}
