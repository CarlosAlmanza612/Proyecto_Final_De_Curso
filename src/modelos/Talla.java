package modelos;
// Generated 19-nov-2022 22:23:16 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Talla generated by hbm2java
 */
public class Talla  implements java.io.Serializable {


     private Integer idTalla;
     private String nombreTalla;
     private Boolean disponible=true;
     private Set productos = new HashSet(0);

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


