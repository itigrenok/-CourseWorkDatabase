-- liquibase formatted sql

-- changeset Radjabova Yulia:create_broadcast
create table broadcast (
    id varchar(36) primary key,
    x decimal(16, 5),
    YF decimal(16, 5),
    Eb decimal(16, 5),
    Kfv decimal(16, 5),
    YE decimal(16, 5),
    Yb decimal(16, 5),
    KFa decimal(16, 5),
    Kfb decimal(16, 5),
    dost decimal(16, 5),
    g0 decimal(16, 5),
    Ea decimal(5, 16)
);

-- changeset Radjabova Yulia:create_detail
create table detail (
    id varchar(36) primary key,
    broadcast_id varchar(36) references broadcast,
    aw decimal(16, 5),
    bw decimal(16, 5),
    u decimal(16, 5),
    B decimal(16, 5),
    aFP decimal(16, 5),
    m decimal(16, 5),
    Fbd decimal(16, 5),
    HB decimal(16, 5),
    Zv decimal(16, 5),
    Z1 decimal(16, 5),
    Z2 decimal(16, 5),
    aF decimal(16, 5),
    V decimal(16, 5),
    wFv decimal(16, 5),
    n decimal(16, 5),
    wFt decimal(5, 16)
);