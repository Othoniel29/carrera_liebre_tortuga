
package carrera_liebre_tortuga;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author OTHONIEL
 */
public class Animal extends Thread {
    String nombre;
    int limite;
    JLabel label;
    public Animal(String nombre, int limite, JLabel label){
        this.nombre = nombre;
        this.limite = limite;
        this.label = label;
        }
    
    @Override
    public void run(){
        for (int n = 0; n < limite;n++){
            try {
                System.out.println(nombre + "avanza");
                label.setLocation(n,0);
                Thread.sleep(20);
            } catch (InterruptedException ex) {
                Logger.getLogger(Animal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        JOptionPane.showMessageDialog(null,"la" + nombre + "llego a la meta");
        System.out.println("la" + nombre + "llego a la meta");
        yield();
    }
    
}

