package br.com.fiap.bank.api.configurations;

import br.com.fiap.bank.api.models.Client;
import br.com.fiap.bank.api.repositories.ClientRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class LoadDatabase {
    @Bean
    CommandLineRunner initDatabase(ClientRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Client("Bilbo Baggins")));
            log.info("Preloading " + repository.save(new Client("Frodo Baggins")));
        };
    }
}
