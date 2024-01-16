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
public class Menu {

    @JsonProperty("menu_name")
    String menuName;

    @JsonProperty("price")
    Integer price;

}
