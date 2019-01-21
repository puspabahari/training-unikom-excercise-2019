package com.multipolar.bootcamp.spring.appecommerce.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;

/**
 * create table produk
 * (
 * id                  varchar(64)  not null primary key,
 * nama_produk         varchar(100) not null,
 * deskripsi           text,
 * merk_id             varchar(64)  not null,
 * ) engine = InnoDb;
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "produk")
public class Produk {

    @Id
    @GenericGenerator(name = "uuid_gen", strategy = "uuid2")
    @GeneratedValue(generator = "uuid_gen")
    @Column(name = "id", nullable = false, unique = true)
    private String id;

    @Column(name = "nama_produk", nullable = false)
    private String namaProduk;

    @Type(type = "text")
    @Column(name = "deskripsi")
    private String deskripsi;

    @ManyToOne
    @JoinColumn(name = "merk_id", nullable = false)
    private Merk merk;

}
