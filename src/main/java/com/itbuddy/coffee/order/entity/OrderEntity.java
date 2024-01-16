package com.itbuddy.coffee.order.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import java.time.Instant;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "`ORDER`")
@SequenceGenerator(name = "order_seq")
public class OrderEntity {

    @Id
    @GeneratedValue(generator = "order_seq", strategy = GenerationType.SEQUENCE)
    @Column(name = "order_key", nullable = false)
    private Long orderKey;

    @NotNull
    @Column(name = "user_key", nullable = false)
    private Long userKey;

    @Column(name = "created_at")
    private Instant createdAt;

}