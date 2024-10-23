package com.mycompany.parqueos.callejeros;

//==================== Import ==================== \\.

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;
import javax.swing.JTextField;


//==================== Clase ==================== \\.
/**
 * 
 * @author ariel
 */

class PanelDegradado extends JPanel {

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
}

