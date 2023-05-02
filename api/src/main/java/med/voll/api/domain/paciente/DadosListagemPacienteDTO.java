package med.voll.api.domain.paciente;

import med.voll.api.domain.endereco.Endereco;

public record DadosListagemPacienteDTO(Long id, String nome, String email, String telefone, Endereco endereco) {

    public DadosListagemPacienteDTO(PacienteModel paciente){
        this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getTelefone(), paciente.getEndereco());

    }
}
