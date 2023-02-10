package br.com.fiap.bank.api.web;

import br.com.fiap.bank.api.models.Client;
import br.com.fiap.bank.api.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {
    @Autowired
    private ClientService clientService;

    @PostMapping("/clients")
    void save(@RequestBody Client newClient) {
        clientService.save(newClient);
    }

    @GetMapping("/clients")
    List<Client> findAll() {
        return clientService.findAll();
    }
}
