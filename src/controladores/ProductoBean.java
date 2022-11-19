/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.util.List;
import modelos.Producto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author Usuario
 */
public class ProductoBean {

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

    public void guardarProducto(Producto producto) {
        iniciarOperacion();
        session.save(producto);
        terminarOperacion();
    }

    public void actualizarProducto(Producto producto) {
        iniciarOperacion();
        session.update(producto);
        terminarOperacion();
    }

    public void eliminarProducto(Producto producto) {
        iniciarOperacion();
        session.delete(producto);
        terminarOperacion();
    }

    public Producto obtenerProducto(int id) {
        Producto producto = null;
        iniciarOperacion();
        producto = (Producto) session.get(Producto.class, id);
        terminarOperacion();
        return producto;
    }

    public List listProducto() {
        iniciarOperacion();
        List listaProductos = (List<Producto>)session.createQuery("from Producto").list();
        terminarOperacion();
        return listaProductos;
    }

}
