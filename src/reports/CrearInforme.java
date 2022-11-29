package reports;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 * Clase CrearInforme, en esta clase se establece una conexion a la BBDD para
 * generar reportes de las tablas que se desee mediante un Map que contiene la
 * consulta para BBDD
 * @author Carlos Halberth Almanza Lopez 
 */
public class CrearInforme {

    /*
*   Propiedades
     */
    private Connection conexion;

    /*
    *Constructor
    *dentro del constructor se especifica el Driver de conexion,
    *y la los datos para la conexion a la BBDD url,user,pass
     */
    public CrearInforme() {

        conexion = null;
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/dbentremarcas", "root", "root");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CrearInforme.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CrearInforme.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /*
*   Metodo para generar el reporte, recibe un Map por parametro el cual contendra una consulta para la BBDD
    *dentro del metodo se define la ruta del proyecto, el reporte que se generara, atravez del jasper    
     */
    public void metodoGenerarInforme(Map mapa) {
        String ruta;
        InputStream vinculoarchivo = null;
        File miDir = new File(".");//Permite obtener la ruta actual del proyecto
        try {
            ruta = miDir.getCanonicalPath() + "\\src\\reports\\Informe1.jrxml"; 
            vinculoarchivo = new FileInputStream(ruta);
        } catch (IOException ex) {
            Logger.getLogger(CrearInforme.class.getName()).log(Level.SEVERE, null, ex);
        }
        JasperReport jr = null;
        try {
            jr = JasperCompileManager.compileReport(vinculoarchivo);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jr, mapa, conexion);
            JasperViewer visor = new JasperViewer(jasperPrint, false);
            visor.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(CrearInforme.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
