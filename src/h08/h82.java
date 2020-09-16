package h08;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class h82 extends Applet {
    double getal;
    Button vrouwenknop;
    Button meisjesknop;
    Button mannenknop;
    Button jongensknop;

    int vrouwenaantal, totaalaantal, meisjesaantal, mannenaantal, jongensaantal;


    public void init() {

        vrouwenknop = new Button("vrouwenknop + 1");
        vrouwenknop.addActionListener( new vrouwenknopListener() );
        add(vrouwenknop);

        meisjesknop = new Button("meisjesknop + 1");
        meisjesknop.addActionListener( new meisjesknopListener() );
        add(meisjesknop);

        mannenknop = new Button("vrouwenknop + 1");
        mannenknop.addActionListener( new mannenknopListener() );
        add(mannenknop);

        vrouwenknop = new Button("vrouwenknop + 1");
        vrouwenknop.addActionListener( new vrouwenknopListener() );
        add(vrouwenknop);
    }

    public void paint(Graphics g) {
        g.drawString("mannenaantal " + mannenaantal, 50, 60 );
        g.drawString("vrouwenaantal: "+ vrouwenaantal,50,75);
        g.drawString("totaalaantal: "+ totaalaantal, 50,90);
    }

    class vrouwenknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            vrouwenaantal ++;
            totaalaantal ++;
            repaint();
        }
    }
}