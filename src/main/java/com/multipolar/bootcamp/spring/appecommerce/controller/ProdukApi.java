package com.multipolar.bootcamp.spring.appecommerce.controller;

import com.multipolar.bootcamp.spring.appecommerce.entity.Produk;
import com.multipolar.bootcamp.spring.appecommerce.repository.ProdukRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/produk")
public class ProdukApi {

    @Autowired
    private ProdukRepository produkRepository;

    @GetMapping("/list")
    public Iterable<Produk> findAll() {
        return produkRepository.findAll();
    }

    @PostMapping("/")
    public ResponseEntity<Produk> save(@RequestBody Produk produk) {
        produk = produkRepository.save(produk);
        return ResponseEntity.ok(produk);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produk> findById(@PathVariable String id) {
        Optional<Produk> produkOptional = produkRepository.findById(id);
        if (produkOptional.isPresent()) {
            return ResponseEntity.ok(produkOptional.get());
        } else return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Produk> deleteById(@PathVariable("id") String id) {
        Optional<Produk> produkOptional = produkRepository.findById(id);
        if (produkOptional.isPresent()) {
            produkRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else
            return ResponseEntity.noContent().build();
    }
}
