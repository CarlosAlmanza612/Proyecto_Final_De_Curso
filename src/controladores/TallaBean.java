package controladores;

import java.util.List;
import modelos.Talla;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Restrictions;

/**
 * Clase para gestionar las operaciones que realize la entidad Talla
 *
 * @author Carlos Halberth Almanza Lopez
 *
 */
public class TallaBean {
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
    * Metodo para guardar el objeto Talla en la BBDD 
    * @param Talla
     */
    public void guardarTalla(Talla talla) {
        iniciarOperacion();
        session.save(talla);
        terminarOperacion();
    }
    /*
     * Metodo para actualizar el objeto Talla en la BBDD 
    * @param Talla
     */
    public void actualizarTalla(Talla talla) {
        iniciarOperacion();
        session.update(talla);
        terminarOperacion();
    }
    /*
    * Metodo para eliminar fisicamente el objeto Talla en la BBDD 
    * @param Talla
     */
    public void eliminarTalla(Talla talla) {
        iniciarOperacion();
        session.delete(talla);
        terminarOperacion();
    }


    /*
     * Metodo para recoger el objeto Talla en la BBDD mediante un atributo de la clase
    * @param int
    * @return Talla
     */
    public Talla obtenerTalla(int id) {
        Talla object = null;
        iniciarOperacion();
        object = (Talla) session.get(Talla.class, id);
        terminarOperacion();
        return object;
    } 

    /*
    * Metodo para buscar si existe el objeto Talla en la BBDD
    * mediante el atributo nombre_talla de la clase.
    * @param String
    * @return Talla 
     */
    public Talla buscarTalla(String nombre_talla) {
        Talla user = null;
        iniciarOperacion();
        user = (Talla) session.createCriteria(Talla.class).add(Restrictions.eq("nombreTalla", nombre_talla)).uniqueResult();
        terminarOperacion();
        return user;
    }
    /*
    * Metodo para recoger todas las Tallas en una Lista de la tabla Talla en la BBDD
    * @return List 
     */
    public List listTallas() {
        List listObjects = null;
        iniciarOperacion();
        listObjects = session.createQuery("from Talla").list();
        terminarOperacion();
        return listObjects;
    }
}
