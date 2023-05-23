package investigacion.investigacion.core.ProgramaIn;

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
@RequestMapping("api/programaIn")
@CrossOrigin({ "*" })
public class ProgramaInController {

    @Autowired
    private ProgramaInService programaInService;

    // CREAR
    // Decoradores (Anotaciones)
    // Metod: Delimitador de acceso, Tipo de dato que retorna, nombre del metodo /
    // funcion
    @PostMapping("/")
    public ProgramaIn save(@RequestBody ProgramaIn entity) {
        return programaInService.save(entity);

    }

    @GetMapping("/{id}/")
    public ProgramaIn findById(@PathVariable long id) {
        return programaInService.findById(id);
    }

    @GetMapping("/")
    public List<ProgramaIn> findAll() {
        return programaInService.findAll();
    }

    @PutMapping("/")
    public ProgramaIn update(@RequestBody ProgramaIn entity) {
        return programaInService.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable long id) {
        programaInService.deleteById(id);
    }

}
