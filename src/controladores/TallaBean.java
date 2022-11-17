/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.util.List;
import modelos.Talla;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Usuario
 */
public class TallaBean {

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

    public void guardarTalla(Talla talla) {
        iniciarOperacion();
        session.save(talla);
        terminarOperacion();
    }

    public void actualizarTalla(Talla talla) {
        iniciarOperacion();
        session.update(talla);
        terminarOperacion();
    }

    public void eliminarTalla(Talla talla) {
        iniciarOperacion();
        session.delete(talla);
        terminarOperacion();
    }



    public Talla obtenerTalla(int id) {
        Talla object = null;
        iniciarOperacion();
        object = (Talla) session.get(Talla.class, id);
        terminarOperacion();
        return object;
    }
    public Talla buscarTalla(String nombre_talla) {
        Talla user = null;
        iniciarOperacion();
        user = (Talla) session.createCriteria(Talla.class).add(Restrictions.eq("nombreTalla", nombre_talla)).uniqueResult();
        terminarOperacion();
        return user;
    }

    public List<Talla> listTallas() {
        List<Talla> listObjects = null;
        iniciarOperacion();
        listObjects = session.createQuery("from Talla").list();
        terminarOperacion();
        return listObjects;
    }
}
