package cadastro.de.pessoa.cadpessoa.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Cidade {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String codigo;

    private String nome;

    private String uf;

    /*
    @OneToMany
    private List<Pessoa> pessoaList;
*/


}
