package med.voll.api.controller;

import med.voll.api.domain.medico.DatosRegistroPaciente;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pacientes")
public class PacienteController {

    public void registrarPaciente(@RequestBody DatosRegistroPaciente datos){
        System.out.println("datos recebidos: " +datos);
    }
}
