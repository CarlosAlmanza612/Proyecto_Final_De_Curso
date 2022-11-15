/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas.Ventanas_Secundarias;

import java.time.Clock;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vistas.Fondo;

/**
 *
 * @author Usuario
 */
public class VentanaCrearProducto extends Fondo {

    JFrame frame = new JFrame();

    /**
     * Creates new form Venta
     */
    public VentanaCrearProducto() {
        initComponents();
    }

    public VentanaCrearProducto(JFrame jframe) {
        initComponents();
        btnRegistrar.setEnabled(false);
        frame = jframe;
        cargarListaDeTallas();
        cargarListaDeMarcas();
//        cargarTabla();
    }

    public void cargarListaDeTallas() {
        DefaultListModel dtm = new DefaultListModel();
        dtm.removeAllElements();
        ArrayList<String> tallas = new ArrayList<>();
        tallas.add("XS");
        tallas.add("S");
        tallas.add("M");
        tallas.add("L");
        tallas.add("XL");
        tallas.add("2XL");
        for (int i = 0; i < tallas.size(); i++) {
            dtm.addElement(tallas.get(i));
        }
        listTalla.setModel(dtm);

    }

    public void cargarListaDeMarcas() {
        DefaultListModel dtm = new DefaultListModel();
        dtm.removeAllElements();
        ArrayList<String> marcas = new ArrayList<>();
        marcas.add("SHEIN");
        marcas.add("SPRINGFIELD");
        marcas.add("BERSHKA");
        marcas.add("ROWME");
        for (int i = 0; i < marcas.size(); i++) {
            dtm.addElement(marcas.get(i));
        }
        listMarca.setModel(dtm);

    }

    /*  public void cargarFabricantes() {
        String consultaFabricantes = "SELECT NOMBRE FROM FABRICANTES";
        ArrayList<String[]> strings = mi.ConsultaSQL(consultaFabricantes);
        DefaultListModel dtm = new DefaultListModel();
        dtm.removeAllElements();
        for (int i = 0; i < strings.size(); i++) {
            dtm.addElement(strings.get(i)[0]);
        }
        jList1.setModel(dtm);
    }

     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegistrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listMarca = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listTalla = new javax.swing.JList<>();
        checkDisponible = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        txtCostoDeCompra = new javax.swing.JTextField();
        txtCostoDelPeso = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCostoTotal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPrecioDeVenta = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        txtTipoDeCambio = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        btnResetear = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 80, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Talla");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 70, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Nombre");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Codigo");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIDKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDKeyTyped(evt);
            }
        });
        add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 70, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Marca");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, -1, -1));

        listMarca.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listMarca);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 100, -1));

        listTalla.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listTalla.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listTallaValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listTalla);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 100, -1));

        checkDisponible.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        checkDisponible.setText("Disponible");
        checkDisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkDisponibleActionPerformed(evt);
            }
        });
        add(checkDisponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Costo de Compra");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, -1, -1));

        txtCostoDeCompra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCostoDeCompraFocusLost(evt);
            }
        });
        add(txtCostoDeCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 70, -1));

        txtCostoDelPeso.setEnabled(false);
        txtCostoDelPeso.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtCostoDelPesoPropertyChange(evt);
            }
        });
        add(txtCostoDelPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 80, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Peso en Gramos");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Tipo De Cambio");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Costo Del Peso");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Costo Total");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, -1, -1));

        txtCostoTotal.setEditable(false);
        txtCostoTotal.setEnabled(false);
        add(txtCostoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 70, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Precio de Venta");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, -1, -1));

        txtPrecioDeVenta.setEditable(false);
        txtPrecioDeVenta.setEnabled(false);
        add(txtPrecioDeVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 70, -1));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Registro de Producto");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel13.setMinimumSize(new java.awt.Dimension(623, 36));
        jLabel13.setPreferredSize(new java.awt.Dimension(643, 70));
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 300, 50));
        add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 80, -1));

        txtTipoDeCambio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTipoDeCambioKeyReleased(evt);
            }
        });
        add(txtTipoDeCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 80, -1));

        txtPeso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPesoFocusLost(evt);
            }
        });
        txtPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesoKeyReleased(evt);
            }
        });
        add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 80, -1));

        btnResetear.setText("Reset");
        btnResetear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetearActionPerformed(evt);
            }
        });
        add(btnResetear, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 80, -1));

        jButton1.setText("Volver Atras");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void checkDisponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkDisponibleActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_checkDisponibleActionPerformed

    private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (txtID.getText().trim().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtIDKeyTyped

    private void txtCostoDelPesoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtCostoDelPesoPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCostoDelPesoPropertyChange

    private void txtPesoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPesoFocusLost
        // TODO add your handling code here:
        if (!txtPeso.getText().isEmpty()) {

            double peso = Double.parseDouble(txtPeso.getText());
            double costoDelPeso = (peso * 0.001) * 16;
            txtCostoDelPeso.setText(String.valueOf(costoDelPeso));
        }
        if (!txtCostoDeCompra.getText().isEmpty()) {
            double costoPeso = Double.parseDouble(txtCostoDelPeso.getText());
            double costoCompra = Double.parseDouble(txtCostoDeCompra.getText());
            double tipoDeCambio = Double.parseDouble(txtTipoDeCambio.getText());
            double costoTotal = tipoDeCambio * (costoPeso + costoCompra);
            txtCostoTotal.setText(String.valueOf(costoTotal));
            double precioDeVenta = costoTotal * 1.5;
            txtPrecioDeVenta.setText(String.valueOf(precioDeVenta));
        }


    }//GEN-LAST:event_txtPesoFocusLost

    private void txtCostoDeCompraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCostoDeCompraFocusLost
        // TODO add your handling code here:
        if (!txtCostoDelPeso.getText().isEmpty()) {
            double costoPeso = Double.parseDouble(txtCostoDelPeso.getText());
            double costoCompra = Double.parseDouble(txtCostoDeCompra.getText());
            double tipoDeCambio = Double.parseDouble(txtTipoDeCambio.getText());
            double costoTotal = tipoDeCambio * (costoPeso + costoCompra);
            txtCostoTotal.setText(String.valueOf(costoTotal));
            double precioDeVenta = costoTotal * 1.5;
            txtPrecioDeVenta.setText(String.valueOf(precioDeVenta));
        }
    }//GEN-LAST:event_txtCostoDeCompraFocusLost

    private void btnResetearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetearActionPerformed
        resetForm();
    }//GEN-LAST:event_btnResetearActionPerformed

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        habilitarBotonRegistrar();
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyReleased
        habilitarBotonRegistrar();
    }//GEN-LAST:event_txtIDKeyReleased

    private void listTallaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listTallaValueChanged
        habilitarBotonRegistrar();
    }//GEN-LAST:event_listTallaValueChanged

    private void txtTipoDeCambioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoDeCambioKeyReleased
        habilitarBotonRegistrar();
    }//GEN-LAST:event_txtTipoDeCambioKeyReleased

    private void txtPesoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesoKeyReleased
        habilitarBotonRegistrar();
    }//GEN-LAST:event_txtPesoKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnResetear;
    private javax.swing.JCheckBox checkDisponible;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JList<String> listMarca;
    private javax.swing.JList<String> listTalla;
    private javax.swing.JTextField txtCostoDeCompra;
    private javax.swing.JTextField txtCostoDelPeso;
    private javax.swing.JTextField txtCostoTotal;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtPrecioDeVenta;
    private javax.swing.JTextField txtTipoDeCambio;
    // End of variables declaration//GEN-END:variables
public void resetForm() {
        txtPeso.setText("");
        txtCostoTotal.setText("");
        txtCostoDelPeso.setText("");
        txtCostoDeCompra.setText("");
        txtTipoDeCambio.setText("");
        txtID.setText("");
        txtNombre.setText("");
        listTalla.clearSelection();
        listMarca.clearSelection();
        checkDisponible.setSelected(false);
        txtPrecioDeVenta.setText("");
        btnRegistrar.setEnabled(false);
    }

    /*  public void cargarTabla() {
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setColumnCount(0);
        dtm.addColumn("Codigo");
        dtm.addColumn("Nombre");
        dtm.addColumn("Talla");
        dtm.addColumn("Marca");
        dtm.addColumn("Precio");
        dtm.addColumn("Disponible");
        dtm.setRowCount(0);
     

    }*/
    public void habilitarBotonRegistrar() {
        if (!txtNombre.getText().isEmpty() && !txtID.getText().isEmpty()
                && !txtPeso.getText().isEmpty()) {
            btnRegistrar.setEnabled(true);
        } else {
            btnRegistrar.setEnabled(false);
        }
    }
}
