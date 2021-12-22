package ru.stankin.bd.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "detail")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class DetailEntity {

    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "broadcast_id", nullable = false)
    private BroadcastEntity broadcastEntity;

    @Column(name = "aw")
    private Double aw;

    @Column(name = "bw")
    private Double bw;

    @Column(name = "u")
    private Double u;

    @Column(name = "b")
    private Double b;

    @Column(name = "afp")
    private Double afp;

    @Column(name = "m")
    private Double m;

    @Column(name = "fbd")
    private Double fbd;

    @Column(name = "hb")
    private Double hb;

    @Column(name = "zv")
    private Double zv;

    @Column(name = "z1")
    private Double z1;

    @Column(name = "z2")
    private Double z2;

    @Column(name = "af")
    private Double af;

    @Column(name = "V")
    private Double v;

    @Column(name = "wfv")
    private Double wfv;

    @Column(name = "n")
    private Double n;

    @Column(name = "wft")
    private Double wft;
}