/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.Ventanas_Secundarias;

import controladores.ClienteBean;
import controladores.UsuarioBean;
import modelos.Usuario;
import vistas.Fondo;
import java.util.Iterator;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import modelos.Cliente;
import vistas.VentanasPrincipales.VentanaAdmin;

public class VentanaClientes extends Fondo {

    JFrame frame = new JFrame();

    public VentanaClientes() {
        initComponents();
    }

    public VentanaClientes(JFrame jframe) {
        initComponents();
        frame = jframe;
        cargarProductos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 64, 375, 191));

        jButton1.setText("Volver Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        jButton4.setText("Eliminar");
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        frame.remove(this);
        VentanaAdmin i = new VentanaAdmin(frame);
        frame.getContentPane().add(i);
        frame.setSize(603, 402);
        i.setVisible(true);
        i.setSize(603, 402);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        this.setVisible(false);
        frame.remove(this);
        VentanaCrearCliente cl = new VentanaCrearCliente(frame);
        frame.getContentPane().add(cl);
        frame.setSize(603, 402);
        cl.setVisible(true);
        cl.setSize(603, 402);

    }//GEN-LAST:event_btnRegistrarActionPerformed

    public void cargarProductos() {
        ClienteBean op = new ClienteBean();
        List listUsuarios = op.listCliente();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Telefono");
        modelo.addColumn("Ciudad");
        Iterator it = listUsuarios.iterator();
        while (it.hasNext()) {
            Cliente u = (Cliente) it.next();
            Object[] fila = new Object[4];
            fila[0] = u.getCodCliente();
            fila[1] = u.getNombre();
            fila[2] = u.getTelefono();
            fila[3] = u.getCiudad();
            modelo.addRow(fila);
        }
        jTable1.setModel(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
