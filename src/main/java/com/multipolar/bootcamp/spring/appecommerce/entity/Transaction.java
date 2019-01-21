package com.multipolar.bootcamp.spring.appecommerce.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * create table transaction
 * (
 * id              varchar(64) not null primary key,
 * tanggal_beli    timestamp   not null default now(),
 * pelanggan_id    varchar(64) not null,
 * ) engine = InnoDB;
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "transaction")
public class Transaction {
    @Id
    @GenericGenerator(name = "uuid_gen", strategy = "uuid2")
    @GeneratedValue(generator = "uuid_gen")
    @Column(name = "id", nullable = false, unique = true)
    private String id;

    @Column(name = "tanggal_beli", nullable = false)
    private Timestamp tanggalBeli;

    @ManyToOne
    @JoinColumn(name = "pealnggan_id", nullable = false)
    private Pelanggan pelanggan;

    @OneToMany(mappedBy = "transaction")
    public List<TransactionDetail> details = new ArrayList<>();
}
