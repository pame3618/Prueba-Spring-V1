package med.voll.api.domain.consulta;

import med.voll.api.domain.medico.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {

}

