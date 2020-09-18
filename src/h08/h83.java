package h08;


import java.awt.*;
        import java.applet.*;
        import java.awt.event.*;

public class h83 extends Applet {
    TextField tekstvak;
    Label label;
    double getal;
    Button knop;
    double btw;
    String s;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type een getal");
        tekstvak.addActionListener(new TekstvakListener());
        add(label);
        add(tekstvak);

        knop = new Button("knop + 21%");
        knop.addActionListener(new knopListener());
        add(knop);

        btw = 0.21;


    }

    public void paint(Graphics g) {
        g.drawString("Het getal is " + getal, 50, 60);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble(s);
            repaint();
        }
    }
            class knopListener implements ActionListener {
                public void actionPerformed(ActionEvent e) {
                    s = tekstvak.getText();
                    getal = Double.parseDouble( s );
                    getal = getal * btw + getal;
                    repaint();

                }
            }
        }


