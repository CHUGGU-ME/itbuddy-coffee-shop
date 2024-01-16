package com.itbuddy.coffee.order.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ORDER_DETAIL")
@SequenceGenerator(name = "order_detail_seq")
public class OrderDetailEntity {

    @Id
    @GeneratedValue(generator = "order_detail_seq", strategy = GenerationType.SEQUENCE)
    @Column(name = "menu_key", nullable = false)
    private Long menuKey;

    @NotNull
    @Column(name = "order_key", nullable = false)
    private String orderKey;

    @Size(max = 30)
    @Column(name = "menu_name", length = 30)
    private String menuName;

    @Column(name = "price")
    private Long price;

    @Column(name = "amount")
    private Integer amount;

}