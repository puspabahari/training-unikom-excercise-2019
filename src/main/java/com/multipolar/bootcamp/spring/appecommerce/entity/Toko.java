package com.multipolar.bootcamp.spring.appecommerce.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "toko")
public class Toko {
    @Id
    @GenericGenerator(name = "uuid_gen", strategy = "uuid2")
    @GeneratedValue(generator = "uuid_gen")
    @Column(name = "id", nullable = false, unique = true)
    private String id;

    @Column(name = "nama", nullable = false, length = 100)
    private String nama;

    @Column(name = "nomor_ktp", nullable = false, length = 16, unique = true)
    private String nomorKtp;

    @Type(type = "text")
    @Column(name = "alamat")
    private String alamat;
}
