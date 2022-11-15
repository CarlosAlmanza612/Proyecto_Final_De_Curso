/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.util.List;
import modelos.Marca;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author Usuario
 */
public class MarcaBean {

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

    public void guardarMarca(Marca marca) {
        iniciarOperacion();
        session.save(marca);
        terminarOperacion();
    }

    public void actualizarMarca(Marca marca) {
        iniciarOperacion();
        session.update(marca);
        terminarOperacion();
    }

    public void eliminarMarca(Marca marca) {
        iniciarOperacion();
        session.delete(marca);
        terminarOperacion();
    }



    public Marca obtenerUsuario(int id) {
        Marca object = null;
        iniciarOperacion();
        object = (Marca) session.get(Marca.class, id);
        terminarOperacion();
        return object;
    }

    public List<Marca> listUsuario() {
        List<Marca> listObjects = null;
        iniciarOperacion();
        listObjects = session.createQuery("from Marca").list();
        terminarOperacion();
        return listObjects;
    }
}
