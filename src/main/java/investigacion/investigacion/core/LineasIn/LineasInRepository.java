package investigacion.investigacion.core.LineasIn;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface LineasInRepository extends CrudRepository<LineasIn, Long> {

    List<LineasIn> findAll();

}