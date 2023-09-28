package med.voll.api.domain.medico;

import jakarta.validation.constraints.NotBlank;
import med.voll.api.domain.direccion.DatosDireccion;

public record DatosActualizarMedicos(@NotBlank Long id, String nombre, String documento, DatosDireccion direccion) {

}
