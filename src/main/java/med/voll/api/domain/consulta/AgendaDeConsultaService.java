package med.voll.api.domain.consulta;

import med.voll.api.domain.medico.Medico;
import med.voll.api.domain.medico.MedicoRepository;
import med.voll.api.infra.errores.ValidacionDeIntegridad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgendaDeConsultaService {
    @Autowired
    private MedicoRepository medicoRepository;
    @Autowired
    private ConsultaRepository consultaRepository;
    public void agendar(DatosAgendarConsulta datos){

        if(medicoRepository.findById(datos.idMedico()).isPresent()){
            throw new ValidacionDeIntegridad("Este id no ha sido encontrado");
        }

        if(datos.idMedico() != 0 && medicoRepository.existsById(datos.idMedico())){

        }

        //var medico = medicoRepository.findById(datos.idMedico()).get();

        var medico = seleccionarmedico(datos);
        var consulta = new Consulta(null, medico, datos.fecha());

        consultaRepository.save(consulta);
    }

    private Medico seleccionarmedico(DatosAgendarConsulta datos ){
        if(datos.idMedico() != 0){
            return medicoRepository.getReferenceById(datos.idMedico());
        }

        if(datos.especialidad() == null){
            throw new ValidacionDeIntegridad("Debe seleccionarse una especialidad por medico");
        }

        return medicoRepository.seleccionMedicoConEspecialidadenFecha(datos.especialidad(), datos.fecha());
    }
}
