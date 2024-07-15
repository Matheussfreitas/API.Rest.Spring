package spring.api.rest.domain.paciente;

import spring.api.rest.domain.medico.Especialidade;

public record ListagemCadastroPaciente(
        Long id,
        String nome,
        String email,
        String cpf,
        Especialidade especialidade
) {
    public ListagemCadastroPaciente(Paciente paciente) {
        this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getCpf(), paciente.getEspecialidade());
    }
}
