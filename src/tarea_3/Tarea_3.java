
package tarea_3;

import java.util.Scanner;

/**
 *
 * @author Douglas
 */
public class Tarea_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int op;
        System.out.println("Tarea 3\n201603168\n");
        do {
            System.out.println("Elije una opción:");
            System.out.println("1. Usuarios \n2. Palabras Palindromas\n3. Salir");
            op = scan.nextInt();
            switch (op){
                case 1:
                    usuarios();
                    break;
                case 2:
                    palabras();
                    break;
                case 3:
                    System.out.println("Adiós y gracias");
                    break;
                default:
                    System.out.println("Opción incorrecta, prueba otra vez.\n");
                    break;
            }
        } while (op != 3);
    }
    
    private static void usuarios(){
        System.out.println("Algo");
    }
    
    private static void palabras(){
        System.out.println("Algo");
    }
}