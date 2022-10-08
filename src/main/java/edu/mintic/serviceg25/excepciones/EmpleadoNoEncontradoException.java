package edu.mintic.serviceg25.excepciones;

public class EmpleadoNoEncontradoException extends RuntimeException {

    public EmpleadoNoEncontradoException(Long idEmpleado) {
        super("No se encontró empleado registrado con id: " + idEmpleado);
    }

}
