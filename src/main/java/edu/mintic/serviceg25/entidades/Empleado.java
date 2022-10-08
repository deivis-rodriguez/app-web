package edu.mintic.serviceg25.entidades;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Empleado {

    private @Id
    @GeneratedValue
    long idEmpleado;
    private String nombre;
    private String cargo;

    public Empleado() {
    }

    public Empleado(String nombre, String cargo) {
        this.nombre = nombre;
        this.cargo = cargo;
    }

    public long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", cargo=" + cargo + '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }
        if (!(o instanceof Empleado)) {
            return false;
        }

        Empleado empleado = (Empleado) o;

        return (this.idEmpleado == empleado.idEmpleado)
                && (this.cargo.equals(empleado.cargo))
                && (this.nombre.equals(empleado.nombre));

    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (int) (this.idEmpleado ^ (this.idEmpleado >>> 32));
        hash = 53 * hash + Objects.hashCode(this.nombre);
        hash = 53 * hash + Objects.hashCode(this.cargo);
        return hash;
    }

}
