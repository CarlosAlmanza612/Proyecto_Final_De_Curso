package modelos;

import java.util.HashSet;
import java.util.Set;

/**
 * Clase Cliente implementa Serializable, contiene constructores , propiedades
 * con sus getters y setters para poder realizar las operaciones y poder
 * trabajar con la tabla Cliente de la BBDD
 * @author Carlos Halberth Almanza Lopez
 */
public class Cliente implements java.io.Serializable {

    /*
*   Propiedades
     */
    private Integer codCliente;
    private String nombre;
    private String apellidos;
    private Integer telefono;
    private String ciudad;
    private Boolean disponible = true;
    private Set ventas = new HashSet(0);

    /*
*   Constructores
     */
    public Cliente() {
    }

    public Cliente(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;

    }

    public Cliente(String nombre, String apellidos, Integer telefono, String ciudad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.ciudad = ciudad;
    }

    /*
*   Getters & Setters
     */
    public Integer getCodCliente() {
        return this.codCliente;
    }

    public void setCodCliente(Integer codCliente) {
        this.codCliente = codCliente;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getTelefono() {
        return this.telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Boolean getDisponible() {
        return this.disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    public Set getVentas() {
        return this.ventas;
    }

    public void setVentas(Set ventas) {
        this.ventas = ventas;
    }

}
