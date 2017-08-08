package tarea_3;

import java.util.Scanner;

/**
 *
 * @author Douglas
 */
public class Tarea_3 {

    static Scanner scan = new Scanner(System.in);
    static String[] usuarios = {"Vacío","Vacío","Vacío","Vacío","Vacío"};
    static int opu = 0;
    static int op = 0;
    static int aux = 0;
    static int nel = 0;
    
    public static void main(String[] args) {
        System.out.println("Tarea 3\n201603168");
        do {
            if (nel == 1){
                break;
            } else {
                System.out.println("\nElije una opción:");
                System.out.println("1. Usuarios \n2. Palabras Palindromas\n3. Salir");
                op = scan.nextInt();
                if (op == 3){
                    System.out.println("Adios y gracias");
                    break;
                }
                System.out.println();
                switch (op){
                    case 1:
                        usuarios();
                        break;
                    case 2:
                        palabras();
                        break;
                    default:
                        System.out.println("Opción incorrecta, prueba otra vez.\n");
                }
            }
        } while (op != 3);
    }
        
    private static void usuarios(){
        String name;
        System.out.println("Menú de Usuarios");
        do /*while (true)*/ {    
            System.out.println("\nElije una opción:");
            System.out.println("1. Ingresar Usuarios \n2. Mostrar todos los usuarios\n3. Mostrar usuario personalizado\n4. Regresar a Menú Principal\n5. Salir");
            opu = scan.nextInt();
            System.out.println();
                if (opu == 5){
                    nel = 1;
                    break;
                } else {
                    switch (opu){
                        case 1:
                            System.out.println("Ingrese los 5 usuarios");
                            scan.nextLine();
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
                            System.out.println("Mostar Usuario Personalizado\nIngresar Usuario");
                            name = scan.next();
                            System.out.println();
                            for(int z=0; z<=4; z++){
                                if(usuarios[z].equalsIgnoreCase(name)){
                                    aux = aux + 1;
                                }
                            }
                            if( aux > 0){
                                System.out.println("\nUsuario encontrado:");
                                System.out.println(name);
                            } else {
                                System.out.println("ERROR, No existe ninguna coincidencia");
                            };
                            break;
                        case 4:
                            break;
                        case 5:
                            nel = 1;
                            break;
                        default:
                            System.out.println("Opción incorrecta, prueba otra vez.\n");
                    }
                }
        } while (opu != 4);
    }
    
    private static void palabras(){
        String pal;
        System.out.println("Palabras Palindromas\nIngresar Palabra");
        scan.nextLine();
        pal = scan.nextLine();
        if (palindromo(pal))
            System.out.println("Tu palabra: " + pal + " es palindromo");
        else
            System.out.println("Tu palabra: " + pal + " no es palindromo");
    }
    
    static boolean palindromo(String palabra){
        String modificado = palabra.replaceAll(" ","").toLowerCase();
        int i=0;
        while (i < modificado.length() / 2)
        {
            if (modificado.charAt(i) != modificado.charAt(modificado.length() -1 -i))
                return false;
            i++;
        }
        return true;
    }
}