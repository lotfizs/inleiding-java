package h06;

import java.awt.*;
import java.applet.*;


public class zespunteen extends Applet {
    double a,b,c, uitkomst;

    public void init() {
        a = 113;
        b = 4;
        uitkomst = a / b;}

        public void paint (Graphics g){


            g.drawString("Ali krijgt €" + uitkomst, 20, 20);
            g.drawString("Jan krijgt €" + uitkomst, 20, 40);
            g.drawString("Jeanette krijgt €" + uitkomst, 20, 60);
            g.drawString("Lotfi krijgt €" + uitkomst, 20, 80);
        }
    }