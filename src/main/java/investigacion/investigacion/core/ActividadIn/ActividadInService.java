package investigacion.investigacion.core.ActividadIn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActividadInService {

    // Atributos: Delimitador de acceso, Tipo de dato, Nombre del atributo
    @Autowired
    private ActividadInRepository actividadInRepository;

    // CRUD

    // CREAR
    // Metod: Delimitador de acceso, Tipo de dato que retorna, nombre del metodo /
    // funcion { instrucciones / sentencias }
    public ActividadIn save(ActividadIn entity) {
        return actividadInRepository.save(entity);
    }

    // Read
    public ActividadIn findById(long id) {
        return actividadInRepository.findById(id).orElse(null);
    }

    public void deleteById(long id) {
        actividadInRepository.deleteById(id);
    }

    public List<ActividadIn> findAll() {
        return actividadInRepository.findAll();
    }

}
