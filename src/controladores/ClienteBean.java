/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.util.List;
import modelos.Cliente;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author Usuario
 */
public class ClienteBean {

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

    public void guardarCliente(Cliente cliente) {
        iniciarOperacion();
        session.save(cliente);
        terminarOperacion();
    }

    public void actualizarCliente(Cliente cliente) {
        iniciarOperacion();
        session.update(cliente);
        terminarOperacion();
    }

    public void eliminarCliente(Cliente cliente) {
        iniciarOperacion();
        session.delete(cliente);
        terminarOperacion();
    }



    public Cliente obtenerCliente(int id) {
        Cliente cliente = null;
        iniciarOperacion();
        cliente = (Cliente) session.get(Cliente.class, id);
        terminarOperacion();
        return cliente;
    }

    public List listCliente() {
        List listClientes = null;
        iniciarOperacion();
        listClientes = session.createQuery("from Cliente").list();
        terminarOperacion();
        return listClientes;
    }
}
