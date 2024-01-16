package com.itbuddy.coffee.user.domain;

import java.util.List;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class PostUserReq {
    enum Order {
        POINT_ASC,
        POINT_DESC,
        NAME_ASC,
        NAME_DESC,
        PHONE_ASC,
        PHONE_DESC,
    }


    List<User> users;
    Order order;


}
