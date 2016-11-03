
package carrera_liebre_tortuga;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
/**
 *
 * @author OTHONIEL
 */
public class Carrera extends JFrame{
    JPanel[] paneles;
    JLabel[] labels;
    String[] nombres = {"Liebre", "Tortuga"};
    JButton boton;
    int ANCHO=900;
   public Carrera(){
       setLayout(new GridLayout(0,1));
       paneles = new JPanel[2];
       labels = new JLabel[2];
           for (int n=0; n<2;n++){
               paneles[n] = new JPanel();
               add (paneles[n]);
               labels[n] = new JLabel(nombres[n]);
               labels[n].setIcon(new ImageIcon(getClass().getResource(nombres[n]+ ".gif")));
       paneles[n].add(labels[n]);
       labels[n].setLocation(0,0);
   }
    boton = new JButton("iniciar carrera");
    boton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
            Animal liebre = new Animal ("liebre", ANCHO -250, labels[0]);
            Animal tortuga = new Animal ("tortuga", ANCHO -250, labels[1]);
            
            liebre.start();
            tortuga.start();
               //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }
       });
    add(boton);
            
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setLocation(200,250);
        setSize(ANCHO,750); 
        setVisible(true);
}
   public static void main(String[] args) {
       Carrera carrera = new Carrera();
   }
}

