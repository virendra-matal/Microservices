package com.user.Controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.user.Model.User;
import com.user.Service.Impl.userServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private userServiceImpl userService;
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("{id}")
//    @HystrixCommand(fallbackMethod = "fallback_getUserById", commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "5000")
//    })
    public ResponseEntity<?> getUserById(@PathVariable("id") int id)throws InterruptedException{


        try {

            User user = this.userService.getUser(id);
            List contacts = this.restTemplate.getForObject("http://contact-service/contact/user/"+user.getId(), List.class);
            user.setContacts(contacts);
            return  ResponseEntity.ok(user);
        }catch (Exception e){
            e.printStackTrace();
//            Thread.currentThread().interrupt();
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found or Something went wrong !!!");
        }



    }
//    private ResponseEntity<?> fallback_getUserById(int UserId){
//        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("User-Service is down for some maintenance !!!");
//    }
}
