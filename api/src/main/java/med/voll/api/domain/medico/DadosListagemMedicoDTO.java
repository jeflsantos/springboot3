package med.voll.api.domain.medico;

public record DadosListagemMedicoDTO(Long id, String nome, String email, String crm, Especialidade especialidade) {

    public DadosListagemMedicoDTO(MedicoModel medico){
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
