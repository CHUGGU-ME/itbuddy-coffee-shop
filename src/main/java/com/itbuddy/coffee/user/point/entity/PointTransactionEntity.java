package com.itbuddy.coffee.user.point.entity;

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
@Table(name = "POINT_TRANSACTION")
@SequenceGenerator(name = "point_transaction_seq")
public class PointTransactionEntity {

    @Id
    @GeneratedValue(generator = "point_transaction_seq", strategy = GenerationType.SEQUENCE)
    @Column(name = "point_key", nullable = false)
    private Long pointKey;

    @NotNull
    @Column(name = "user_key", nullable = false)
    private Long userKey;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "point")
    private Long point;

}