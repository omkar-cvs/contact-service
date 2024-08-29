package com.oks.contact.service;

import java.util.List;

import com.oks.contact.beans.Contact;

public interface ContactService {
	List<Contact> getContactsOfUser(Long userId);
	
}
