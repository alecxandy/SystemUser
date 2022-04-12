package cadastro.de.pessoa.cadpessoa.model;

import lombok.*;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "o campo nome não pode ser vazio")
    private String nome;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataNascimento;

    @NotBlank(message = "o campo nome não pode ser vazio")
    @CPF
    private String cpf;

    @Email
    @NotBlank(message = "o campo nome não pode ser vazio")
    private String email;

    @NotBlank(message = "o campo nome não pode ser vazio")
    private String telefone;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @NotNull(message = "Selecione uma cidade")
    private Cidade cidade;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @NotNull(message = "Selecione um departamento")
    private Departamento departamento;
}
