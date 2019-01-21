package com.multipolar.bootcamp.spring.appecommerce.controller;

import com.multipolar.bootcamp.spring.appecommerce.entity.Toko;
import com.multipolar.bootcamp.spring.appecommerce.repository.TokoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/api/toko")
public class TokoApi {

    @Autowired
    private TokoRepository repository;

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/list")
    public Iterable<Toko> findAll() {
        log.info("method ini di akses");
        return repository.findAll();
    }

    @PostAuthorize("hasRole('ADMIN')")
    @GetMapping("/{id}")
    public ResponseEntity<Toko> findById(@PathVariable("id") String id) {
        log.info("method ini di akses");
        Optional<Toko> tokoOptional = repository.findById(id);
        if (tokoOptional.isPresent())
            return ResponseEntity.ok(tokoOptional.get());
        else
            return ResponseEntity.noContent().build();
    }

    @RequestMapping(path = "/", method = RequestMethod.POST)
    public ResponseEntity<Toko> save(Principal principal, @RequestBody Toko toko) {
        toko.setCreatedBy(principal.getName());
        toko.setCreatedDate(Timestamp.valueOf(LocalDateTime.now()));
        toko = repository.save(toko);
        log.info("{}", toko);
        return ResponseEntity.ok(toko);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") String id) {
        Optional<Toko> tokoOptional = repository.findById(id);
        if (tokoOptional.isPresent()) {
            repository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.noContent().build();
        }
    }

}
