package investigacion.investigacion.core.LineasIn;

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
@RequestMapping("api/lineasIn")
@CrossOrigin({ "*" })
public class LineasInController {

    @Autowired
    private LineasInService lineasInService;

    // CREAR
    // Decoradores (Anotaciones)
    // Metod: Delimitador de acceso, Tipo de dato que retorna, nombre del metodo /
    // funcion
    @PostMapping("/")
    public LineasIn save(@RequestBody LineasIn entity) {
        return lineasInService.save(entity);

    }

    @GetMapping("/{id}/")
    public LineasIn findById(@PathVariable long id) {
        return lineasInService.findById(id);
    }

    @GetMapping("/")
    public List<LineasIn> findAll() {
        return lineasInService.findAll();
    }

    @PutMapping("/")
    public LineasIn update(@RequestBody LineasIn entity) {
        return lineasInService.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable long id) {
        lineasInService.deleteById(id);
    }

}
