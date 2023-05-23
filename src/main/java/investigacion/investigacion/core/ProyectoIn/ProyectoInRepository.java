package investigacion.investigacion.core.ProyectoIn;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ProyectoInRepository extends CrudRepository<ProyectoIn, Long> {

    List<ProyectoIn> findAll();

}