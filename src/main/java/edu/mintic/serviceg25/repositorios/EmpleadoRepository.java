package edu.mintic.serviceg25.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.mintic.serviceg25.entidades.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {

}
