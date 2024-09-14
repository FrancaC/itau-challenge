package com.example.itauchallenge.service;

import com.example.itauchallenge.entity.clientdto.ClientDTO;
import com.example.itauchallenge.entity.Client;
import com.example.itauchallenge.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;


    public Client saveClient(ClientDTO clientDTO){
        Client client = new Client();
        client.setFirstName(clientDTO.firstName());
        client.setLastName(clientDTO.lastName());
        client.setParticipation(clientDTO.participation());

        if (client.getFirstName().isEmpty()||
            client.getLastName().isEmpty() ||
            client.getParticipation() == null)
                throw  new NullPointerException();

        return clientRepository.save(client);
    }
    public List<Client> ListAllClients(){
       return clientRepository.findAll();
    }


}
