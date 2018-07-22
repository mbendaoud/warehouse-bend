package com.warehouse.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.warehouse.manager.model.LigneCommande;

public interface LigneCommandeRepository extends JpaRepository<LigneCommande, Long> {
}
