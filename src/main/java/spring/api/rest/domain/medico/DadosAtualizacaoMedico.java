package spring.api.rest.domain.medico;

import jakarta.validation.constraints.NotNull;
import spring.api.rest.domain.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        Boolean ativo,
        String nome,
        String telefone,
        DadosEndereco endereco
) {
}
