package cadastro.de.pessoa.cadpessoa.repository;

import cadastro.de.pessoa.cadpessoa.model.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {

}
