package com.multipolar.bootcamp.spring.appecommerce.repository;

import com.multipolar.bootcamp.spring.appecommerce.entity.Merk;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MerkRepository extends CrudRepository<Merk, String> {
    @Modifying
    @Query("update Merk set nama = ?1 where id = ?2")
    int updateNamaMerk(String nama, String id);

    List<Merk> findByNama(String nama);
}
