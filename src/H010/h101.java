package H010;



import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class h101 extends Applet {
    int cijfers, uitkomst;
    TextField tekstvak;

    public void init() {
        tekstvak = new TextField(50);
        tekstvak.addActionListener( new VakListener() );
        add( tekstvak );
        uitkomst = 0;
    }

    public void paint(Graphics g) {
        g.drawString(String.valueOf(uitkomst), 200, 45);
    }

    class VakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s;

            s = tekstvak.getText();
            cijfers = Integer.parseInt( s );
            if (cijfers > uitkomst) {
                uitkomst = cijfers;
            }
            repaint();
        }
    }
}