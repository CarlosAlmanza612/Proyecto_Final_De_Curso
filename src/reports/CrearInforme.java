/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
 *
 * @author DAM2
 */
public class CrearInforme {
        Connection conexion;
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
    public void metodoGenerarInforme2(Map mapa) {
        String ruta;
        InputStream vinculoarchivo = null;
        File miDir = new File(".");//Permite obtener la ruta actual del proyecto
        try {
            ruta = miDir.getCanonicalPath() + "\\src\\proyecto_unidad_05\\Informe2.jrxml";
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
