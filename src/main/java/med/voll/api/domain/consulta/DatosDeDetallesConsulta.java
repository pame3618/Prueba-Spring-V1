package med.voll.api.domain.consulta;

import java.time.LocalDateTime;

public record DatosDeDetallesConsulta(Long id, Long idMedico, LocalDateTime fecha) {
}
