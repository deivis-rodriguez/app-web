package edu.mintic.serviceg25.excepciones;

public class EmpleadoNoEncontradoException extends RuntimeException {

    public EmpleadoNoEncontradoException(Long idEmpleado) {
        super("No se encontrĂ³ empleado registrado con id: " + idEmpleado);
    }

}
