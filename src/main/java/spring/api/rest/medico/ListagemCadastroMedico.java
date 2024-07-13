package spring.api.rest.medico;

public record ListagemCadastroMedico(
        Long id,
        String nome,
        String email,
        String crm,
        Especialidade especialidade
) {
    public ListagemCadastroMedico(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
