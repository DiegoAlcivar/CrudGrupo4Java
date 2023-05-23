package investigacion.investigacion.core.ProgramaIn;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ProgramaInRepository extends CrudRepository<ProgramaIn, Long> {

    List<ProgramaIn> findAll();

}