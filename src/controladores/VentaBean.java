/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import modelos.Usuario;
import modelos.Venta;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Usuario
 */
public class VentaBean {

    private Session session;
    private final ZoneId defaultZoneId = ZoneId.systemDefault();
    LocalDate localDate = LocalDate.now();

    private void iniciarOperacion() {
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        session = sessionFactory.openSession();
        session.getTransaction().begin();
    }

    private void terminarOperacion() {
        session.getTransaction().commit();
        session.close();
    }

    public void guardarVenta(Venta venta) {
        iniciarOperacion();
        venta.setFecha(Date.from(localDate.atStartOfDay(defaultZoneId).toInstant()));
        session.save(venta);
        terminarOperacion();
    }

    public void eliminarVenta(Venta venta) {
        iniciarOperacion();
        session.delete(venta);
        terminarOperacion();
    }

    public Venta obtenerVenta(int id) {
        Venta object = null;
        iniciarOperacion();
        object = (Venta) session.get(Venta.class, id);
        terminarOperacion();
        return object;
    }

    public List listVenta() {
        List listObjects = null;
        iniciarOperacion();
        listObjects = session.createQuery("from Venta").list();
        terminarOperacion();
        return listObjects;
    }

    public List listVenta(Date consulta) {
        List listObjects = null;
        iniciarOperacion();
        listObjects = session.createQuery("from Venta where fecha='" + consulta + "'").list();
        terminarOperacion();
        return listObjects;
    }

    public List listVentaProducto(int codProducto) {
        List listObjects = null;
        iniciarOperacion();
        listObjects = session.createQuery("from Venta where cod_producto='" + codProducto + "'").list();
        terminarOperacion();
        return listObjects;
    }

    public List listVentaCliente(int codCliente) {
        List listObjects = null;
        iniciarOperacion();
        listObjects = session.createQuery("from Venta where cod_cliente='" + codCliente + "'").list();
        terminarOperacion();
        return listObjects;
    }

}
