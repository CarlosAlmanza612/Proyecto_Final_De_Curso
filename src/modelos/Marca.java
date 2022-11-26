package modelos;

import java.util.HashSet;
import java.util.Set;

/**
 * Clase Marca implementa Serializable, contiene constructores , propiedades con
 * sus getters y setters para poder realizar las operaciones y poder trabajar
 * con la tabla Cliente de la BBDD
 * @author Carlos Halberth Almanza Lopez 
 */
public class Marca implements java.io.Serializable {

    /*
*   Propiedades
     */
    private Integer idMarca;
    private String nombreMarca;
    private Boolean disponible = true;
    private Set productos = new HashSet(0);

    /*
*   Constructores
     */
    public Marca() {
    }

    public Marca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }

    public Marca(String nombreMarca, Boolean disponible, Set productos) {
        this.nombreMarca = nombreMarca;
        this.disponible = disponible;
        this.productos = productos;
    }

    /*
*   Getters & Setters
     */
    public Integer getIdMarca() {
        return this.idMarca;
    }

    public void setIdMarca(Integer idMarca) {
        this.idMarca = idMarca;
    }

    public String getNombreMarca() {
        return this.nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }

    public Boolean getDisponible() {
        return this.disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    public Set getProductos() {
        return this.productos;
    }

    public void setProductos(Set productos) {
        this.productos = productos;
    }

}
