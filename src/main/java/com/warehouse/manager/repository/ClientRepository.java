package com.warehouse.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.warehouse.manager.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
