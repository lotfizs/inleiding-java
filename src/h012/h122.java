package h012;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class h122 extends Applet {

    //Declaratie
    Button Buttons[] = new Button[25];

    public void init() {

        //Initalisatie
        for (int i = 0; i != 25; i++) {
            Buttons[i] = new Button("Knop " + String.valueOf(i + 1));
            add(Buttons[i]);
        }
    }
}
