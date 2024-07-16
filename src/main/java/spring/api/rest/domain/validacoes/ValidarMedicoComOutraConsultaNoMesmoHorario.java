package spring.api.rest.domain.validacoes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.api.rest.domain.consulta.ConsultaRepository;
import spring.api.rest.domain.consulta.DadosAgendamentoConsulta;
import spring.api.rest.domain.exception.ValidacaoException;

@Component
public class ValidarMedicoComOutraConsultaNoMesmoHorario implements ValidadorAgendamentoDeConsulta{
    @Autowired
    private ConsultaRepository consultaRepository;

    public void validar(DadosAgendamentoConsulta dados) {
        var medicoPossuiOutraConsultaNoMesmoHorario = consultaRepository.existsByMedicoIdAndData(dados.idMedico(), dados.data());
        if (medicoPossuiOutraConsultaNoMesmoHorario) {
            throw new ValidacaoException("O médico já possui outra consulta agendada no mesmo horário!");
        }
    }
}
