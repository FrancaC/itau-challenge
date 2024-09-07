package com.example.itauchallenge.repository;

import com.example.itauchallenge.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
