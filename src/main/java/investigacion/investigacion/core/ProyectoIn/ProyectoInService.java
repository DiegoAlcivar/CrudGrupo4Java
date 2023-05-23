package investigacion.investigacion.core.ProyectoIn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoInService {

    // Atributos: Delimitador de acceso, Tipo de dato, Nombre del atributo
    @Autowired
    private ProyectoInRepository proyectoInRepository;

    // CRUD

    // CREAR
    // Metod: Delimitador de acceso, Tipo de dato que retorna, nombre del metodo /
    // funcion { instrucciones / sentencias }
    public ProyectoIn save(ProyectoIn entity) {
        return proyectoInRepository.save(entity);
    }

    // Read
    public ProyectoIn findById(long id) {
        return proyectoInRepository.findById(id).orElse(null);
    }

    public void deleteById(long id) {
        proyectoInRepository.deleteById(id);
    }

    public List<ProyectoIn> findAll() {
        return proyectoInRepository.findAll();
    }

}
