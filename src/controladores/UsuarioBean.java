package controladores;

import java.util.List;
import modelos.Usuario;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Restrictions;

/**
 * Clase para gestionar las operaciones que realize la entidad Usuario
 *
 * @author Carlos Halberth Almanza Lopez
 *
 */
public class UsuarioBean {
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
    * Metodo para guardar el objeto Usuario en la BBDD 
    * @param Usuario
     */
    public void guardarUsuario(Usuario usuario) {
        iniciarOperacion();
        session.save(usuario);
        terminarOperacion();
    }

    /*
     * Metodo para actualizar el objeto Usuario en la BBDD 
    * @param Usuario
     */
    public void actualizarUsuario(Usuario usuario) {
        iniciarOperacion();
        session.update(usuario);
        terminarOperacion();
    }

    /*
    * Metodo para eliminar fisicamente el objeto Usuario en la BBDD 
    * @param Usuario
     */
    public void eliminarUsuario(Usuario usuario) {
        iniciarOperacion();
        session.delete(usuario);
        terminarOperacion();
    }

    /*
    * Metodo para buscar si existe el objeto Usuario en la BBDD
    * mediante el atributo usuario de la clase.
    * @param String
    * @return Usuario 
     */
    public Usuario buscarUsuario(String usuario) {
        Usuario user = null;
        iniciarOperacion();
        user = (Usuario) session.createCriteria(Usuario.class).add(Restrictions.eq("usuario", usuario)).uniqueResult();
        terminarOperacion();
        return user;
    }

    /*
     * Metodo para recoger el objeto Usuario en la BBDD mediante un atributo de la clase
    * @param int
    * @return Usuario
     */
    public Usuario obtenerUsuario(int id) {
        Usuario object = null;
        iniciarOperacion();
        object = (Usuario) session.get(Usuario.class, id);
        terminarOperacion();
        return object;
    }

    /*
    * Metodo para recoger todos los Usuarios en una Lista de la tabla Usuario en la BBDD
    * @return List 
     */
    public List listUsuario() {
        List listObjects = null;
        iniciarOperacion();
        listObjects = session.createQuery("from Usuario").list();
        terminarOperacion();
        return listObjects;
    }

    /*
    * Metodo para recoger todos los Usuarios en una Lista de la tabla Usuario en la BBDD
    * que tenga el atributo nombre igual al recibido por parametro 
    * @param String
    * @return List 
     */
    public List listUsuario(String usuario) {
        List listObjects = null;
        iniciarOperacion();
        listObjects = session.createQuery("from Usuario where usuario= '" + usuario + "'").list();
        terminarOperacion();
        return listObjects;
    }
}
