package h08;


import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class praktijk extends Applet {
    double getal, plus, min, keer, gedeeld;
    Button knopplus;
    Button knopmin;
    Button knopkeer;
    Button knopgedeeld;
    TextField eerste;
    TextField tweede;
    String a, b;


    public void init () {
        knopplus = new Button("+");
        knopplus.addActionListener(new plusListener());
        add(knopplus);

        knopmin = new Button("-");
        knopmin.addActionListener(new minListener());
        add(knopmin);

        knopkeer = new Button("*");
        knopkeer.addActionListener(new keerListener());
        add(knopkeer);

        knopgedeeld = new Button("/");
        knopgedeeld.addActionListener(new gedeeldListener());
        add(knopgedeeld);

        eerste = new TextField("", 10);
        tweede = new TextField("", 10);
        add(eerste);
        add(tweede);
    }
        public void paint(Graphics g) {

        }

       class plusListener implements ActionListener{
           public void actionPerformed(ActionEvent e) {
               String a = eerste.getText();
               String b = tweede.getText();
               getal = Double.parseDouble( a );
               plus = Double.parseDouble( b );
               getal = getal+plus;
               eerste.setText("" + getal);
               tweede.setText("");
               repaint();
           }
       }
    class minListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String a = eerste.getText();
            String b = tweede.getText();
            getal = Double.parseDouble( a );
            min = Double.parseDouble( b );
            getal = getal-min;
            eerste.setText("" + getal);
            tweede.setText("");
            repaint();
        }
    }
    class keerListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String a = eerste.getText();
            String b = tweede.getText();
            getal = Double.parseDouble( a );
            keer = Double.parseDouble( b );
            getal = getal*keer;
            eerste.setText("" + getal);
            tweede.setText("");
            repaint();
        }
    }
    class gedeeldListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String a = eerste.getText();
            String b = tweede.getText();
            getal = Double.parseDouble( a );
            gedeeld = Double.parseDouble( b );
            getal = getal/gedeeld;
            eerste.setText("" + getal);
            tweede.setText("");
            repaint();
        }
    }







    }







