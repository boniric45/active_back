package fr.boniric.active.repository;

import fr.boniric.active.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client,Long> {

    Optional<Client> findClientById(Long id);

}
