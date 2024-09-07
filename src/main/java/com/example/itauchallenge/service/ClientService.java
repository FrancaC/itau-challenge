package com.example.itauchallenge.service;

import com.example.itauchallenge.entity.clientdto.ClientDTO;
import com.example.itauchallenge.entity.Client;
import com.example.itauchallenge.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;



}
