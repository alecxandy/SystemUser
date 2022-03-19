package cadastro.de.pessoa.cadpessoa.repository;

import cadastro.de.pessoa.cadpessoa.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
