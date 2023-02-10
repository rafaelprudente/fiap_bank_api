package br.com.fiap.bank.api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Data
@Entity
@EqualsAndHashCode
@NoArgsConstructor
@RequiredArgsConstructor
public class Client {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private Long id;
    @lombok.NonNull
    private String name;
}
