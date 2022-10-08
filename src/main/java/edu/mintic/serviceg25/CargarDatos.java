package edu.mintic.serviceg25;

import edu.mintic.serviceg25.entidades.Empleado;
import edu.mintic.serviceg25.repositorios.EmpleadoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CargarDatos {

    private static final Logger log = LoggerFactory.getLogger(CargarDatos.class);

    @Bean
    public CommandLineRunner inicializarBD(EmpleadoRepository repository) {

        return (args) -> {
            /*log.info("registrando " + repository.save(new Empleado("adriana lucia", "maestra")));
            log.info("registrando " + repository.save(new Empleado("jose alfredo", "coordinador")));
            log.info("registrando " + repository.save(new Empleado("geraldine", "supervisora")));
             */
        };

    }

}
