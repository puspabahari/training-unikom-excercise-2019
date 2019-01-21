package com.multipolar.bootcamp.spring.appecommerce.controller;

import com.multipolar.bootcamp.spring.appecommerce.entity.Merk;
import com.multipolar.bootcamp.spring.appecommerce.repository.MerkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/merk")

public class MerkApi {

    @Autowired
    private MerkRepository repository;

    @GetMapping("/list")
    public Iterable<Merk> findAll() {
        return repository.findAll();
    }

    @PostMapping("/")
    public ResponseEntity<Merk> save(@RequestBody Merk merk) {
        merk = repository.save(merk);
        return ResponseEntity.ok(merk);
    }

    @GetMapping("/findByNama")
    public List<Merk> findByNama(@RequestParam("nama") String nama){
        return repository.findByNama(nama);
    }

    @PutMapping("/")
    @Transactional
    public ResponseEntity<Merk> updateNamaMerk(@RequestBody Merk merk) {
        repository.updateNamaMerk(merk.getNama(), merk.getId());
        return ResponseEntity.ok(merk);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Merk> findById(@PathVariable("id") String id) {
        Optional<Merk> merkOptional = repository.findById(id);
        if (merkOptional.isPresent())
            return ResponseEntity.ok(merkOptional.get());
        else
            return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") String id) {
        Optional<Merk> merkOptional = repository.findById(id);
        if (merkOptional.isPresent()) {
            repository.deleteById(id);
            return ResponseEntity.ok().build();
        } else return ResponseEntity.noContent().build();
    }
}
