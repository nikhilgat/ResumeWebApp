package com.myproj.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentController {
	
	@Autowired
	private userservice service;
	
	@Autowired
	private usersDao Dao;
	
	@GetMapping("/get")
	@CrossOrigin("http://localhost:4200")
	public ResponseEntity<List<users>> getdata() {
		return ResponseEntity.ok(Dao.findAll());

	}
	
	@PostMapping("/post")
	public users postuserdata(@RequestBody users user ) {
		return Dao.save(user);
	}
	@PutMapping("/put")
	@CrossOrigin("http://localhost:4200")
	public users updateUsers(@RequestBody users user) {
		service.updateUsers(user);
		return Dao.save(user);
	}
	
}
