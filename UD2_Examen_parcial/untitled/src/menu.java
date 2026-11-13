import java.util.Scanner;
    /*
    Debe de generar un menú con la siguiente estructura:
    o Modificar colección:
    ▪ Insertar número.
    ▪ Borrar número de una posición específica
    ▪ Modificar número de una posición específica.
    o Estadísticas de la colección:
    ▪ Media de todos los valores no nulos.
    ▪ Suma de todos los valores.
    ▪ Máximo de la colección
    ▪ Mínimo de la colección
    o Ampliar el valor de la colección.
    o Salir.
     */

public class menu {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        String opcion = "9";

        IO.println("Introduzca Cantidad de números a almacenar:");
        num1 = sc.nextInt();
        double numeros[] =new double[num1];

        do{
            sc =  new Scanner(System.in);
            IO.println("Ingrese la opcion del menu que desea realizar: ");
            IO.println("1. Insertar número");
            IO.println("2. Borrar número de una posición específica");
            IO.println("3. Modificar número de una posición específica.");
            IO.println("4. Media de todos los valores no nulos.");
            IO.println("5. Suma de todos los valores. ");
            IO.println("6. Máximo de la colección ");
            IO.println("7. Mínimo de la colección");
            IO.println("8. Ampliar el valor de la colección.");
            IO.println("9. Salir.");

            opcion = sc.nextLine();

            switch (opcion) {
                case "1" ->{
                    sc = new Scanner(System.in);
                    IO.println(" Insertar número");
                }
                case "2" ->{
                    IO.println("Borrar número de una posición específica");
                     int index= -1;
                    IO.println("Introduzca la posicion a borrar:");
                    index = sc.nextInt();
                    numeros [index]= 0 ;




                }
                case "3" ->{
                    IO.println("Modificar número de una posición específica.");

                    int index= -1;
                    IO.println("Introduzca la posicion:");
                    index = sc.nextInt();

                    double valor = 0 ;

                    numeros[index] = valor;
                    IO.println("Introduzca el numero:");
                    valor = sc.nextInt();

                }
                case "4" ->{
                    IO.println("Media de todos los valores no nulos." );

                }
                case "5" ->{
                    IO.println("Suma de todos los valores. "  );
                }
                case "6" ->{
                    IO.println("Máximo de la colección ");
                }
                case "7" ->{
                    IO.println("Mínimo de la colección");
                }
                case "8" ->{
                    IO.println("Ampliar el valor de la colección");
                }
                case "9" ->{
                    IO.println("El programa se cerrara");
                }
                default -> IO.println("Opcion no permitida, introduzca una opcion entre 1 y 9");
            }

        }while(!opcion.equals("9"));

    }
}
