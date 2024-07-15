package spring.api.rest.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.api.rest.domain.consulta.DadosAgendamentoConsulta;
import spring.api.rest.domain.consulta.DadosDetalhamentoConsulta;
import spring.api.rest.domain.medico.DadosDetalhamentoMedico;

@RestController
@RequestMapping("consultas")
public class ConsultaController {
    @PostMapping
    @Transactional
    public ResponseEntity agendar(@RequestBody @Valid DadosAgendamentoConsulta dados) {
        return ResponseEntity.ok(new DadosDetalhamentoConsulta(null, null, null, null));
    }
}
