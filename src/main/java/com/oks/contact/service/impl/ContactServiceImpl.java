package com.oks.contact.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.oks.contact.beans.Contact;
import com.oks.contact.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService {
	static List<Contact> list;
	static {
			list=new ArrayList<>();
			list.add(new Contact(1l, "oks@gmail", "Omkar Singh", 101l));
			list.add(new Contact(2l, "krish@gmail", "Krish Kumar", 102l));
			list.add(new Contact(3l, "mohan@gmail", "Mohan Pandey", 102l));
			list.add(new Contact(4l, "ram@gmail", "Ram Gopal", 103l));			
	}
	@Override
	public List<Contact> getContactsOfUser(Long userId) {		
		return list.stream().filter(con->con.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
