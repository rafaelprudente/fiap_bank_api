package br.com.fiap.bank.api.repositories;

import br.com.fiap.bank.api.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
