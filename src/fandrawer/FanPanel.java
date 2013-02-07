
package fandrawer;

import java.awt.*;
import javax.swing.*;


public class FanPanel extends JPanel
{
    double currentTheta;
    public void paintComponent (Graphics g)
    {
         super.paintComponent(g);
         
         /*Graphics2D g2d = (Graphics2D) g;
         
         currentTheta = currentTheta + .3;
         
        // g2d.translate(400, 0);
         //g2d.translate(this.getWidth() / 2, this.getHeight() / 2);
	
         
         g2d.rotate(currentTheta, 250.5 , 175.5);
         
         g.setColor(Color.GRAY);
         g.fillOval(225, 50, 50, 150);
         g.fillOval(225, 150, 150, 50);
         g.fillOval(225, 150, 50, 150);
         g.fillOval(125, 150, 150, 50);
         
         g.setColor(Color.BLACK);
         g.fillOval(218,143,65,65);
         
         g.drawOval(125,50, 250,250);
         */
         String haha = "Hello";
         g.drawString(haha, 100, 100);
         JLabel geet = new JLabel("HAHA");
         add(geet);
         
    }
    
}
