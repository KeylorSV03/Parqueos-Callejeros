<<<<<<< HEAD

=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
>>>>>>> master
package com.mycompany.parqueos.callejeros;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
<<<<<<< HEAD
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelDegradado extends JPanel {
=======
import javax.swing.JPanel;

/**
 *
 * @author keylo
 */
class PanelDegradado extends JPanel {
>>>>>>> master
        protected void  paintComponent(Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            int width = getWidth();
            int height = getHeight();
            
            Color color1 = new Color(167, 211, 224);
            Color color2 = new Color(61, 155, 194);
            GradientPaint gp  = new GradientPaint(0, 0, color1, 180, height, color2);
            g2d.setPaint(gp);
            g2d.fillRect(0, 0, width, height);
        }
<<<<<<< HEAD
    }
=======
    }
>>>>>>> master
