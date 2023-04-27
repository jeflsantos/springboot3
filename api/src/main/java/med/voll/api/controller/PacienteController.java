package med.voll.api.controller;

import med.voll.api.paciente.DadosCadastroPaciente;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    public void cadastrar(@RequestBody DadosCadastroPaciente dadosCadastroPaciente){
        System.out.println("Dados recebidos: " +dadosCadastroPaciente);
    }
}
