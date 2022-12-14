package vistas.Ventanas_Secundarias;

import controladores.ClienteBean;
import controladores.ProductoBean;
import controladores.VentaBean;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;
import vistas.Fondo;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import modelos.Cliente;
import modelos.Producto;
import modelos.Venta;
import reports.CrearInforme;
import vistas.VentanasPrincipales.VentanaAdmin;

/**
 * Clase VentanaVentas extiende de la Clase Fondo Se abrira luego de pulsar el
 * boton ventas en la ventana Admin presenta la lista de ventas existente,
 * permite filtrar por cliente,producto o fecha las ventas existentes, y generar
 * reportes por fecha de las ventas.
 *
 * @author Carlos Halberth Almanza Lopez
 */
public class VentanaVentas extends Fondo {

    JFrame frame = new JFrame();

    public VentanaVentas() {
        initComponents();
    }

    /**
     * Creates new form VentanaVentas
     *
     * @param jframe
     */
    public VentanaVentas(JFrame jframe) {
        initComponents();
        frame = jframe;
        cargarVentas();
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
        btnReset = new javax.swing.JButton();
        btnFiltrar = new javax.swing.JButton();
        codProducto = new javax.swing.JTextField();
        codCliente = new javax.swing.JTextField();
        chooseFecha = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnInformeFecha = new javax.swing.JButton();
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 440, 170));

        jButton1.setText("Volver Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, -1));

        btnFiltrar.setText("Filtrar");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });
        add(btnFiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

        codProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codProductoKeyTyped(evt);
            }
        });
        add(codProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 60, -1));

        codCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codClienteKeyTyped(evt);
            }
        });
        add(codCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 60, -1));

        chooseFecha.setToolTipText("");
        chooseFecha.setDateFormatString("y M d");
        add(chooseFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 110, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Cod Producto");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Cod Cliente");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Fecha");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, -1));

        btnInformeFecha.setText("Informe por Fecha");
        btnInformeFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformeFechaActionPerformed(evt);
            }
        });
        add(btnInformeFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, -1, -1));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Lista de Ventas");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel13.setMinimumSize(new java.awt.Dimension(623, 36));
        jLabel13.setPreferredSize(new java.awt.Dimension(643, 70));
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 300, 50));
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

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        //Evento que ejecuta el reset del formulario
        cargarVentas();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        //Evento para filtrar la lista de ventas, en base a las condiciones cumplidas
        if (chooseFecha.getDate() != null) {
            Date date = chooseFecha.getDate();
            long d = date.getTime();
            java.sql.Date fecha2 = new java.sql.Date(d);
            VentaBean vb = new VentaBean();
            List listVentas = vb.listVenta(fecha2);
            if (listVentas != null && !listVentas.isEmpty()) {
                if (codProducto.getText() != null && !codProducto.getText().isEmpty()) {
                    int idProduc = Integer.parseInt(codProducto.getText());
                    if (codCliente.getText() != null && !codCliente.getText().isEmpty()) {
                        int idClien = Integer.parseInt(codCliente.getText());
                        cargarVentasFechaProductoCliente(listVentas, idProduc, idClien);
                    } else {
                        cargarVentasFechaProducto(listVentas, idProduc);
                    }
                } else {
                    if (codCliente.getText() != null && !codCliente.getText().isEmpty()) {
                        int idClien = Integer.parseInt(codCliente.getText());
                        cargarVentasFechaCliente(listVentas, idClien);
                    } else {
                        cargarVentasFecha(listVentas);
                    }
                }
            } else {
                cargarVentas();
            }

        } else {
            if (codProducto.getText() != null && !codProducto.getText().isEmpty()) {
                int idProduc = Integer.parseInt(codProducto.getText());
                if (codCliente.getText() != null && !codCliente.getText().isEmpty()) {
                    int idClien = Integer.parseInt(codCliente.getText());
                    cargarVentasProductoCliente(idProduc, idClien);
                } else {
                    cargarVentasProducto(idProduc);
                }
            } else {
                if (codCliente.getText() != null && !codCliente.getText().isEmpty()) {
                    int idClien = Integer.parseInt(codCliente.getText());
                    cargarVentasCliente(idClien);
                } 
            }
        }
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void codProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codProductoKeyTyped
        //Evento para restringir la escritura de solo numeros
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_codProductoKeyTyped

    private void codClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codClienteKeyTyped
        //Evento para restringir la escritura de solo numeros
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_codClienteKeyTyped

    private void btnInformeFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformeFechaActionPerformed
        //Evento para generar el report en base a la fecha establecida
        String consulta = " ";
        CrearInforme pepe = new CrearInforme();
        Map<String, Object> mapita = new HashMap<>();

        if (chooseFecha.getDate() != null) {
            Date date = chooseFecha.getDate();
            long d = date.getTime();
            java.sql.Date fecha2 = new java.sql.Date(d);
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String stringDate = dateFormat.format(fecha2);
            System.out.println(stringDate);
            consulta = "where fecha = '" + stringDate + "'";
            mapita.put("FILTRO", consulta);
            pepe.metodoGenerarInforme(mapita);
        } else {
            mapita.put("FILTRO", consulta);
            pepe.metodoGenerarInforme(mapita);
        }


    }//GEN-LAST:event_btnInformeFechaActionPerformed

    //Metodo para cargar la lista de ventas basada en un cliente
    public void cargarVentasCliente(int idCliente) {
        DecimalFormat df = new DecimalFormat("#");
        VentaBean vb = new VentaBean();
        ProductoBean pb = new ProductoBean();
        ClienteBean cb = new ClienteBean();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Cod Producto");
        modelo.addColumn("Cod Cliente");
        modelo.addColumn("Precio");
        modelo.addColumn("Fecha");
        List listVenta = vb.listVentaProducto(idCliente);
        if (listVenta != null && !listVenta.isEmpty()) {
            for (Iterator iterator = listVenta.iterator(); iterator.hasNext();) {
                Venta v = (Venta) iterator.next();
                Producto p = v.getProducto();
                int id_Producto = p.getCodigo();
                Producto pN = pb.obtenerProducto(id_Producto);
                Cliente cl = v.getCliente();
                int id_Cliente = cl.getCodCliente();
                Cliente clN = cb.obtenerCliente(id_Cliente);
                Object[] fila = new Object[5];
                fila[0] = v.getCodVenta();
                fila[1] = pN.getCodigo();
                fila[2] = clN.getCodCliente();
                fila[3] = df.format(pN.getPrecioDeVenta());
                String fechad = convertToLocalDateViaInstant(v.getFecha()).toString();
                fila[4] = fechad;
                modelo.addRow(fila);
            }
        }
        jTable1.setModel(modelo);
    }
    //Metodo para cargar la lista de ventas basada en un producto y un cliente

    public void cargarVentasProductoCliente(int idProduc, int idCliente) {
        DecimalFormat df = new DecimalFormat("#");
        VentaBean vb = new VentaBean();
        ProductoBean pb = new ProductoBean();
        ClienteBean cb = new ClienteBean();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Cod Producto");
        modelo.addColumn("Cod Cliente");
        modelo.addColumn("Precio");
        modelo.addColumn("Fecha");
        Cliente cFiltro = cb.obtenerCliente(idCliente);
        List listVenta = vb.listVentaProducto(idProduc);
        if (listVenta != null && !listVenta.isEmpty()) {
            for (Iterator iterator = listVenta.iterator(); iterator.hasNext();) {
                Venta v = (Venta) iterator.next();
                Producto p = v.getProducto();
                int id_Producto = p.getCodigo();
                Producto pN = pb.obtenerProducto(id_Producto);
                Cliente cl = v.getCliente();
                if (cl != null) {
                    int id_Cliente = cl.getCodCliente();
                    Cliente clN = cb.obtenerCliente(id_Cliente);
                    if (clN.getCodCliente().equals(cFiltro.getCodCliente())) {
                        Object[] fila = new Object[5];
                        fila[0] = v.getCodVenta();
                        fila[1] = pN.getCodigo();
                        fila[2] = clN.getCodCliente();
                        fila[3] = df.format(pN.getPrecioDeVenta());
                        String fechad = convertToLocalDateViaInstant(v.getFecha()).toString();
                        fila[4] = fechad;
                        modelo.addRow(fila);
                    }
                }
            }
        }
        jTable1.setModel(modelo);
    }
    //Metodo para cargar la lista de ventas basada en un producto

    public void cargarVentasProducto(int idProduc) {
        DecimalFormat df = new DecimalFormat("#");
        VentaBean vb = new VentaBean();
        ProductoBean pb = new ProductoBean();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Cod Producto");
        modelo.addColumn("Cod Cliente");
        modelo.addColumn("Precio");
        modelo.addColumn("Fecha");
        List listVenta = vb.listVentaProducto(idProduc);
        if (listVenta != null && !listVenta.isEmpty()) {
            for (Iterator iterator = listVenta.iterator(); iterator.hasNext();) {
                Venta v = (Venta) iterator.next();
                Producto p = v.getProducto();
                int id_Producto = p.getCodigo();
                Producto pN = pb.obtenerProducto(id_Producto);
                Object[] fila = new Object[5];
                fila[0] = v.getCodVenta();
                fila[1] = pN.getCodigo();
                fila[2] = "---";
                fila[3] = df.format(pN.getPrecioDeVenta());
                String fechad = convertToLocalDateViaInstant(v.getFecha()).toString();
                fila[4] = fechad;
                modelo.addRow(fila);
            }
        }
        jTable1.setModel(modelo);
    }
    //Metodo para cargar la lista de ventas basada en una fecha

    public void cargarVentasFecha(List listVenta) {
        DecimalFormat df = new DecimalFormat("#");
        ProductoBean pb = new ProductoBean();
        ClienteBean cb = new ClienteBean();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Cod Producto");
        modelo.addColumn("Cod Cliente");
        modelo.addColumn("Precio");
        modelo.addColumn("Fecha");
        for (Iterator iterator = listVenta.iterator(); iterator.hasNext();) {
            Venta v = (Venta) iterator.next();
            Producto p = v.getProducto();
            int id_Producto = p.getCodigo();
            Producto pN = pb.obtenerProducto(id_Producto);
            Cliente cl = v.getCliente();
            if (cl != null) {
                int id_Cliente = cl.getCodCliente();
                Cliente clN = cb.obtenerCliente(id_Cliente);
                Object[] fila = new Object[5];
                fila[0] = v.getCodVenta();
                fila[1] = pN.getCodigo();
                fila[2] = clN.getCodCliente();
                fila[3] = df.format(pN.getPrecioDeVenta());
                String fechad = convertToLocalDateViaInstant(v.getFecha()).toString();
                fila[4] = fechad;
                modelo.addRow(fila);
            } else {
                Object[] fila = new Object[5];
                fila[0] = v.getCodVenta();
                fila[1] = pN.getCodigo();
                fila[2] = "---";
                fila[3] = df.format(pN.getPrecioDeVenta());

                System.out.println(v.getFecha().toString());
                String fechad = convertToLocalDateViaInstant(v.getFecha()).toString();
                fila[4] = fechad;
                modelo.addRow(fila);
            }
        }

        jTable1.setModel(modelo);
    }
    //Metodo para cargar la lista de ventas en base a una fecha y un producto

    public void cargarVentasFechaProducto(List listVenta, int idProducto) {
        DecimalFormat df = new DecimalFormat("#");
        ProductoBean pb = new ProductoBean();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Cod Producto");
        modelo.addColumn("Cod Cliente");
        modelo.addColumn("Precio");
        modelo.addColumn("Fecha");
        Producto pfiltro = pb.obtenerProducto(idProducto);
        for (Iterator iterator = listVenta.iterator(); iterator.hasNext();) {
            Venta v = (Venta) iterator.next();
            Producto p = v.getProducto();
            int id_Producto = p.getCodigo();
            Producto pN = pb.obtenerProducto(id_Producto);

            if (pN.getCodigo().equals(pfiltro.getCodigo())) {
                Object[] fila = new Object[5];
                fila[0] = v.getCodVenta();
                fila[1] = pN.getCodigo();
                fila[2] = "---";
                fila[3] = df.format(pN.getPrecioDeVenta());
                String fechad = convertToLocalDateViaInstant(v.getFecha()).toString();
                fila[4] = fechad;
                modelo.addRow(fila);
            }
        }
        jTable1.setModel(modelo);
    }
    //Metodo para cargar la lista de ventas en base a una fecha, producto y cliente

    public void cargarVentasFechaProductoCliente(List listVenta, int idProducto, int idCliente) {
        DecimalFormat df = new DecimalFormat("#");
        ProductoBean pb = new ProductoBean();
        ClienteBean cb = new ClienteBean();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Cod Producto");
        modelo.addColumn("Cod Cliente");
        modelo.addColumn("Precio");
        modelo.addColumn("Fecha");
        Producto pfiltro = pb.obtenerProducto(idProducto);
        Cliente cfiltro = cb.obtenerCliente(idCliente);
        for (Iterator iterator = listVenta.iterator(); iterator.hasNext();) {
            Venta v = (Venta) iterator.next();
            Producto p = v.getProducto();
            int id_Producto = p.getCodigo();
            Producto pN = pb.obtenerProducto(id_Producto);
            Cliente cl = v.getCliente();
            if (pN.getCodigo().equals(pfiltro.getCodigo()) && cl != null) {
                int id_Cliente = cl.getCodCliente();
                Cliente clN = cb.obtenerCliente(id_Cliente);
                if (clN.getCodCliente().equals(cfiltro.getCodCliente())) {
                    Object[] fila = new Object[5];
                    fila[0] = v.getCodVenta();
                    fila[1] = pN.getCodigo();
                    fila[2] = clN.getCodCliente();
                    fila[3] = df.format(pN.getPrecioDeVenta());
                    String fechad = convertToLocalDateViaInstant(v.getFecha()).toString();
                    fila[4] = fechad;
                    modelo.addRow(fila);
                }
            }
        }
        jTable1.setModel(modelo);
    }
    //Metodo para cargar la lista de ventas en base a una fecha y un id de cliente

    public void cargarVentasFechaCliente(List listVenta, int idCliente) {
        DecimalFormat df = new DecimalFormat("#");
        ProductoBean pb = new ProductoBean();
        ClienteBean cb = new ClienteBean();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Cod Producto");
        modelo.addColumn("Cod Cliente");
        modelo.addColumn("Precio");
        modelo.addColumn("Fecha");
        Cliente cfiltro = cb.obtenerCliente(idCliente);
        for (Iterator iterator = listVenta.iterator(); iterator.hasNext();) {
            Venta v = (Venta) iterator.next();
            Producto p = v.getProducto();
            int id_Producto = p.getCodigo();
            Producto pN = pb.obtenerProducto(id_Producto);
            Cliente cl = v.getCliente();
            if (cl != null) {
                int id_Cliente = cl.getCodCliente();
                Cliente clN = cb.obtenerCliente(id_Cliente);
                if (clN.getCodCliente().equals(cfiltro.getCodCliente())) {
                    Object[] fila = new Object[5];
                    fila[0] = v.getCodVenta();
                    fila[1] = pN.getCodigo();
                    fila[2] = clN.getCodCliente();
                    fila[3] = df.format(pN.getPrecioDeVenta());
                    String fechad = convertToLocalDateViaInstant(v.getFecha()).toString();
                    fila[4] = fechad;
                    modelo.addRow(fila);
                }
            }
        }
        jTable1.setModel(modelo);
    }
    //Metodo para cargar la lista de ventas existentes

    public void cargarVentas() {
        DecimalFormat df = new DecimalFormat("#");
        VentaBean vb = new VentaBean();
        ProductoBean pb = new ProductoBean();
        ClienteBean cb = new ClienteBean();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Cod Producto");
        modelo.addColumn("Cod Cliente");
        modelo.addColumn("Precio");
        modelo.addColumn("Fecha");
        List listVenta = vb.listVenta();
        if (listVenta != null && !listVenta.isEmpty()) {
            for (Iterator iterator = listVenta.iterator(); iterator.hasNext();) {
                Venta v = (Venta) iterator.next();
                Producto p = v.getProducto();
                int id_Producto = p.getCodigo();
                Producto pN = pb.obtenerProducto(id_Producto);
                Cliente cl = v.getCliente();
                if (cl != null) {
                    int id_Cliente = cl.getCodCliente();
                    Cliente clN = cb.obtenerCliente(id_Cliente);
                    Object[] fila = new Object[5];
                    fila[0] = v.getCodVenta();
                    fila[1] = pN.getCodigo();
                    fila[2] = clN.getCodCliente();
                    fila[3] = df.format(pN.getPrecioDeVenta());
                    String fechad = convertToLocalDateViaInstant(v.getFecha()).toString();
                    fila[4] = fechad;
                    modelo.addRow(fila);
                } else {
                    Object[] fila = new Object[5];
                    fila[0] = v.getCodVenta();
                    fila[1] = pN.getCodigo();
                    fila[2] = "---";
                    fila[3] = df.format(pN.getPrecioDeVenta());
                    String fechad = convertToLocalDateViaInstant(v.getFecha()).toString();
                    fila[4] = fechad;
                    modelo.addRow(fila);
                }
            }
        }
        jTable1.setModel(modelo);
    }

    //Metodo para converitr un Date a LocalDate
    public LocalDate convertToLocalDateViaInstant(Date dateToConvert) {
        return dateToConvert.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnInformeFecha;
    private javax.swing.JButton btnReset;
    private com.toedter.calendar.JDateChooser chooseFecha;
    private javax.swing.JTextField codCliente;
    private javax.swing.JTextField codProducto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
