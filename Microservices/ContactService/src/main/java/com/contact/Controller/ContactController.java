package com.contact.Controller;


import com.contact.Model.Contact;
import com.contact.Service.Impl.ContactSeviceImpl;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactSeviceImpl contactSevice;

//    @HystrixCommand(fallbackMethod = "ContactServiceFalllbackMethod", commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "5000")
//    })
    @GetMapping("/user/{UserId}")
    public ResponseEntity<?> getcontactByUserId(@PathVariable("UserId") int UserId) {
        try {
            List<Contact> contacts = this.contactSevice.getContact(UserId);
            return ResponseEntity.ok(contacts);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Oops something went wrong !!!");
        }

    }
//    public ResponseEntity<?> ContactServiceFalllbackMethod(int UserId){
//        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Contact-Service is down for some maintenance !!!");
//    }

}
