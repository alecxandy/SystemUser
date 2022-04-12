package cadastro.de.pessoa.cadpessoa.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    private String sigla;
/*

    @OneToMany
    private List<Pessoa> pessoaList;
*/


}
