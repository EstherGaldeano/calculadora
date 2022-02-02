
package calculadora;

import java.util.Scanner;

/**
 *
 * @author sterg
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numAmigo = 1;
        int amigo1;
        int amigo2;
        int amigo3;
        int amigo4;
        int total;
        
        System.out.println("Cuánto dinero tiene el amigo " + numAmigo + ": ");
        numAmigo +=1;
        
        amigo1 = new Scanner(System.in).nextInt();
        
        System.out.println("Cuánto dinero tiene el amigo " + numAmigo + ": ");
        numAmigo +=1;
        
        amigo2 = new Scanner(System.in).nextInt();
        
         System.out.println("Cuánto dinero tiene el amigo " + numAmigo + ": ");
        numAmigo +=1;
        
        amigo3 = new Scanner(System.in).nextInt();
        
         System.out.println("Cuánto dinero tiene el amigo " + numAmigo + ": ");
        numAmigo +=1;
        
        amigo4 = new Scanner(System.in).nextInt();
        
        total= amigo1 + amigo2 + amigo3 + amigo4;
        
        System.out.println("El total es " + total);
        System.out.println("La mediana es " + (total/5));
        
    }
    
}
