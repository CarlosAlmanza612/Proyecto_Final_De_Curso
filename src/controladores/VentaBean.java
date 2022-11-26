package controladores;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import modelos.Venta;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * Clase para gestionar las operaciones que realize la entidad Venta
 *
 * @author Carlos Halberth Almanza Lopez
 *
 */
public class VentaBean {

    /*
    * Objeto Session 
     */
    private Session session;
    /*
    * Objeto ZoneId
     */
    private final ZoneId defaultZoneId = ZoneId.systemDefault();
    /*
    * Objeto LocalDate 
     */
    private LocalDate localDate = LocalDate.now();

    /*
    * Metodo para iniciar una operacion en la BBDD 
     */
    private void iniciarOperacion() {
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        session = sessionFactory.openSession();
        session.getTransaction().begin();
    }

    /*
    * Metodo para finalizar una operacion en la BBDD  y cerrar la conexion
     */
    private void terminarOperacion() {
        session.getTransaction().commit();
        session.close();
    }

    /*
    * Metodo para guardar el objeto Venta en la BBDD 
    * utiliza el objeto ZoneId con el objeto Localdate para setear la fecha en la venta a guardar
    * @param Venta
     */
    public void guardarVenta(Venta venta) {
        iniciarOperacion();
        venta.setFecha(Date.from(localDate.atStartOfDay(defaultZoneId).toInstant()));
        session.save(venta);
        terminarOperacion();
    }

    /*
    * Metodo para eliminar fisicamente el objeto Venta en la BBDD 
    * @param Venta
     */
    public void eliminarVenta(Venta venta) {
        iniciarOperacion();
        session.delete(venta);
        terminarOperacion();
    }

    /*
     * Metodo para recoger el objeto Venta en la BBDD mediante un atributo de la clase
    * @param int
    * @return Venta
     */
    public Venta obtenerVenta(int id) {
        Venta object = null;
        iniciarOperacion();
        object = (Venta) session.get(Venta.class, id);
        terminarOperacion();
        return object;
    }

    /*
    * Metodo para recoger todas las Ventas en una Lista de la tabla Venta en la BBDD
    * @return List 
     */
    public List listVenta() {
        List listObjects = null;
        iniciarOperacion();
        listObjects = session.createQuery("from Venta").list();
        terminarOperacion();
        return listObjects;
    }

    /*
    * Metodo para recoger todas las Ventas en una Lista de la tabla Venta en la BBDD
    * que tenga el atributo Date igual al recibido por parametro 
    * @param Date
    * @return List 
     */
    public List listVenta(Date consulta) {
        List listObjects = null;
        iniciarOperacion();
        listObjects = session.createQuery("from Venta where fecha='" + consulta + "'").list();
        terminarOperacion();
        return listObjects;
    }

    /*
    * Metodo para recoger todas las Ventas en una Lista de la tabla Venta en la BBDD
    * que tenga el atributo codProducto igual al recibido por parametro 
    * @param int
    * @return List 
     */
    public List listVentaProducto(int codProducto) {
        List listObjects = null;
        iniciarOperacion();
        listObjects = session.createQuery("from Venta where cod_producto='" + codProducto + "'").list();
        terminarOperacion();
        return listObjects;
    }

    /*
    * Metodo para recoger todas las Ventas en una Lista de la tabla Venta en la BBDD
    * que tenga el atributo codCliente igual al recibido por parametro 
    * @param int
    * @return List 
     */
    public List listVentaCliente(int codCliente) {
        List listObjects = null;
        iniciarOperacion();
        listObjects = session.createQuery("from Venta where cod_cliente='" + codCliente + "'").list();
        terminarOperacion();
        return listObjects;
    }

}
