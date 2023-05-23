package investigacion.investigacion.core.ProyectoIn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/proyectoIn")
@CrossOrigin({ "*" })
public class ProyectoInController {

    @Autowired
    private ProyectoInService proyectoInService;

    // CREAR
    // Decoradores (Anotaciones)
    // Metod: Delimitador de acceso, Tipo de dato que retorna, nombre del metodo /
    // funcion
    @PostMapping("/")
    public ProyectoIn save(@RequestBody ProyectoIn entity) {
        return proyectoInService.save(entity);

    }

    @GetMapping("/{id}/")
    public ProyectoIn findById(@PathVariable long id) {
        return proyectoInService.findById(id);
    }

    @GetMapping("/")
    public List<ProyectoIn> findAll() {
        return proyectoInService.findAll();
    }

    @PutMapping("/")
    public ProyectoIn update(@RequestBody ProyectoIn entity) {
        return proyectoInService.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable long id) {
        proyectoInService.deleteById(id);
    }

}