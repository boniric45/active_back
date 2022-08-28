package fr.boniric.active.controller;

import fr.boniric.active.model.Client;
import fr.boniric.active.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    /*
    OK
     */
    @GetMapping("/all")
    public ResponseEntity<List<Client>> getAllClients() {
        List<Client> clientList = clientService.findAllClient();
        return new ResponseEntity<>(clientList, HttpStatus.OK);
    }

    // Ok
    @GetMapping("/find/{id}")
    public ResponseEntity<Client> getClientByID(@PathVariable("id") Long id) {
        Client client = clientService.findById(id);
        return new ResponseEntity<>(client, HttpStatus.OK);
    }

    // Ok
    @PostMapping("/add")
    public ResponseEntity<Client> addClient(@RequestBody Client client) {
        Client newClient = clientService.addClient(client);
        return new ResponseEntity<>(newClient, HttpStatus.CREATED);
    }

    // Ok
    @PutMapping("/update")
    public ResponseEntity<Client> updateClient(@RequestBody Client client) {
        Client updateClient = clientService.updateClient(client);
        return new ResponseEntity<>(updateClient, HttpStatus.OK);
    }

    // Ok
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteClientById(@PathVariable("id") Long id) {
        clientService.deleteClientById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
