package com.multipolar.bootcamp.spring.appecommerce.repository;

import com.multipolar.bootcamp.spring.appecommerce.entity.Transaction;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.sql.Date;

public interface TransactionRepository extends CrudRepository<Transaction, String> {

    @Modifying
    @Query("update Transaction set tanggalBeli = :tanggalBeli, beli = true where id = :id")
    int updateTanggalBeliById(
            @Param("id") String id,
            @Param("tanggalBeli") Date tanggalBeli);
}