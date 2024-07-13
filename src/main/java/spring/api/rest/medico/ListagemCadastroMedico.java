package spring.api.rest.medico;

public record ListagemCadastroMedico(
        String nome,
        String email,
        String crm,
        Especialidade especialidade
) {
    public ListagemCadastroMedico(Medico medico) {
        this(medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
