package com.multipolar.bootcamp.spring.appecommerce.repository;

import com.multipolar.bootcamp.spring.appecommerce.entity.Produk;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProdukRepository extends CrudRepository<Produk, String> {
}
