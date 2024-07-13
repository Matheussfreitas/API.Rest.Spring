package spring.api.rest.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import spring.api.rest.medico.DadosCadastroMedico;
import spring.api.rest.medico.ListagemCadastroMedico;
import spring.api.rest.medico.Medico;
import spring.api.rest.medico.MedicoRepository;

import java.util.List;

@RestController
@RequestMapping("medicos")
public class MedicoController {
    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrarMedico(@RequestBody @Valid DadosCadastroMedico dados) {
        repository.save(new Medico(dados));
    }

    @GetMapping
    public List<ListagemCadastroMedico> listarMedicos() {
        return repository.findAll().stream()
                .map(ListagemCadastroMedico::new)
                .toList();
    }
}
