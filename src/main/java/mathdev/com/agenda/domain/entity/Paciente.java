package mathdev.com.agenda.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "paciente")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String sobrenome;
    private String email;
    private String cpf;
}
