package com.example.ourfamily.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.ourfamily.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")  
public class UserTest
{

    @Autowired  
    private com.example.ourfamily.model.UserMapper UserMapper;  
      
    @Test  
    public void insertAndSelect() {  
        User User1 = new User();  
        User1.setUserName("tom");  
        User1.setPassword("123456");  
        UserMapper.addUserInfo(User1);  
    }  
}
