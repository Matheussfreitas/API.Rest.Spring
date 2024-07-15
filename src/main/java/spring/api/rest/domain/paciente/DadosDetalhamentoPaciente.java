package spring.api.rest.domain.paciente;

import spring.api.rest.domain.endereco.Endereco;
import spring.api.rest.domain.medico.Especialidade;

public record DadosDetalhamentoPaciente(
        Long id,
        String nome,
        String email,
        String cpf,
        String telefone,
        Especialidade especialidade,
        Endereco endereco
) {
    public DadosDetalhamentoPaciente(Paciente paciente) {
        this(paciente.getId(),
                paciente.getNome(),
                paciente.getEmail(),
                paciente.getCpf(),
                paciente.getTelefone(),
                paciente.getEspecialidade(),
                paciente.getEndereco());
    }
}
