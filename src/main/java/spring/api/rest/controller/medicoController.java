package spring.api.rest.controller;

import org.springframework.web.bind.annotation.*;
import spring.api.rest.medico.DadosCadastroMedico;

@RestController
@RequestMapping("medicos")
public class medicoController {
    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroMedico dados) {
        System.out.println(dados);
    }
}
