package com.hellokoding.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hellokoding.account.model.LigneCommande;

public interface LigneCommandeRepository extends JpaRepository<LigneCommande, Long> {
}
