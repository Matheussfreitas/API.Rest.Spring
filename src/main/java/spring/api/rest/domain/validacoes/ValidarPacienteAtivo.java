package spring.api.rest.domain.validacoes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.api.rest.domain.consulta.DadosAgendamentoConsulta;
import spring.api.rest.domain.exception.ValidacaoException;
import spring.api.rest.domain.paciente.PacienteRepository;

@Component
public class ValidarPacienteAtivo implements ValidadorAgendamentoDeConsulta{
    @Autowired
    private PacienteRepository pacienteRepository;

    public void validar(DadosAgendamentoConsulta dados) {
        var pacienteEstaAtivo = pacienteRepository.findAtivoById(dados.idPaciente());
        if (!pacienteEstaAtivo) {
            throw new ValidacaoException("Consulta não pode ser marcada com paciente excluído");
        }
    }
}
