package edu.mintic.serviceg25.controladores;

import edu.mintic.serviceg25.entidades.Empleado;
import edu.mintic.serviceg25.excepciones.EmpleadoNoEncontradoException;
import edu.mintic.serviceg25.repositorios.EmpleadoRepository;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpleadoController {

    private final EmpleadoRepository repository;

    public EmpleadoController(EmpleadoRepository repository) {
        this.repository = repository;
    }

    //leer
    @GetMapping("/empleados")
    public List<Empleado> listaEmpleados() {
        return repository.findAll();
    }
    
    @GetMapping("/empleados/{idEmpleado}")
    public Empleado getEmpleado(@PathVariable Long idEmpleado) {
        return repository.findById(idEmpleado).orElseThrow( () ->{
            return new EmpleadoNoEncontradoException(idEmpleado);
        });
    }

    //crear
    @PostMapping("/empleados")
    public Empleado crearEmpleado(@RequestBody Empleado empleado) {
        return repository.save(empleado);
    }

    //actualizar
    @PutMapping("/empleados/{idEmpleado}")
    public Empleado actualizarEmpleado(@RequestBody Empleado nuevoEmpleado,
            @PathVariable Long idEmpleado) {
        return repository.findById(idEmpleado)
                .map(empleado -> {
                    empleado.setNombre(nuevoEmpleado.getNombre());
                    empleado.setCargo(nuevoEmpleado.getCargo());
                    return repository.save(empleado);
                }).orElseGet(() -> {
            nuevoEmpleado.setIdEmpleado(idEmpleado);
            return repository.save(nuevoEmpleado);
        });
    }
    
    

}
