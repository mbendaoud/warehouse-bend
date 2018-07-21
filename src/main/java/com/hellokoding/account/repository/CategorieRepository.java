package com.hellokoding.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hellokoding.account.model.Categorie;



public interface CategorieRepository   extends JpaRepository<Categorie, Long> {

    Categorie findByNomCategorie(String nom);
}
