package h04;

import java.awt.*;
import java.applet.*;

public class vlag extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.pink);
        g.setColor(Color.red);
        g.fillRect(100, 125, 200, 50);
        g.setColor(Color.white);
        g.fillRect(100,170,200,50);
        g.setColor(Color.blue);
        g.fillRect(100,220,200,50);
        g.setColor(Color.black);
        g.fillRect(90,125,10,250);
    }
}