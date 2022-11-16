/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.Ventanas_Secundarias;

import controladores.MarcaBean;
import controladores.TallaBean;
import controladores.UsuarioBean;
import modelos.Usuario;
import vistas.Fondo;
import java.util.Iterator;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.Marca;
import modelos.Talla;
import vistas.VentanasPrincipales.VentanaAdmin;

public class VentanaMarcas extends Fondo {

    JFrame frame = new JFrame();

    public VentanaMarcas() {
        initComponents();
    }

    public VentanaMarcas(JFrame jframe) {
        initComponents();
        frame = jframe;
        cargarMarcas();
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
        btnEliminar = new javax.swing.JButton();

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
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 266, -1, -1));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 266, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 266, -1, -1));
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

        boolean noExiste = true;
        String nombre;
        nombre = JOptionPane.showInputDialog("Ingrese el nombre de la Marca que desea crear");
        MarcaBean tallaBean = new MarcaBean();
        List<Marca> users = (List<Marca>) tallaBean.listMarca();
        if (nombre != null && !nombre.isEmpty()) {
            for (int i = 0; i < users.size(); i++) {
                if (users.get(i).getNombreMarca().equalsIgnoreCase(nombre)) {
                    JOptionPane.showMessageDialog(null, "La marca ya existe ", "Error", JOptionPane.ERROR_MESSAGE);
                    noExiste = false;
                }
            }
            if (noExiste) {
                MarcaBean t = new MarcaBean();
                Marca marca = new Marca(nombre);
                t.guardarMarca(marca);
                cargarMarcas();
                JOptionPane.showMessageDialog(null, "Marca agregada correctamente");
            }

        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String nombre;
        nombre = JOptionPane.showInputDialog("Ingrese el codigo de la Marca que desea eliminar");
        if (nombre != null && !nombre.isEmpty()) {
            if (nombre.matches("[0-9]*")) {
                int codigo = Integer.parseInt(nombre);
                MarcaBean t = new MarcaBean();
                Marca talla = t.obtenerMarca(codigo);
                if (talla != null) {
                    t.eliminarMarca(talla);
                    JOptionPane.showMessageDialog(null, "Marca Eliminada Correctamente");
                    cargarMarcas();
                } else {
                    JOptionPane.showMessageDialog(null, "Codigo no existente, ingrese un codigo correcto", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese un codigo correcto", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    public void cargarMarcas() {
        MarcaBean t = new MarcaBean();
        List lisMarcas = t.listMarca();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Marca");
        Iterator it = lisMarcas.iterator();
        while (it.hasNext()) {
            Marca u = (Marca) it.next();
            Object[] fila = new Object[2];
            fila[0] = u.getIdMarca();
            fila[1] = u.getNombreMarca();
            modelo.addRow(fila);
        }
        jTable1.setModel(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
