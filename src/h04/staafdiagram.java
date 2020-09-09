package h04;

import java.awt.*;
import java.applet.*;

public class staafdiagram extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        //kilogram
        g.drawString("100kg", 10, 50);
        g.drawString("80kg",10,75);
        g.drawString("60",10,100);
        g.drawString("40",10,125);
        g.drawString("20",10,150);
        g.drawString("0",10,175);

        // stefan
        //valerie
        g.setColor(Color.pink);
        g.fillRect(113,125,80,50);
        g.setColor(Color.black);
        g.drawString("valerie",130,190);
        //hans
        g.setColor(Color.darkGray);
        g.fillRect(184,75,66,100);
        g.setColor(Color.black);
        g.drawString("hans",204,190);
        //jeroen
        g.setColor(Color.blue);
        g.fillRect(50,50,66,125);
        g.setColor(Color.black);
        g.drawString("jeroen",60,190);

        //lijnen
        g.setColor(Color.black);
        g.drawRect(50,50,200,75);
        g.drawRect(50,50,200,25);
        g.drawRect(50,50,200,50);
        g.drawRect(50,50,200,75);









    }
}