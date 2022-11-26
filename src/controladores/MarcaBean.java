package controladores;

import java.util.List;
import modelos.Marca;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Restrictions;

/**
 * Clase para gestionar las operaciones que realize la entidad Marca
 *
 * @author Carlos Halberth Almanza Lopez
 *
 */
public class MarcaBean {

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
    * Metodo para guardar el objeto Marca en la BBDD 
    * @param Marca
     */
    public void guardarMarca(Marca marca) {
        iniciarOperacion();
        session.save(marca);
        terminarOperacion();
    }

    /*
     * Metodo para actualizar el objeto Marca en la BBDD 
    * @param Marca
     */
    public void actualizarMarca(Marca marca) {
        iniciarOperacion();
        session.update(marca);
        terminarOperacion();
    }

    /*
    * Metodo para eliminar fisicamente el objeto Marca en la BBDD 
    * @param Marca
     */
    public void eliminarMarca(Marca marca) {
        iniciarOperacion();
        session.delete(marca);
        terminarOperacion();
    }


    /*
     * Metodo para recoger el objeto Marca en la BBDD mediante un atributo de la clase
    * @param int
    * @return Marca
     */
    public Marca obtenerMarca(int id) {
        Marca object = null;
        iniciarOperacion();
        object = (Marca) session.get(Marca.class, id);
        terminarOperacion();
        return object;
    }

    /*
    * Metodo para buscar si existe el objeto Marca en la BBDD
    * mediante el atributo nombre de la clase.
    * @param String
    * @return Marca 
     */
    public Marca buscarMarca(String nombre_Marca) {
        Marca marc = null;
        iniciarOperacion();
        marc = (Marca) session.createCriteria(Marca.class).add(Restrictions.eq("nombreMarca", nombre_Marca)).uniqueResult();
        terminarOperacion();
        return marc;
    }

    /*
    * Metodo para recoger todas las marcas de la tabla Marca en la BBDD
    * en una Lista
    * @return List 
     */
    public List listMarca() {
        List listObjects = null;
        iniciarOperacion();
        listObjects = session.createQuery("from Marca").list();
        terminarOperacion();
        return listObjects;
    }
}
