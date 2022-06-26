package cadastro.de.pessoa.cadpessoa.comand;

import cadastro.de.pessoa.cadpessoa.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class PopularNoBanco implements CommandLineRunner {


    @Autowired
    private PessoaRepository pessoaRepository;

    @Override
    public void run(String... args) throws Exception {
/*

        //cad cicidade
        Cidade cidade = new Cidade();
        cidade.setNome("Recife");
        cidade.setUf("PE");
        cidadeRepository.save(cidade);
        cidadeRepository.flush();

        //cad departamento
        Departamento departamento = new Departamento();
        departamento.setNome("Departamento de tecnologia da informação");
        departamento.setSigla("TI");
        departamentoRepository.save(departamento);
        departamentoRepository.flush();

        //cad pessoa
        Pessoa pessoa = new Pessoa();
        pessoa.setEmail("alec@gmail");
        pessoa.setDataNascimento(LocalDate.of(1988, 05, 23));
        pessoa.setTelefone("81987427790");
        pessoa.setCpf("06206020401");
        pessoa.setNome("alexandre");
        pessoa.setCidade(cidade);
        pessoa.setDepartamento(departamento);
        pessoaRepository.save(pessoa);
*/

    }
}
