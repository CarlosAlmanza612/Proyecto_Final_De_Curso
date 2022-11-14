/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.utils;

import entidades.Talla;
import entidades.Usuario;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author Usuario
 */
public class OperacionesCRUD {

    private Session session;

    private void iniciarOperacion() {
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        session = sessionFactory.openSession();
        session.getTransaction().begin();
    }

    private void terminarOperacion() {
        session.getTransaction().commit();
        session.close();
    }

    public int guardarObject(Object object) {
        int id = 0;
        iniciarOperacion();
        id = (int) session.save(object);
        terminarOperacion();
        return id;
    }

    public void actualizarObject(Object object) {
        iniciarOperacion();
        session.update(object);
        terminarOperacion();
    }

    public void eliminarObject(Object object) {
        iniciarOperacion();
        session.delete(object);
        terminarOperacion();
    }

    public Usuario obtenerObject(int id) {
        Usuario object = null;
        iniciarOperacion();
        object = (Usuario)session.get(Usuario.class, id);
        terminarOperacion();
        return object;
    }
 
    public List<Usuario> listUsuario() {
        
        List<Usuario> listObjects = null;
        iniciarOperacion();
        listObjects = session.createQuery("from Usuario").list();
        terminarOperacion();
        return listObjects;
    }
    
    public List<Talla> listTalla() {
        
        List<Talla> listObjects = null;
        iniciarOperacion();
        listObjects = session.createQuery(" from Talla").list();
        terminarOperacion();
        return listObjects;
    }

}
