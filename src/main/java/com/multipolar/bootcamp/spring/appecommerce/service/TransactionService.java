package com.multipolar.bootcamp.spring.appecommerce.service;

import com.multipolar.bootcamp.spring.appecommerce.entity.Transaction;
import com.multipolar.bootcamp.spring.appecommerce.entity.TransactionDetail;
import com.multipolar.bootcamp.spring.appecommerce.repository.TransactionDetailRepository;
import com.multipolar.bootcamp.spring.appecommerce.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;
    @Autowired
    private TransactionDetailRepository transactionDetailRepository;

    public Iterable<Transaction> findAll() {
        return transactionRepository.findAll();
    }

    public Optional<Transaction> findById(String id) {
        return this.transactionRepository.findById(id);
    }

    @Transactional
    public Transaction beliProduk(Transaction transaction) {
        List<TransactionDetail> newDetail = transaction.getDetails();
        transaction = transactionRepository.save(transaction);
        for (TransactionDetail details : newDetail) {
            details.setTransaction(transaction);
            transactionDetailRepository.save(details);
        }
        Optional<Transaction> transactionOptional = transactionRepository.findById(transaction.getId());
        return transactionOptional.get();
    }

    @Transactional
    public void beliProduk(Transaction transaction) {
        transactionRepository.updateTanggalBeliById(
                transaction.getId(),
                Date.valueOf(LocalDate.now()));
    }
}
