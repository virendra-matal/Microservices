package com.api.Controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GatewayController {

    @GetMapping("/userservicefallback")
    public String UserServiceFalllbackMethod(){
        return "User-Service is down for some maintenance !!!";
    }


    @GetMapping("/contactservicefallback")
    public String ContactServiceFalllbackMethod(){
        return "Contact-Service is down for some maintenance !!!";
    }


}
