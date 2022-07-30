package com.user.Service.Impl;

import com.user.Model.User;
import com.user.Service.userService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class userServiceImpl implements userService {

    List<User> userList=List.of(
            new User(1,"Veer Matal","veer@gmail.com"),
            new User(2,"Virendra Matal","virendra@gmail.com"),
            new User(3,"Vicky Matal","vicky@gmail.com")
    );



    @Override
    public User getUser(int id) {
        System.out.println("List is : "+userList);
        User userById = userList.stream().filter(user -> user.getId() == id).findAny().orElse(null);
        return userById;
    }
}
