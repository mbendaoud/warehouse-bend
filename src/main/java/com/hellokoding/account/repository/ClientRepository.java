package com.hellokoding.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hellokoding.account.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
