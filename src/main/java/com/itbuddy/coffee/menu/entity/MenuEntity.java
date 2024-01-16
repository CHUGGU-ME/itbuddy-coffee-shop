package com.itbuddy.coffee.menu.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "MENU")
@SequenceGenerator(name = "menu_seq")
public class MenuEntity {

    @Id
    @GeneratedValue(generator = "menu_seq", strategy = GenerationType.SEQUENCE)
    @Column(name = "menu_key", nullable = false)
    private Long id;

    @Size(max = 30)
    @Column(name = "menu_name", length = 30)
    private String menuName;

    @Column(name = "price")
    private Long price;

}