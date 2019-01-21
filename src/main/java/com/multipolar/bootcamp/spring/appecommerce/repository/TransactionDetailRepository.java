package com.multipolar.bootcamp.spring.appecommerce.repository;

import com.multipolar.bootcamp.spring.appecommerce.entity.TransactionDetail;
import org.springframework.data.repository.CrudRepository;

public interface TransactionDetailRepository extends CrudRepository<TransactionDetail, String> {
}