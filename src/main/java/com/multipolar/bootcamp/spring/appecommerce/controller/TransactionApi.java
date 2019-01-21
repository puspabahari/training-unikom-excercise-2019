package com.multipolar.bootcamp.spring.appecommerce.controller;

import com.multipolar.bootcamp.spring.appecommerce.entity.Transaction;
import com.multipolar.bootcamp.spring.appecommerce.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/transaction")
public class TransactionApi {

    @Autowired
    private TransactionService service;

    @GetMapping("/list")
    public Iterable<Transaction> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Transaction> findById(@PathVariable("id") String id) {
        Optional<Transaction> transactionOptional = service.findById(id);
        if (transactionOptional.isPresent())
            return ResponseEntity.ok(transactionOptional.get());
        else
            return ResponseEntity.noContent().build();
    }

    @PostMapping("/peminjaman")
    public ResponseEntity<Transaction> peminjamanBuku(
            @RequestBody Transaction transaction) {
        transaction = service.beliProduk(transaction);
        return ResponseEntity.ok(transaction);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Transaction> pengembalianBukuById(@PathVariable("id") String id) {
        Optional<Transaction> transactionOptional = service.findById(id);
        if (!transactionOptional.isPresent())
            return ResponseEntity.noContent().build();
        else {
            service.beliProduk(transactionOptional.get());
            return ResponseEntity.ok().build();
        }
    }
}