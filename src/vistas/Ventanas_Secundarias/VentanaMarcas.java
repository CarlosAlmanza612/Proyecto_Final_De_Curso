package vistas.Ventanas_Secundarias;

import controladores.MarcaBean;
import vistas.Fondo;
import java.util.Iterator;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.Marca;
import vistas.VentanasPrincipales.VentanaAdmin;

/**
 * Clase VentanaMarcas extiende de la Clase Fondo Se abrira luego de pulsar el
 * boton marcas en la ventana Admin presenta la lista de marcas existente,
 * permite crear nuevas marcas o eliminar existentes
 *
 * @author Carlos Halberth Almanza Lopez
 */
public class VentanaMarcas extends Fondo {

    JFrame frame = new JFrame();

    public VentanaMarcas() {
        initComponents();
    }

    /**
     * Creates new form VentanaMarcas
     *
     * @param jframe
     */
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
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 375, 191));

        jButton1.setText("Volver Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Lista de Marcas");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel13.setMinimumSize(new java.awt.Dimension(623, 36));
        jLabel13.setPreferredSize(new java.awt.Dimension(643, 70));
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 300, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Evento para volver a la ventana anterior
        this.setVisible(false);
        frame.remove(this);
        VentanaAdmin i = new VentanaAdmin(frame);
        frame.getContentPane().add(i);
        frame.setSize(603, 402);
        i.setVisible(true);
        i.setSize(603, 402);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        //Evento ejecuta un JOptionPane que recibe un nombre que crea una marca con ese
        //nombre si no existe
        String nombre;
        nombre = JOptionPane.showInputDialog("Ingrese el nombre de la Talla que desea crear");
        MarcaBean tb = new MarcaBean();
        Marca t = tb.buscarMarca(nombre);
        if (t != null) {
            if (!t.getDisponible()) {
                t.setDisponible(true);
                tb.actualizarMarca(t);
                cargarMarcas();
                JOptionPane.showMessageDialog(null, "Marca creada Correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "La Marca ya existe", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            Marca nueva = new Marca(nombre);
            tb.guardarMarca(nueva);
            cargarMarcas();
            JOptionPane.showMessageDialog(null, "Marca Creada Correctamente");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //Evento ejecuta un JOptionPane que recibe un numero que elimina una marca con ese
        //numero de codigo si existe
        String nombre;
        nombre = JOptionPane.showInputDialog("Ingrese el codigo de la talla que desea eliminar");
        if (nombre != null && !nombre.isEmpty()) {
            if (nombre.matches("[0-9]*")) {
                int codigo = Integer.parseInt(nombre);
                MarcaBean t = new MarcaBean();
                Marca marca = t.obtenerMarca(codigo);
                if (marca != null && marca.getDisponible()) {
                    marca.setDisponible(false);
                    t.actualizarMarca(marca);
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

    //Metodo para cargar la lista con las marcas disponibles
    public void cargarMarcas() {
        MarcaBean t = new MarcaBean();
        List lisMarcas = t.listMarca();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Marca");
        if (!lisMarcas.isEmpty() && lisMarcas != null) {
            for (Iterator iterator = lisMarcas.iterator(); iterator.hasNext();) {
                Marca u = (Marca) iterator.next();
                if (u.getDisponible()) {
                    Object[] fila = new Object[2];
                    fila[0] = u.getIdMarca();
                    fila[1] = u.getNombreMarca().toUpperCase();
                    modelo.addRow(fila);
                }
            }
        }
        jTable1.setModel(modelo);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
