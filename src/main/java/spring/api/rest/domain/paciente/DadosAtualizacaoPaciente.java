package spring.api.rest.domain.paciente;

import jakarta.validation.constraints.NotNull;
import spring.api.rest.domain.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
        @NotNull
        Long id,
        Boolean ativo,
        String nome,
        String telefone,
        DadosEndereco endereco
) {
}
