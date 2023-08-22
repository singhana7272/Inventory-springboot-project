package com.anamika.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anamika.Service.UserService;
import com.anamika.bean.User;


@RestController
public class InventoryController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping(path="/hello")
	public String hello() {
		System.out.println("hello");
		return "helloworld";
	}
	
	@PostMapping(path = "/Users")
    public ResponseEntity<User> registerUser(@RequestBody User user){
        System.out.println(user);
        userService.saveUser(user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    


}
