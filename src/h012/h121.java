package h012;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class h121 extends Applet {

    //Declaratie
    double[] Gemiddelde;
    double Uitkomst;
    double A;
    double B;
    double C;
    double D;
    double E;
    double F;
    double G;
    double H;
    double I;
    double J;


    public void init() {

        //Initalisatie
        A = 6;
        B = 6;
        C = 5;
        D = 4.3;
        E = 8.1;
        F = 10;
        G = 7;
        H = 6.8;
        I = 6.8;
        J = 8;

        Gemiddelde = new double[11];
        Uitkomst = (A + B + C + D + E + F + G + H + I + J) / 10;

        //Initalisatie berekening gemiddelde
        Gemiddelde[0] = A;
        Gemiddelde[1] = B;
        Gemiddelde[2] = C;
        Gemiddelde[3] = D;
        Gemiddelde[4] = E;
        Gemiddelde[5] = F;
        Gemiddelde[6] = G;
        Gemiddelde[7] = H;
        Gemiddelde[8] = I;
        Gemiddelde[9] = J;
        Gemiddelde[10] = Uitkomst;

        for (int teller = 0; teller < Gemiddelde.length; teller++) {
        }
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < Gemiddelde.length; teller++) {
            g.drawString("" + Gemiddelde[teller],105,20 * teller + 20);
        }
        g.drawString("Gemiddelde: ",20,220);
    }
}
