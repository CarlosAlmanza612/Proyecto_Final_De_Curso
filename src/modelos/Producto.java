package modelos;

import java.util.HashSet;
import java.util.Set;

/**
 * Clase Producto implementa Serializable, contiene constructores , propiedades
 * con sus getters y setters para poder realizar las operaciones y poder
 * trabajar con la tabla Cliente de la BBDD
 * @author Carlos Halberth Almanza Lopez 
 */
public class Producto implements java.io.Serializable {

    /*
*   Propiedades
     */
    private Integer codigo;
    private Marca marca;
    private Talla talla;
    private String nombre;
    private Double costoDeCompra;
    private Double peso;
    private Double costoDelPeso;
    private Double costoTotal;
    private Double precioDeVenta;
    private Double tipoDeCambio;
    private Boolean disponible;
    private Set ventas = new HashSet(0);

    /*
*   Constructores
     */
    public Producto() {
    }

    public Producto(Marca marca, Talla talla, String nombre, Double costoDeCompra, Double peso, Double costoDelPeso, Double costoTotal, Double precioDeVenta, Double tipoDeCambio, Boolean disponible) {
        this.marca = marca;
        this.talla = talla;
        this.nombre = nombre;
        this.costoDeCompra = costoDeCompra;
        this.peso = peso;
        this.costoDelPeso = costoDelPeso;
        this.costoTotal = costoTotal;
        this.precioDeVenta = precioDeVenta;
        this.tipoDeCambio = tipoDeCambio;
        this.disponible = disponible;
    }

    /*
*   Getters & Setters
     */
    public Integer getCodigo() {
        return this.codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Marca getMarca() {
        return this.marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Talla getTalla() {
        return this.talla;
    }

    public void setTalla(Talla talla) {
        this.talla = talla;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getCostoDeCompra() {
        return this.costoDeCompra;
    }

    public void setCostoDeCompra(Double costoDeCompra) {
        this.costoDeCompra = costoDeCompra;
    }

    public Double getPeso() {
        return this.peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getCostoDelPeso() {
        return this.costoDelPeso;
    }

    public void setCostoDelPeso(Double costoDelPeso) {
        this.costoDelPeso = costoDelPeso;
    }

    public Double getCostoTotal() {
        return this.costoTotal;
    }

    public void setCostoTotal(Double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public Double getPrecioDeVenta() {
        return this.precioDeVenta;
    }

    public void setPrecioDeVenta(Double precioDeVenta) {
        this.precioDeVenta = precioDeVenta;
    }

    public Double getTipoDeCambio() {
        return this.tipoDeCambio;
    }

    public void setTipoDeCambio(Double tipoDeCambio) {
        this.tipoDeCambio = tipoDeCambio;
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
