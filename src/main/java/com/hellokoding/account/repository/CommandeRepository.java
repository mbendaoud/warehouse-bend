package com.hellokoding.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hellokoding.account.model.Commande;

public interface CommandeRepository extends JpaRepository<Commande, Long> {
}
