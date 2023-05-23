package investigacion.investigacion.core.LineasIn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LineasInService {

    // Atributos: Delimitador de acceso, Tipo de dato, Nombre del atributo
    @Autowired
    private LineasInRepository lineasInRepository;

    // CRUD

    // CREAR
    // Metod: Delimitador de acceso, Tipo de dato que retorna, nombre del metodo /
    // funcion { instrucciones / sentencias }
    public LineasIn save(LineasIn entity) {
        return lineasInRepository.save(entity);
    }

    // Read
    public LineasIn findById(long id) {
        return lineasInRepository.findById(id).orElse(null);
    }

    public void deleteById(long id) {
        lineasInRepository.deleteById(id);
    }

    public List<LineasIn> findAll() {
        return lineasInRepository.findAll();
    }

}
