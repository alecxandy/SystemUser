package cadastro.de.pessoa.cadpessoa.controller;

import cadastro.de.pessoa.cadpessoa.model.Pessoa;
import cadastro.de.pessoa.cadpessoa.repository.CidadeRepository;
import cadastro.de.pessoa.cadpessoa.repository.DepartamentoRepository;
import cadastro.de.pessoa.cadpessoa.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private CidadeRepository cidadeRepository;

    @Autowired
    private DepartamentoRepository departamentoRepository;


    @GetMapping("/pessoas")
    public String index(Model model) {
        model.addAttribute("listaPessoas", pessoaRepository.findAll());
        return "index";
    }

    @GetMapping("/pessoas/nova")
    public String novaPessoa(Model model) {
        model.addAttribute("pessoa", new Pessoa());
        model.addAttribute("cidade", cidadeRepository.findAll());
        return "form";
    }

    @GetMapping("/pessoas/{id}")
    public String alterarPessoas(@PathVariable("id") long id, Model model) {
        Optional<Pessoa> pessoa = pessoaRepository.findById(id);
        if (pessoa.isEmpty()) {
            throw new IllegalArgumentException("Pessoa invalida");
        }
        model.addAttribute("cidade", cidadeRepository.findAll());
        model.addAttribute("pessoa", pessoa.get());
        return "form";
    }

    @PostMapping("/pessoas/salvar")
    public String pessoaSalvar(@Valid @ModelAttribute("pessoa") Pessoa pessoa, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("cidade", cidadeRepository.findAll());
            return "form";
        }
        pessoaRepository.save(pessoa);
        return "redirect:/pessoas";
    }

    @GetMapping("/pessoas/excluir/{id}")
    public String pessoaExcluir(@PathVariable("id") long id) {
        Optional<Pessoa> pessoa = pessoaRepository.findById(id);
        if (pessoa.isEmpty()) {
            throw new IllegalArgumentException("Pessoa invalida");
        }
        pessoaRepository.delete(pessoa.get());
        return "redirect:/pessoas";
    }

}
