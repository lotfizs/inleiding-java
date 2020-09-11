package h06;


import java.awt.*;
import java.applet.*;


public class zespuntdrie extends Applet {
    int a, b, c;
    double uitkomst;


    public void init() {
        a = 20;
        b = 10;
        c = -5;
        uitkomst = (a + b) / c;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }
}