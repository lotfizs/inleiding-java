package h02;


import java.awt.*;
import java.applet.*;

public class Show extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawLine(20, 20, 60, 70);
        g.drawLine(60, 70, 100, 20);
        g.drawLine(20, 20, 100, 20);
        g.drawRect(150,100,100,100);
        g.drawLine(150,100,200,50);
        g.drawLine(250,100,200,50);
        g.drawRect(185,160,30,40);
        g.drawRect(160,120,30,20);
        g.drawRect(210,120,30,20);
    }
    }
