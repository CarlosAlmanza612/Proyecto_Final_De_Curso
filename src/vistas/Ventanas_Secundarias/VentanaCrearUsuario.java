/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas.Ventanas_Secundarias;

import controladores.UsuarioBean;
import java.util.Iterator;
import modelos.Usuario;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import vistas.Fondo;

/**
 *
 * @author Usuario
 */
public class VentanaCrearUsuario extends Fondo {

    JFrame frame = new JFrame();

    /**
     * Creates new form VentanaUsuario
     */
    public VentanaCrearUsuario() {
        initComponents();
    }

    public VentanaCrearUsuario(JFrame jframe) {

        initComponents();
        frame = jframe;
        btnCrearUsuario.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCrearUsuario = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        checkAdmin = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCrearUsuario.setText("Crear Usuario");
        btnCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearUsuarioActionPerformed(evt);
            }
        });
        add(btnCrearUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyReleased(evt);
            }
        });
        add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 80, -1));

        checkAdmin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        checkAdmin.setText("Administrador");
        add(checkAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Usuario");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Password");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));
        add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 80, -1));

        jButton2.setText("Volver atras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Registro de Usuario");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel13.setMinimumSize(new java.awt.Dimension(623, 36));
        jLabel13.setPreferredSize(new java.awt.Dimension(643, 70));
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 300, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearUsuarioActionPerformed
        UsuarioBean ub = new UsuarioBean();
        String nombre = txtUsuario.getText();
        char[] arrayC = txtPass.getPassword();
        String password = new String(arrayC);
        boolean admin = checkAdmin.isSelected();
        List listUsuario = ub.listUsuario(nombre);
        if (listUsuario != null&& !listUsuario.isEmpty()) {
            for (Iterator iterator = listUsuario.iterator(); iterator.hasNext();) {
                Usuario u = (Usuario) iterator.next();
                if (u.getUsuario().equalsIgnoreCase(nombre) && u.getPassword().equalsIgnoreCase(password)) {
                    if (u.getDisponible()) {
                        JOptionPane.showMessageDialog(null, "El Usuario ya existe", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        u.setDisponible(true);
                        u.setPassword(password);
                        ub.actualizarUsuario(u);
                        JOptionPane.showMessageDialog(null, " Usuario creado con exito", "", WIDTH);
                    }
                }
            }
        } else {

            Usuario usuario = new Usuario(nombre, password, admin);
            ub.guardarUsuario(usuario);
            JOptionPane.showMessageDialog(null, " Usuario creado con exito", "", WIDTH);

        }
        txtUsuario.setText("");
        txtPass.setText("");
        checkAdmin.setSelected(false);
        btnCrearUsuario.setEnabled(false);

    }//GEN-LAST:event_btnCrearUsuarioActionPerformed

    private void txtUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyReleased
        // TODO add your handling code here:
        habilitarBoton();
    }//GEN-LAST:event_txtUsuarioKeyReleased

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
    public void habilitarBoton() {
        if (!txtUsuario.getText().isEmpty()) {
            btnCrearUsuario.setEnabled(true);
        } else {
            btnCrearUsuario.setEnabled(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearUsuario;
    private javax.swing.JCheckBox checkAdmin;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
