
package vistas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *  Clase Fondo extiende de JPanel, se utiliza para generar un fondo para todas
 * las ventanas que se utilizan en las vistas
 *  * @author Carlos Halberth Almanza Lopez
 */
public class Fondo extends javax.swing.JPanel{
    /*
    *Propiedades
    */
   private Image image;
   /*
   *Metodo paint, es el metodo para establecer la imagen que se utilizara de fondo
   *utiliza la propiedad Image y un objeto Graphics que recibe por parametro
   *@param Graphics
   */
   public void paint(Graphics q){
       image= new ImageIcon(getClass().getResource("/imagenes/logo.png")).getImage();
       q.drawImage(image,0,0,getWidth(),getHeight(),this);
       setOpaque(false);
       super.paint(q);
   }

}
