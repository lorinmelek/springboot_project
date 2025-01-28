package com.lorin.SpringProject.services;

import com.lorin.SpringProject.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LoginService {
    public void login(){
        //usser listesine ihtiyacım var
        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class);//buraya hangi classtan oluşturduğum beani kullanmak istiyorsam o classın istini parametre olarak vericem AppConfig.class gibi
        UserService userService = context.getBean(UserService.class);//HEM MAİNDE HEM DE BURDAN AYNI OBJEYE ERİŞEBİLİYORUM.O DEĞERİ ÇEKEBİLİYORUM CONTEİNERDAN.
    }
}
//BEAN YAPISI