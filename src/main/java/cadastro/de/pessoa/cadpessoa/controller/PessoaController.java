package cadastro.de.pessoa.cadpessoa.controller;

import cadastro.de.pessoa.cadpessoa.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping("/pessoas")
    public String index(Model model) {
        model.addAttribute("listaPessoas",pessoaRepository.findAll());
        return "index";
    }

}
