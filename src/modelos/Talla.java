package modelos;

import java.util.HashSet;
import java.util.Set;

/**
 * Clase Talla implementa Serializable, contiene constructores , propiedades con
 * sus getters y setters para poder realizar las operaciones y poder trabajar
 * con la tabla Cliente de la BBDD
 * @author Carlos Halberth Almanza Lopez 
 */
public class Talla implements java.io.Serializable {

    /*
*   Propiedades
     */
    private Integer idTalla;
    private String nombreTalla;
    private Boolean disponible = true;
    private Set productos = new HashSet(0);

    /*
*   Constructores
     */
    public Talla() {
    }

    public Talla(String nombreTalla) {
        this.nombreTalla = nombreTalla;
    }

    public Talla(String nombreTalla, Boolean disponible, Set productos) {
        this.nombreTalla = nombreTalla;
        this.disponible = disponible;
        this.productos = productos;
    }

    /*
*   Getters & Setters
     */
    public Integer getIdTalla() {
        return this.idTalla;
    }

    public void setIdTalla(Integer idTalla) {
        this.idTalla = idTalla;
    }

    public String getNombreTalla() {
        return this.nombreTalla;
    }

    public void setNombreTalla(String nombreTalla) {
        this.nombreTalla = nombreTalla;
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
