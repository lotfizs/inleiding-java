package h111;

import java.applet.Applet;
import java.awt.*;

public class h113 extends Applet {

    public void paint(Graphics g) {
        int Getal = 1;
        int Getal2= 1;
        int x = 10;

        while (Getal < 100) {
            x += 40;
            g.drawString("" + Getal + " " + Getal2,x,10);
            Getal += Getal2;
            Getal2 += Getal;
        }
    }
}
