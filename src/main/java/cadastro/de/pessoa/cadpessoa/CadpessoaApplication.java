package cadastro.de.pessoa.cadpessoa;

import cadastro.de.pessoa.cadpessoa.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CadpessoaApplication {

	@Autowired
	private PessoaRepository pessoaRepository;

	public static void main(String[] args) {
		SpringApplication.run(CadpessoaApplication.class, args);
	}

}
