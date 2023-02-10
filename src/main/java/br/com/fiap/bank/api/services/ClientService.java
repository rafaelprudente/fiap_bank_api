package br.com.fiap.bank.api.services;

import br.com.fiap.bank.api.models.Client;
import br.com.fiap.bank.api.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepository repository;
    public Client save( Client newClient) {
        return repository.save(newClient);
    }
    public List<Client> findAll() {
        return repository.findAll();
    }
}
