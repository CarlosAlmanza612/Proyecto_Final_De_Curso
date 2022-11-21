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
        btnVolverAtras = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 64, 375, 191));

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
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 35, -1, -1));
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
        frame.setSize(603, 402);
        productos.setVisible(true);
        productos.setSize(603, 402);
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
        frame.setSize(603, 402);
        productos.setVisible(true);
        productos.setSize(603, 402);
    }//GEN-LAST:event_btnModificarActionPerformed

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
