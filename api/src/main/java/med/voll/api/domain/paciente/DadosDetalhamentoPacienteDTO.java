package med.voll.api.domain.paciente;

import med.voll.api.domain.endereco.Endereco;

public record DadosDetalhamentoPacienteDTO(Long id, String nome, String email, String telefone, Endereco endereco) {

    public DadosDetalhamentoPacienteDTO(PacienteModel paciente){
        this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getTelefone(), paciente.getEndereco());
    }
}
