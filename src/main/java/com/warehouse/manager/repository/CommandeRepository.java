package com.warehouse.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.warehouse.manager.model.Commande;

public interface CommandeRepository extends JpaRepository<Commande, Long> {
}
