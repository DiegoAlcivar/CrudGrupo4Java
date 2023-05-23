package investigacion.investigacion.core.ActividadIn;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ActividadInRepository extends CrudRepository<ActividadIn, Long> {

    List<ActividadIn> findAll();

}
