package controladores;

import java.util.List;
import modelos.Cliente;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * Clase para gestionar las operaciones que realize la entidad Cliente
 *
 * @author Carlos Halberth Almanza Lopez
 *
 */
public class ClienteBean {

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
    * Metodo para guardar el objeto Cliente en la BBDD 
    * @param Cliente
     */
    public void guardarCliente(Cliente cliente) {
        iniciarOperacion();
        session.save(cliente);
        terminarOperacion();
    }

    /*
     * Metodo para actualizar el objeto Cliente en la BBDD 
    * @param Cliente
     */
    public void actualizarCliente(Cliente cliente) {
        iniciarOperacion();
        session.update(cliente);
        terminarOperacion();
    }

    /*
    * Metodo para eliminar fisicamente el objeto Cliente en la BBDD 
    * @param Cliente
     */
    public void eliminarCliente(Cliente cliente) {
        iniciarOperacion();
        session.delete(cliente);
        terminarOperacion();
    }

    /*
     * Metodo para recoger el objeto Cliente en la BBDD mediante un atributo de la clase
    * @param int
    * @return Cliente
     */
    public Cliente obtenerCliente(int id) {
        Cliente cliente = null;
        iniciarOperacion();
        cliente = (Cliente) session.get(Cliente.class, id);
        terminarOperacion();
        return cliente;
    }

    /*
    * Metodo para verificar si existe el objeto Cliente en la BBDD
    * mediante un atributo de la clase
    * @param int
    * @return Boolean 
     */
    public boolean verificarCliente(int id) {
        iniciarOperacion();
        Cliente cliente = null;
        cliente = (Cliente) session.get(Cliente.class, id);
        if (cliente != null) {
            terminarOperacion();
            return true;
        } else {
            terminarOperacion();
            return false;
        }

    }

    /*
    * Metodo para recoger todos los clientes de la tabla Cliente en la BBDD
    * en una Lista
    * @return List 
     */
    public List listCliente() {
        List listClientes = null;
        iniciarOperacion();
        listClientes = session.createQuery("from Cliente").list();
        terminarOperacion();
        return listClientes;
    }

    /*
    * Metodo para recoger todos los clientes de la tabla Cliente en la BBDD
    * en una Lista que tengan el atributo nombre igual al que recibe por parametro
    * @param String
    * @return List 
     */
    public List listCliente(String nombre) {
        List listClientes = null;
        iniciarOperacion();
        listClientes = session.createQuery("from Cliente where nombre= '" + nombre + "'").list();
        terminarOperacion();
        return listClientes;
    }
}
