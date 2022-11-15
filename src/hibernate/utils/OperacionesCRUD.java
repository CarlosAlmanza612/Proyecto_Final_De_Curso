/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.utils;

import modelos.Cliente;
import modelos.Marca;
import modelos.Producto;
import modelos.Talla;
import modelos.Usuario;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Restrictions;

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



    public Producto obtenerProducto(int id) {
        Producto object = null;
        iniciarOperacion();
        object = (Producto) session.get(Producto.class, id);
        terminarOperacion();
        return object;
    }



    public List<Marca> listMarca() {
        List<Marca> listMarca = null;
        iniciarOperacion();
        listMarca = session.createQuery("from Marca").list();
        terminarOperacion();
        return listMarca;
    }

    public List<Producto> listProducto() {
        List<Producto> listProducto = null;
        iniciarOperacion();
        listProducto = session.createQuery("from Producto").list();
        terminarOperacion();
        return listProducto;
    }

    public List<Talla> listTalla() {
        List<Talla> listObjects = null;
        iniciarOperacion();
        listObjects = session.createQuery(" from Talla").list();
        terminarOperacion();
        return listObjects;
    }

    public List<Cliente> listCliente() {
        List<Cliente> listCliente = null;
        iniciarOperacion();
        listCliente = session.createQuery("from Cliente").list();
        terminarOperacion();
        return listCliente;
    }
}
