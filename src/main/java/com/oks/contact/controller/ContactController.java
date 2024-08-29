package com.oks.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oks.contact.beans.Contact;
import com.oks.contact.service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {

	
	@Autowired
	ContactService contactService;
	
	@GetMapping("/user/{userId}")
	public List<Contact> getContactsOfUsers(@PathVariable("userId") Long userId){
		System.out.println("Loading the contacts details of user id : "+userId);
		return contactService.getContactsOfUser(userId);
	}
}
