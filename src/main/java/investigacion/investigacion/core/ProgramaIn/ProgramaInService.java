package investigacion.investigacion.core.ProgramaIn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgramaInService {

    // Atributos: Delimitador de acceso, Tipo de dato, Nombre del atributo
    @Autowired
    private ProgramaInRepository programaInRepository;

    // CRUD

    // CREAR
    // Metod: Delimitador de acceso, Tipo de dato que retorna, nombre del metodo /
    // funcion { instrucciones / sentencias }
    public ProgramaIn save(ProgramaIn entity) {
        return programaInRepository.save(entity);
    }

    // Read
    public ProgramaIn findById(long id) {
        return programaInRepository.findById(id).orElse(null);
    }

    public void deleteById(long id) {
        programaInRepository.deleteById(id);
    }

    public List<ProgramaIn> findAll() {
        return programaInRepository.findAll();
    }

}
