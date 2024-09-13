package com.example.itauchallenge.controller;

import com.example.itauchallenge.entity.Client;
import com.example.itauchallenge.entity.clientdto.ClientDTO;
import com.example.itauchallenge.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ClientService clientService = new ClientService();

    @PostMapping("/save")
    public ResponseEntity<Client> saveClient(@RequestBody ClientDTO clientDTO){
      Client client =   clientService.saveClient(clientDTO);
        return ResponseEntity.ok().body(client);
    }
    @GetMapping("/listAll")
    public ResponseEntity<List<Client>> listAll(){
       List<Client> clientList = clientService.ListAllClients();
       return ResponseEntity.ok().body(clientList);
    }

}
