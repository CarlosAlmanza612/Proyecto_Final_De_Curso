package vistas.Ventanas_Secundarias;

import controladores.ClienteBean;
import java.util.Iterator;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelos.Cliente;
import vistas.Fondo;

/**
 * Clase VentanaCrearCliente extiende de la Clase Fondo
 * se abrira luego de pulsar en Registrar Cliente 
 * 
 * @author Carlos Halberth Almanza Lopez
 */
public class VentanaCrearCliente extends Fondo {

    JFrame frame = new JFrame();

    /**
     * Creates new form VentanaUsuario
     */
    public VentanaCrearCliente() {
        initComponents();
    }
    /**
     * Creates new form VentanaCrearCliente
     *
     * @param jframe
     */
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
        jLabel13 = new javax.swing.JLabel();

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
        jLabel1.setText("Nombres");
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
        add(txtUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 80, -1));
        add(txtApellidos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 80, -1));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Registro de Clientes");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel13.setMinimumSize(new java.awt.Dimension(623, 36));
        jLabel13.setPreferredSize(new java.awt.Dimension(643, 70));
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 300, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearClienteActionPerformed
        //Evento para crear un cliente 
        String nombre = txtUsuario1.getText();
        String apellidos = txtApellidos1.getText();
        int telefono = Integer.parseInt(txtTelefono.getText());
        String ciudad = comboCiudad.getSelectedItem().toString();
        ClienteBean cb = new ClienteBean();
        List listClientes = cb.listCliente(nombre);
        boolean noExiste = true;
        if (listClientes != null) {
            for (Iterator iterator = listClientes.iterator(); iterator.hasNext();) {
                Cliente cl = (Cliente) iterator.next();
                if (cl.getApellidos().equalsIgnoreCase(apellidos) && cl.getCiudad().equals(ciudad)) {
                    noExiste = false;
                    if (cl.getDisponible()) {
                        JOptionPane.showMessageDialog(null, "El Cliente ya existe", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        cl.setDisponible(true);
                        cb.actualizarCliente(cl);
                        JOptionPane.showMessageDialog(null, " Cualquiera creado con exito", "", WIDTH);
                    }
                }
            }
            if (noExiste) {
                Cliente nuevo = new Cliente(nombre, apellidos, telefono, ciudad);
                cb.guardarCliente(nuevo);
                JOptionPane.showMessageDialog(null, " Cliente " + nuevo.getNombre() + " creado con exito", "", WIDTH);
            }
        } else {
            Cliente nuevo = new Cliente(nombre, apellidos, telefono, ciudad);
            cb.guardarCliente(nuevo);
            JOptionPane.showMessageDialog(null, " Cliente creado con exito", "", WIDTH);
        }

    }//GEN-LAST:event_btnCrearClienteActionPerformed

    private void txtTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyReleased
        // Evento que activa un metodo cuando se presiona una tecla
        habilitarBoton();
    }//GEN-LAST:event_txtTelefonoKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Evento para volver atras
        this.setVisible(false);
        frame.remove(this);
        VentanaClientes i = new VentanaClientes(frame);
        frame.getContentPane().add(i);
        frame.setSize(603, 402);
        i.setVisible(true);
        i.setSize(603, 402);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        //Evento para restringir la escritura de solo numeros
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped
    //Metodo que habilita un boton si se cumplen las condiciones
    public void habilitarBoton() {
        if (!txtTelefono.getText().isEmpty()) {
            btnCrearCliente.setEnabled(true);
        } else {
            btnCrearCliente.setEnabled(false);
        }
    }
    //Metodo para cargar un comboBox
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
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtApellidos1;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario1;
    // End of variables declaration//GEN-END:variables
}
