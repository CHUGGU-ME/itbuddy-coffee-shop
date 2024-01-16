package com.itbuddy.coffee.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(UserController.class)
public class UserEntityControllerTest {

    @Autowired
    MockMvc mockMvc;


    /*
    * save user
    * 등록/수정
    * */
    @Test
    void postUser() throws Exception{

    }



    /*
    * get user
    *
    * */
    @Test
    void getUser() throws Exception{

    }


    /*
    * 사용자 로그인?
    *
    *
    *
    * */
    @Test
    void loginUser() throws Exception{

    }

}
