package com.contact.Service;

import com.contact.Model.Contact;

import java.util.List;

public interface ContactSevice {

    List<Contact> getContact(int UserId);
}
