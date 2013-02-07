/*
 * Program: FanDrawer.java
 * Desc: Draws a fan using the graphics classes. It also rotates the fan from 
 * central point.
 * Author: Matthew Harding 
 */
package fandrawer;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class FanDrawer extends JComponent
{
    double currentTheta;

    
     private class TimerListener implements ActionListener
	    {
                //actionPerformed is what occurs every 10 milliseconds
                //this was set up where timer was initiated.
	        public void actionPerformed(ActionEvent e)
	        {
                    //the repaint() command is what actually
                    //repaints the canvas.
	            repaint();
	        }
	    }
     
    public static void main(String[] args)
    {
        //setting up the JFrame.
        JFrame window = new JFrame();
        window.setTitle("Fan");
        window.setSize(500, 500);
        window.setLocation(100,100);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //adds FanDrawer into the JFrame.
        window.add(new FanDrawer());
       
       
         
    }
    
    public FanDrawer()
    {
        //default constructor calls the timer method.
        Timer timer = new Timer(10, new TimerListener());
        timer.start();
        
    }
    
    
   public void paintComponent (Graphics g)
    {
         super.paintComponent(g);
         
         Graphics2D g2d = (Graphics2D) g;
         
         //currentTheta controls the rotation speed of the fan
         currentTheta = currentTheta + .05;
         
         //sets currenTheta to rotation, and then uses the next two
         //points for the center rotation point.
         g2d.rotate(currentTheta, 250.5 , 175.5);
         
         //draws the fan blades. Could have used arcs here...but I like
         //the ovals better. Looks more like a propeller!
         g.setColor(Color.GRAY);
         g.fillOval(225, 50, 50, 150);
         g.fillOval(225, 150, 150, 50);
         g.fillOval(225, 150, 50, 150);
         g.fillOval(125, 150, 150, 50);
         
         //draws the center of the fan
         g.setColor(Color.BLACK);
         g.fillOval(218,143,65,65);
         
         //draws the outline for the fan casing.
         g.drawOval(125,50, 250,250);
    }
    
}