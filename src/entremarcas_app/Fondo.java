/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entremarcas_app;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Usuario
 */
public class Fondo extends javax.swing.JPanel{
   private Image image;
   public void paint(Graphics q){
       image= new ImageIcon(getClass().getResource("/imagenes/logo.png")).getImage();
       q.drawImage(image,0,0,getWidth(),getHeight(),this);
       setOpaque(false);
       super.paint(q);
   }

}
