package com.itbuddy.coffee.user.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class User {
    String id;
    String phoneNumber;
    String userName;
    String point;
}
