package investigacion.investigacion.core.ActividadIn;

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
@RequestMapping("api/actividadIn")
@CrossOrigin({ "*" })
public class ActividadInController {

    @Autowired
    private ActividadInService actividadInService;

    // CREAR
    // Decoradores (Anotaciones)
    // Metod: Delimitador de acceso, Tipo de dato que retorna, nombre del metodo /
    // funcion
    @PostMapping("/")
    public ActividadIn save(@RequestBody ActividadIn entity) {
        return actividadInService.save(entity);

    }

    @GetMapping("/{id}/")
    public ActividadIn findById(@PathVariable long id) {
        return actividadInService.findById(id);
    }

    @GetMapping("/")
    public List<ActividadIn> findAll() {
        return actividadInService.findAll();
    }

    @PutMapping("/")
    public ActividadIn update(@RequestBody ActividadIn entity) {
        return actividadInService.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable long id) {
        actividadInService.deleteById(id);
    }

}
