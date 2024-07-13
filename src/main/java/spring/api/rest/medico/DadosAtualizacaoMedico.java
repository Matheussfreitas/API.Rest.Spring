package spring.api.rest.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import spring.api.rest.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco
) {
}
