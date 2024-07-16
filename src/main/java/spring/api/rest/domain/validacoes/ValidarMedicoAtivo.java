package spring.api.rest.domain.validacoes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.api.rest.domain.consulta.DadosAgendamentoConsulta;
import spring.api.rest.domain.exception.ValidacaoException;
import spring.api.rest.domain.medico.MedicoRepository;

@Component
public class ValidarMedicoAtivo implements ValidadorAgendamentoDeConsulta {
    @Autowired
    private MedicoRepository medicoRepository;

    public void validar(DadosAgendamentoConsulta dados) {
        if (dados.idMedico() == null) {
            return;
        }
        var medicoEstaAtivo = medicoRepository.findAtivoById(dados.idMedico());
        if (!medicoEstaAtivo) {
            throw new ValidacaoException("Consulta não pode ser agendada com esse médico");
        }
    }
}
