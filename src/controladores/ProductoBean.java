/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import modelos.Marca;
import modelos.Producto;
import modelos.Talla;
import modelos.Usuario;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Restrictions;

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

    public List<Producto> listProducto() {
        iniciarOperacion();
        List<Producto> listaProductos = (List<Producto>)session.createQuery("from Producto").list();
        terminarOperacion();
        return listaProductos;
    }
    public ArrayList listProducto2() {
        iniciarOperacion();
        ArrayList lista=new ArrayList();
        List listaProductos = session.createQuery("from Producto").list();
        for (Iterator iterator = listaProductos.iterator(); iterator.hasNext();){
           Producto p= (Producto) iterator.next();
           Talla t= p.getTalla();
           Marca m=p.getMarca();
           lista.add(p.getCodigo());
           lista.add(p.getNombre());           
           lista.add(t.getNombreTalla());
           lista.add(m.getNombreMarca());
           lista.add(p.getPrecioDeVenta());
       }
        terminarOperacion();
        return lista;
    }
    
}
