
package tarea_3;

import java.util.Scanner;

/**
 *
 * @author Douglas
 */
public class Tarea_3 {

    static Scanner scan = new Scanner(System.in);
    static String[] usuarios = {"Vacío 1","Vacío 2","Vacío 3","Vacío 4","Vacío 5"};
    
    public static void main(String[] args) {
        int op;
        System.out.println("Tarea 3\n201603168");
        do {
            System.out.println("\nElije una opción:");
            System.out.println("1. Usuarios \n2. Palabras Palindromas\n3. Salir");
            op = scan.nextInt();
            System.out.println();
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
            }
        } while (op != 3);
    }
        
    private static void usuarios(){
        int opu;
        String name;
        System.out.println("Menú de Usuarios");
        do {    
            System.out.println("\nElije una opción:");
            System.out.println("1. Ingresar Usuarios \n2. Mostrar todos los usuarios\n3. Mostrar usuario personalizado\n4. Menú Principal\n5. Salir");
            opu = scan.nextInt();
            System.out.println();
                switch (opu){
                    case 1:
                        System.out.println("Ingrese los 5 usuarios");
                        for(int x=0; x<=4; x++){
                            usuarios[x] = scan.nextLine();
                        };
                        break;
                    case 2:
                        System.out.println("Mostrar todos los usuarios");
                        for(int y=0; y<=4; y++){
                            System.out.println((y + 1) + ". " + usuarios[y] );
                        };
                        break;
                    case 3:
                        System.out.println("Mostar Usuario Personalizado\n Ingresar Usuario");
                        name = scan.nextLine();
                        for(int z=0; z<=4; z++){
                            if(usuarios[z].equalsIgnoreCase(name)){
                                System.out.println("Usuario\n" + usuarios[z]);
                            } else {
                                System.out.println("ERROR, No existe ninguna coincidencia");
                            };
                        };
                        break;
                    case 4:
                        break;
                    case 5:
                        System.out.println("Adiós y gracias");
                        break;
                    default:
                        System.out.println("Opción incorrecta, prueba otra vez.\n");
                }
        } while (opu != 4 || opu == 5);
    }
    
    private static void palabras(){
        
    }
}