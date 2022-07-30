package com.contact.Service.Impl;

import com.contact.Model.Contact;
import com.contact.Service.ContactSevice;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ContactSeviceImpl implements ContactSevice {

    List<Contact> contactList=List.of(
            new Contact(1,"Amol Matal","4785223697","amya",1),
            new Contact(2,"Sangam Matal","2587413690","sam",1),
            new Contact(3,"Archit Matal","4784566927","archu",1),
            new Contact(4,"Ketana Matal","4782523147","ketu",2),
            new Contact(5,"Amit Matal","1235232697","amya",2),
            new Contact(6,"Niraj Matal","178947697","niraj",3),
            new Contact(7,"Jayesh Thorase","1237256697","jay",2)
    );


    @Override
    public List<Contact> getContact(int UserId) {

        List<Contact> contacts = contactList.stream().filter(contact -> contact.getUserId() == UserId).collect(Collectors.toList());
//        List<Contact> contactList1=new ArrayList<>(contacts);
        return contacts;
    }
}
