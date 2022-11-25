/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.Ventanas_Secundarias;

import controladores.MarcaBean;
import controladores.ProductoBean;
import controladores.TallaBean;
import java.text.DecimalFormat;
import vistas.Fondo;
import java.util.Iterator;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.Marca;
import modelos.Producto;
import modelos.Talla;
import vistas.VentanasPrincipales.VentanaAdmin;

public class VentanaProductos extends Fondo {

    JFrame frame = new JFrame();

    public VentanaProductos() {
        initComponents();
    }

    public VentanaProductos(JFrame jframe) {
        initComponents();
        frame = jframe;
        cargarProductos();
        btnModificar.setEnabled(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnVolverAtras = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txtCodProducto = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 375, 160));

        btnVolverAtras.setText("Volver Atras");
        btnVolverAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverAtrasActionPerformed(evt);
            }
        });
        add(btnVolverAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 266, -1, -1));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 266, -1, -1));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 266, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 266, -1, -1));

        jButton5.setText("Buscar Producto");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 110, -1));

        txtCodProducto.setText("Ingrese el codigo");
        txtCodProducto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCodProductoFocusGained(evt);
            }
        });
        txtCodProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodProductoKeyTyped(evt);
            }
        });
        add(txtCodProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Lista de Productos");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel13.setMinimumSize(new java.awt.Dimension(623, 36));
        jLabel13.setPreferredSize(new java.awt.Dimension(643, 70));
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 300, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverAtrasActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        frame.remove(this);
        VentanaAdmin i = new VentanaAdmin(frame);
        frame.getContentPane().add(i);
        frame.setSize(603, 402);
        i.setVisible(true);
        i.setSize(603, 402);
    }//GEN-LAST:event_btnVolverAtrasActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        this.setVisible(false);
        frame.remove(this);
        VentanaCrearProducto productos = new VentanaCrearProducto(frame);
        frame.getContentPane().add(productos);
        frame.setSize(623, 402);
        productos.setVisible(true);
        productos.setSize(623, 402);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String nombre;
        
        nombre = JOptionPane.showInputDialog("Ingrese el codigo del Producto que desea eliminar");
        if (nombre != null && !nombre.isEmpty()) {
            if (nombre.matches("[0-9]*")) {
                int codigo = Integer.parseInt(nombre);
                ProductoBean t = new ProductoBean();
                Producto p = t.obtenerProducto(codigo);
                if (p != null && p.getDisponible()) {
                    p.setDisponible(false);
                    t.actualizarProducto(p);
                    JOptionPane.showMessageDialog(null, "Producto Eliminado Correctamente");
                    cargarProductos();
                } else {
                    JOptionPane.showMessageDialog(null, "Codigo no existente, ingrese un codigo correcto", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese un codigo correcto", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }


    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        btnModificar.setEnabled(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        this.setVisible(false);
        frame.remove(this);
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        String dato = String.valueOf(dtm.getValueAt(jTable1.getSelectedRow(), 0));
        int id = Integer.parseInt(dato);
        VentanaModificarProducto productos = new VentanaModificarProducto(frame, id);
        frame.getContentPane().add(productos);
        frame.setSize(623, 402);
        productos.setVisible(true);
        productos.setSize(623, 402);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (!txtCodProducto.getText().equalsIgnoreCase("Ingrese el codigo")) {
            if (!txtCodProducto.getText().isEmpty() && txtCodProducto.getText() != null) {
                DecimalFormat df = new DecimalFormat("#");
                ProductoBean op = new ProductoBean();
                TallaBean tb = new TallaBean();
                MarcaBean mb = new MarcaBean();
                Producto p = op.obtenerProducto(Integer.parseInt(txtCodProducto.getText()));
                if (p != null && p.getDisponible()) {
                    Talla t = p.getTalla();
                    Marca m = p.getMarca();
                    int id = t.getIdTalla();
                    int id_marca = m.getIdMarca();
                    DefaultTableModel modelo = new DefaultTableModel();
                    Talla talla = tb.obtenerTalla(id);
                    Marca marca = mb.obtenerMarca(id_marca);
                    modelo.addColumn("Codigo");
                    modelo.addColumn("Nombre");
                    modelo.addColumn("Talla");
                    modelo.addColumn("Marca");
                    modelo.addColumn("Precio");
                    if (p.getDisponible()) {
                        Object[] fila = new Object[5];
                        fila[0] = p.getCodigo();
                        fila[1] = p.getNombre().toUpperCase();
                        fila[2] = talla.getNombreTalla().toUpperCase();
                        fila[3] = marca.getNombreMarca().toUpperCase();
                        fila[4] = df.format(p.getPrecioDeVenta());
                        modelo.addRow(fila);
                        jTable1.setModel(modelo);
                    }
                } else {
                    cargarProductos();
                    JOptionPane.showMessageDialog(null, "El Codigo no existe", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } else {
                cargarProductos();
            }
            txtCodProducto.setText("Ingrese el codigo");
        }else{
            cargarProductos();
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtCodProductoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodProductoFocusGained
        txtCodProducto.setText("");
    }//GEN-LAST:event_txtCodProductoFocusGained

    private void txtCodProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodProductoKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCodProductoKeyTyped

    public void cargarProductos() {
        DecimalFormat df = new DecimalFormat("#");
        ProductoBean op = new ProductoBean();
        TallaBean tb = new TallaBean();
        MarcaBean mb = new MarcaBean();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Talla");
        modelo.addColumn("Marca");
        modelo.addColumn("Precio");
        List listaProductos = op.listProducto();
        if (listaProductos != null) {
            for (Iterator iterator = listaProductos.iterator(); iterator.hasNext();) {
                Producto p = (Producto) iterator.next();
                Talla t = p.getTalla();
                Marca m = p.getMarca();
                int id = t.getIdTalla();
                int id_marca = m.getIdMarca();
                Talla talla = tb.obtenerTalla(id);
                Marca marca = mb.obtenerMarca(id_marca);
                if (p.getDisponible()) {
                    Object[] fila = new Object[5];
                    fila[0] = p.getCodigo();
                    fila[1] = p.getNombre().toUpperCase();
                    fila[2] = talla.getNombreTalla().toUpperCase();
                    fila[3] = marca.getNombreMarca().toUpperCase();
                    fila[4] = df.format(p.getPrecioDeVenta());
                    modelo.addRow(fila);
                }
            }
        }
        jTable1.setModel(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVolverAtras;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCodProducto;
    // End of variables declaration//GEN-END:variables
}
