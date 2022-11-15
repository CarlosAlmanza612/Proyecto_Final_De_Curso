/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.util.List;
import javax.swing.JOptionPane;
import modelos.Producto;
import modelos.Usuario;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Usuario
 */
public class UsuarioBean {

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

    public void guardarUsuario(Usuario usuario) {
        iniciarOperacion();
        session.save(usuario);
        terminarOperacion();
    }

    public void actualizarUsuario(Usuario usuario) {
        iniciarOperacion();
        session.update(usuario);
        terminarOperacion();
    }

    public void eliminarUsuario(Usuario usuario) {
        iniciarOperacion();
        session.delete(usuario);
        terminarOperacion();
    }

    public Usuario buscarUsuario(String usuario) {
        Usuario user = null;
        iniciarOperacion();
        user = (Usuario) session.createCriteria(Usuario.class).add(Restrictions.eq("usuario", usuario)).uniqueResult();
        terminarOperacion();
        return user;
    }

    public Usuario obtenerUsuario(int id) {
        Usuario object = null;
        iniciarOperacion();
        object = (Usuario) session.get(Usuario.class, id);
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
}
