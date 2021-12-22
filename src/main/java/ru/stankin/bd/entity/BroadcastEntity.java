package ru.stankin.bd.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "broadcast")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class BroadcastEntity {

    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "x")
    private Double x;

    @Column(name = "YF")
    private Double yf;

    @Column(name = "Eb")
    private Double eb;

    @Column(name = "Kfv")
    private Double kfv;

    @Column(name = "YE")
    private Double ye;

    @Column(name = "Yb")
    private Double yb;

    @Column(name = "KFa")
    private Double kfa;

    @Column(name = "Kfb")
    private Double kfb;

    @Column(name = "dost")
    private Double dost;

    @Column(name = "g0")
    private Double g0;

    @Column(name = "Ea")
    private Double ea;
}