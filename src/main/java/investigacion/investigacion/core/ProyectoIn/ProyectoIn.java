package investigacion.investigacion.core.ProyectoIn;

import investigacion.investigacion.core.LineasIn.LineasIn;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class ProyectoIn {

    // Atributos: Delimitador de acceso, Tipo de dato, Nombre del atributo
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String titulo;
    private String carrera;
    private String descripcion;

    @ManyToOne
    private LineasIn lineasIn;

}