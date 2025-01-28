package com.lorin.SpringProject.config;

import com.lorin.SpringProject.main.User;
import com.lorin.SpringProject.services.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig
{
    @Bean
    public UserService userService(){//contexten çektiğim variable ne ise onu yazıcam return edilen değere
        UserService UserService = new UserService();

        List<User> userList =new ArrayList<>();
        userList.add(new User("Lorin"));
        userList.add(new User("Melek"));
        userList.add(new User("Vural"));
        userList.add(new User("Hazal"));


        UserService.setUserList(userList);

        return UserService;
    }
}
