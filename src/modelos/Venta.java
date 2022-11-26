package modelos;

import java.util.Date;

/**
 * Clase Venta implementa Serializable, contiene constructores , propiedades con
 * sus getters y setters para poder realizar las operaciones y poder trabajar
 * con la tabla Cliente de la BBDD
 * @author Carlos Halberth Almanza Lopez 
 */
public class Venta implements java.io.Serializable {

    /*
*   Propiedades
     */
    private Integer codVenta;
    private Cliente cliente;
    private Producto producto;
    private Date fecha;
    private Boolean online;
    private String ciudad;
    private Integer costoDeEnvio;
    private Boolean estado;

    /*
*   Constructores
     */
    public Venta() {
    }

    public Venta(Producto producto) {
        this.producto = producto;
    }

    public Venta(Producto producto, Cliente cliente) {
        this.producto = producto;
        this.cliente = cliente;
    }

    public Venta(Cliente cliente, Producto producto, Boolean online, String ciudad, Integer costoDeEnvio) {
        this.cliente = cliente;
        this.producto = producto;
        this.online = online;
        this.ciudad = ciudad;
        this.costoDeEnvio = costoDeEnvio;
    }
    /*
*   Getters & Setters
     */
    public Integer getCodVenta() {
        return this.codVenta;
    }

    public void setCodVenta(Integer codVenta) {
        this.codVenta = codVenta;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto getProducto() {
        return this.producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Boolean getOnline() {
        return this.online;
    }

    public void setOnline(Boolean online) {
        this.online = online;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getCostoDeEnvio() {
        return this.costoDeEnvio;
    }

    public void setCostoDeEnvio(Integer costoDeEnvio) {
        this.costoDeEnvio = costoDeEnvio;
    }

    public Boolean getEstado() {
        return this.estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

}
