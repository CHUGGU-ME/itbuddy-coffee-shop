package com.itbuddy.coffee.user;

import com.itbuddy.coffee.user.domain.GetUserReq;
import com.itbuddy.coffee.user.domain.GetUserRes;
import com.itbuddy.coffee.user.domain.PostLoginUserReq;
import com.itbuddy.coffee.user.domain.PostLoginUserRes;
import com.itbuddy.coffee.user.domain.PostUserReq;
import com.itbuddy.coffee.user.domain.PostUserRes;
import com.itbuddy.coffee.user.domain.User;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("user")
@RequiredArgsConstructor
public class UserController {

    @GetMapping("")
    @ResponseBody
    public ResponseEntity<GetUserRes> getUser(
        @RequestBody GetUserReq getUserReq) throws Exception {
        return new ResponseEntity<GetUserRes>(GetUserRes.builder().build(), HttpStatus.OK);
    }

    @PostMapping("")
    @ResponseBody
    public ResponseEntity<PostUserRes> postUser(
        @RequestBody PostUserReq postUserReq) throws Exception {
        return new ResponseEntity<PostUserRes>(PostUserRes.builder().build(), HttpStatus.OK);
    }


    @PostMapping("login/{id}")
    @ResponseBody
    public ResponseEntity<PostLoginUserRes> loginUser(@PathVariable String id,
        @RequestBody PostLoginUserReq postLoginUserReq) throws Exception {
        return new ResponseEntity<>(PostLoginUserRes.builder().build(), HttpStatus.OK);
    }

}
