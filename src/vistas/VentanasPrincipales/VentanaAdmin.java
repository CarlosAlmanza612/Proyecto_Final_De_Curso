/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas.VentanasPrincipales;

import javax.swing.JFrame;
import vistas.Fondo;
import vistas.Ventanas_Secundarias.VentanaClientes;
import vistas.Ventanas_Secundarias.VentanaMarcas;
import vistas.Ventanas_Secundarias.VentanaProductos;
import vistas.Ventanas_Secundarias.VentanaTallas;
import vistas.Ventanas_Secundarias.VentanaUsuarios;
import vistas.Ventanas_Secundarias.VentanaVentas;

/**
 * Clase Admin extiende de la Clase Fondo, si el usuario ingresado en el login
 * es admin, se iniciara esta ventana,
 * presenta varios botones, los cuales te llevan a la ventana que tienen en el texto del boton
 * @author Carlos Halberth Almanza Lopez
 */
public class VentanaAdmin extends Fondo {

    JFrame frame = new JFrame();

    public VentanaAdmin() {
        initComponents();
    }
    /**
     * Creates new form VentanaAdmin
     *
     * @param jframe
     */
    public VentanaAdmin(JFrame jframe) {
        initComponents();
        frame = jframe;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        btnVentas = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnTallas = new javax.swing.JButton();
        btnMarcas = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0};
        layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        setLayout(layout);

        btnVentas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnVentas.setText("Ventas");
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        add(btnVentas, gridBagConstraints);

        btnUsuarios.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUsuarios.setText("Usuarios");
        btnUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        add(btnUsuarios, gridBagConstraints);

        btnProductos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnProductos.setText("Productos");
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        add(btnProductos, gridBagConstraints);

        btnClientes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnClientes.setText("Clientes");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
        add(btnClientes, gridBagConstraints);

        btnTallas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTallas.setText("Tallas");
        btnTallas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTallasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        add(btnTallas, gridBagConstraints);

        btnMarcas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMarcas.setText("Marcas");
        btnMarcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarcasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        add(btnMarcas, gridBagConstraints);

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 10;
        add(btnSalir, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/admin.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        add(jLabel1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        //Evento para volver al login
        this.setVisible(false);
        frame.remove(this);
        Login i = new Login(frame);
        frame.getContentPane().add(i);
        frame.setSize(300, 300);
        i.setVisible(true);
        i.setSize(300, 300);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        //Evento para pasar a la ventana Usuarios
        this.setVisible(false);
        frame.remove(this);
        VentanaUsuarios usuario = new VentanaUsuarios(frame);
        frame.getContentPane().add(usuario);
        frame.setSize(503, 402);
        usuario.setVisible(true);
        usuario.setSize(503, 402);
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnMarcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarcasActionPerformed
        //Evento para pasar a la ventana Marcas
        this.setVisible(false);
        frame.remove(this);
        VentanaMarcas usuario = new VentanaMarcas(frame);
        frame.getContentPane().add(usuario);
        frame.setSize(503, 402);
        usuario.setVisible(true);
        usuario.setSize(503, 402);
    }//GEN-LAST:event_btnMarcasActionPerformed

    private void btnTallasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTallasActionPerformed
        //Evento para pasar a la ventana Tallas
        this.setVisible(false);
        frame.remove(this);
        VentanaTallas usuario = new VentanaTallas(frame);
        frame.getContentPane().add(usuario);
        frame.setSize(503, 402);
        usuario.setVisible(true);
        usuario.setSize(503, 402);
    }//GEN-LAST:event_btnTallasActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        //Evento para pasar a la ventana Clientes
        this.setVisible(false);
        frame.remove(this);
        VentanaClientes usuario = new VentanaClientes(frame);
        frame.getContentPane().add(usuario);
        frame.setSize(533, 402);
        usuario.setVisible(true);
        usuario.setSize(533, 402);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        //Evento para pasar a la ventana Ventas
        this.setVisible(false);
        frame.remove(this);
        VentanaVentas usuario = new VentanaVentas(frame);
        frame.getContentPane().add(usuario);
        frame.setSize(523, 402);
        usuario.setVisible(true);
        usuario.setSize(523, 402);
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        //Evento para pasar a la ventana Productos
        this.setVisible(false);
        frame.remove(this);
        VentanaProductos productos = new VentanaProductos(frame);
        frame.getContentPane().add(productos);
        frame.setSize(503, 402);
        productos.setVisible(true);
        productos.setSize(503, 402);
    }//GEN-LAST:event_btnProductosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnMarcas;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTallas;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnVentas;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
