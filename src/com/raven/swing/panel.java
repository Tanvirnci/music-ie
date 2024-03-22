package com.raven.swing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

public class panel extends JPanel {

    public panel() {
        setOpaque(false);
    
    }
@Override
protected void printComponent(Graphics grphcs){
    Graphics2D q2 = (Graphics2D) grphcs;
    q2.setColor(Color.red);
    q2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
    q2.fillRoundRect(0,0,getWidth(),getHeight(),20,20);
    super.paintComponent(grphcs);
   
  
}
    
}


