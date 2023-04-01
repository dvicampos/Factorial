package factorial;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Factorial {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x;
        x = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer valor del factorial: "));
        int i, aux;
        aux = 1;
        for(i=1; i<=x; i++){
            aux = aux * i;
        }
        JOptionPane.showMessageDialog(null,"El factorial de " + x + " es: " + aux);     
    }
}
