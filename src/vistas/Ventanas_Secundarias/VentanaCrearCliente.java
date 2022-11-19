/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas.Ventanas_Secundarias;

import controladores.ClienteBean;
import controladores.UsuarioBean;
import modelos.Usuario;
import hibernate.utils.OperacionesCRUD;
import java.util.Iterator;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelos.Cliente;
import modelos.Talla;
import vistas.Fondo;

/**
 *
 * @author Usuario
 */
public class VentanaCrearCliente extends Fondo {

    JFrame frame = new JFrame();

    /**
     * Creates new form VentanaUsuario
     */
    public VentanaCrearCliente() {
        initComponents();
    }

    public VentanaCrearCliente(JFrame jframe) {

        initComponents();
        frame = jframe;
        btnCrearCliente.setEnabled(false);
        cargarComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCrearCliente = new javax.swing.JButton();
        txtTelefono = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboCiudad = new javax.swing.JComboBox<>();
        txtUsuario1 = new javax.swing.JTextField();
        txtApellidos1 = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCrearCliente.setText("Crear Cliente");
        btnCrearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearClienteActionPerformed(evt);
            }
        });
        add(btnCrearCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 80, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Usuario");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Ciudad");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jButton2.setText("Volver atras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Apellidos");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Telefono");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        comboCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(comboCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        txtUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuario1ActionPerformed(evt);
            }
        });
        txtUsuario1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsuario1KeyReleased(evt);
            }
        });
        add(txtUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 80, -1));

        txtApellidos1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidos1KeyReleased(evt);
            }
        });
        add(txtApellidos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 80, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearClienteActionPerformed
        String nombre = txtUsuario1.getText();
        String apellidos = txtApellidos1.getText();
        int telefono = Integer.parseInt(txtTelefono.getText());
        String ciudad = comboCiudad.getSelectedItem().toString();
        ClienteBean cb = new ClienteBean();
        List listClientes = cb.listCliente(nombre);
        boolean existe = false;
        if (listClientes != null) {
            for (Iterator iterator = listClientes.iterator(); iterator.hasNext();) {
                Cliente cl = (Cliente) iterator.next();
                System.out.println(cl.getApellidos());
                System.out.println(cl.getCiudad());
                if (cl.getApellidos().equalsIgnoreCase(apellidos) && cl.getCiudad().equals(ciudad)) {
                    if (cl.getDisponible()) {
                        existe = true;
                    } else {
                        JOptionPane.showMessageDialog(null, " Cualquiera creado con exito", "", WIDTH);
                    }
                }
            }
            if (existe) {
                JOptionPane.showMessageDialog(null, " Usuario creado con exito", "", WIDTH);
            }
        } else {
            JOptionPane.showMessageDialog(null, " Cliente creado con exito", "", WIDTH);
        }

    }//GEN-LAST:event_btnCrearClienteActionPerformed

    private void txtTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyReleased
        // TODO add your handling code here:
        habilitarBoton();
    }//GEN-LAST:event_txtTelefonoKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        frame.remove(this);
        VentanaUsuarios i = new VentanaUsuarios(frame);
        frame.getContentPane().add(i);
        frame.setSize(603, 402);
        i.setVisible(true);
        i.setSize(603, 402);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtUsuario1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuario1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuario1KeyReleased

    private void txtUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuario1ActionPerformed

    private void txtApellidos1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidos1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidos1KeyReleased

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped
    public void habilitarBoton() {
        if (!txtTelefono.getText().isEmpty()) {
            btnCrearCliente.setEnabled(true);
        } else {
            btnCrearCliente.setEnabled(false);
        }
    }

    public void cargarComboBox() {
        comboCiudad.removeAllItems();
        comboCiudad.addItem("Pando");
        comboCiudad.addItem("Beni");
        comboCiudad.addItem("Potosi");
        comboCiudad.addItem("Santa Cruz");
        comboCiudad.addItem("Oruro");
        comboCiudad.addItem("La Paz");
        comboCiudad.addItem("Sucre");
        comboCiudad.addItem("Tarija");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearCliente;
    private javax.swing.JComboBox<String> comboCiudad;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtApellidos1;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario1;
    // End of variables declaration//GEN-END:variables
}
