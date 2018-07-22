package com.hellokoding.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hellokoding.account.model.Produit;

import java.util.List;


public interface ProduitRepository extends JpaRepository<Produit, Long> {
    Produit findByDesignation(String  designation);



    List<Produit> findAllByDesignationIgnoreCase( String mc);
}
