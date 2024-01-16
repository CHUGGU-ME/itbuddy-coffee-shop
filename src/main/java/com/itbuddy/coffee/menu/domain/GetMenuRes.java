package com.itbuddy.coffee.menu.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetMenuRes {


    @JsonProperty("code")
    String code;

    @JsonProperty("msg")
    String msg;

    @JsonProperty("result")
    Object result;
}
