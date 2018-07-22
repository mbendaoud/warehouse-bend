package com.warehouse.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.warehouse.manager.model.Categorie;



public interface CategorieRepository   extends JpaRepository<Categorie, Long> {

    Categorie findByNomCategorie(String nom);
}
