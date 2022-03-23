package cadastro.de.pessoa.cadpessoa.controller;

import cadastro.de.pessoa.cadpessoa.model.Pessoa;
import cadastro.de.pessoa.cadpessoa.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping("/pessoas")
    public String index(Model model) {
        model.addAttribute("listaPessoas", pessoaRepository.findAll());
        return "index";
    }

    @GetMapping("/pessoas/nova")
    public String novaPessoa(@ModelAttribute("pessoa") Pessoa pessoa) {
        return "form";
    }

    @PostMapping("/pessoas/salvar")
    public String pessoaSalvar(@ModelAttribute("pessoa") Pessoa pessoa) {
        pessoaRepository.save(pessoa);
        return "redirect:/pessoas";
    }


}
