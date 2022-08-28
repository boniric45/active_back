package fr.boniric.active.service;


import fr.boniric.active.exception.ClientByIdException;
import fr.boniric.active.model.Client;
import fr.boniric.active.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client addClient(Client client){
        client.setClientCode(UUID.randomUUID().toString());
        return clientRepository.save(client);
    }

    public List<Client> findAllClient(){
        return clientRepository.findAll();
    }

    public Client updateClient(Client client){
        return clientRepository.save(client);
    }

    public Client findById(Long id){
        return clientRepository.findClientById(id).orElseThrow(()-> new ClientByIdException("Client avec l'Id "+id+" n'est pas connu en base"));
    }

    public void deleteClientById(Long id){
        clientRepository.deleteById(id);
    }

}
