package controladores;

import java.util.List;
import modelos.Producto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * Clase para gestionar las operaciones que realize la entidad Producto
 *
 * @author Carlos Halberth Almanza Lopez
 *
 */
public class ProductoBean {

    /*
    * Objeto Session 
     */
    private Session session;

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
    * Metodo para guardar el objeto Producto en la BBDD 
    * @param Producto
     */
    public void guardarProducto(Producto producto) {
        iniciarOperacion();
        session.save(producto);
        terminarOperacion();
    }

    /*
     * Metodo para actualizar el objeto Producto en la BBDD 
    * @param Producto
     */
    public void actualizarProducto(Producto producto) {
        iniciarOperacion();
        session.update(producto);
        terminarOperacion();
    }
    /*
    * Metodo para eliminar fisicamente el objeto Producto en la BBDD 
    * @param Producto
     */
    public void eliminarProducto(Producto producto) {
        iniciarOperacion();
        session.delete(producto);
        terminarOperacion();
    }
    /*
     * Metodo para recoger el objeto Producto en la BBDD mediante un atributo de la clase
    * @param int
    * @return Producto
     */
    public Producto obtenerProducto(int id) {
        Producto producto = null;
        iniciarOperacion();
        producto = (Producto) session.get(Producto.class, id);
        terminarOperacion();
        return producto;
    }
    /*
    * Metodo para recoger todos los Productos en una Lista de la tabla Producto en la BBDD
    * @return List 
     */
    public List listProducto() {
        iniciarOperacion();
        List listaProductos = (List<Producto>) session.createQuery("from Producto").list();
        terminarOperacion();
        return listaProductos;
    }
    /*
    * Metodo para recoger todos los Productos en una Lista de la tabla Producto en la BBDD
    * que tenga el atributo nombre igual al recibido por parametro 
    * @param String
    * @return List 
     */
    public List listProducto(String nombre) {
        List listProducto = null;
        iniciarOperacion();
        listProducto = session.createQuery("from Producto where nombre= '" + nombre + "'").list();
        terminarOperacion();
        return listProducto;
    }
}
