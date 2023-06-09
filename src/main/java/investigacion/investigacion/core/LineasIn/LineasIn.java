package investigacion.investigacion.core.LineasIn;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class LineasIn {

    // Atributos: Delimitador de acceso, Tipo de dato, Nombre del atributo
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String titulo;
    private String responsable;

}