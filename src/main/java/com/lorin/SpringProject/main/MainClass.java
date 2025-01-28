package com.lorin.SpringProject.main;

import com.lorin.SpringProject.config.AppConfig;
import com.lorin.SpringProject.services.LoginService;
import com.lorin.SpringProject.services.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import java.util.ArrayList;
import java.util.List;

public class MainClass
{
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class);//buraya hangi classtan oluşturduğum beani kullanmak istiyorsam o classın istini parametre olarak vericem AppConfig.class gibi
        UserService userService = context.getBean(UserService.class);

        // UserService üzerinden liste String'e çevrilip yazdırılır
        String output = userService.toString();

        // Output'u yazdırıyoruz
        System.out.println(output);


        LoginService loginService = new LoginService();
        loginService.login();


        /*for (User user:userService.getUserList()){
            System.out.println(user.toString());
        } bu şekilde bastırınca string olarak bastırmıyor stringe çevirmek için yukarıdaki gibi kullandım.  */


        /*UserService UserService1;
        UserService1 = new UserService();

        List<com.lorin.SpringProject.main.User> userList =new ArrayList<>();
        userList.add(new User("Lorin"));
        userList.add(new User("Melek"));

        UserService1.setUserList(userList);

        //UserService UserService2 = new UserService(); //tekrardan aynı classtan obje oluşturursan önceki objenin içeriğini kaybederiz.Bean amacı budur. dependency injection.
        // bunu engellemek için bean yapısı kullanıcaz config.java dosyasında yaptığım gibi
         */
    }
}
