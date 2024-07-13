package spring.api.rest.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import spring.api.rest.endereco.DadosEndereco;
import spring.api.rest.endereco.Endereco;
import spring.api.rest.medico.Especialidade;

public record DadosCadastroPaciente(
        @NotBlank
        String nome,
        @NotBlank
        @Pattern(regexp = "\\d{9}")
        String cpf,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String telefone,
        @NotNull
        Especialidade especialidade,
        @NotNull
        @Valid
        DadosEndereco endereco
) {
}