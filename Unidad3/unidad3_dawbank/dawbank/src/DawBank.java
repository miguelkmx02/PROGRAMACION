// Permite usar el Scanner, que sirve para leer lo que el usuario escribe en el teclado
import java.util.Scanner;

public class DawBank {

    public static void main(String[] args) {
        // Crea el "oído" del programa: System.in es el teclado
        Scanner sc = new Scanner(System.in);

        // Caja para la cuenta. null significa "todavía no hay ninguna cuenta"
        CuentaBancaria cuenta = null;

        // Repite mientras no se haya conseguido crear la cuenta
        while (cuenta == null) {
            System.out.print("Introduce el IBAN: ");
            String iban = sc.nextLine();

            System.out.print("Introduce el titular: ");
            String titular = sc.nextLine();

            // try: intenta crear la cuenta con los datos escritos
            try {
                // Si los datos son buenos, la cuenta se crea y cuenta deja de ser null
                cuenta = new CuentaBancaria(iban, titular);
                System.out.println("Cuenta creada correctamente");
                // catch: si el constructor lanza un throw (IBAN o titular no válidos), entra aquí
            } catch (IllegalArgumentException e) {
                // Escribe el mensaje del throw. cuenta sigue siendo null, así que el while repite
                System.out.println("ERROR: " + e.getMessage());
            }
        }
        // Caja donde se guarda la opción. Empieza en 0 para que Java sepa que ya tiene un valor
        int opcion = 0;

        // do...while: hace lo de dentro AL MENOS UNA VEZ y lo repite mientras la condición del final sea verdadera
        do {
            // Muestra el menú
            System.out.println();
            System.out.println("===== DAWBANK =====");
            System.out.println("1. Datos de la cuenta");
            System.out.println("2. IBAN");
            System.out.println("3. Titular");
            System.out.println("4. Saldo");
            System.out.println("5. Ingreso");
            System.out.println("6. Retirada");
            System.out.println("7. Movimientos");
            System.out.println("8. Salir");
            System.out.print("Elige una opción: ");

            try {
                // Lee lo que escribe el usuario (texto) y lo convierte en un número entero.
                // Si escribe letras, aquí salta un error y lo recoge el catch
                opcion = Integer.parseInt(sc.nextLine());
            // switch: según el valor de opcion, ejecuta el case que coincida
            switch (opcion) {
                case 1:
                    // Si opcion vale 1, muestra los tres datos de la cuenta, cada uno en su línea
                    System.out.println("IBAN: " + cuenta.getIban());
                    System.out.println("Titular: " + cuenta.getTitular());
                    System.out.println("Saldo: " + cuenta.getSaldo() + " €");
                    break; // termina este case y sale del switch
                case 2:
                    // Si opcion vale 2, muestra el IBAN de la cuenta
                    System.out.println("IBAN: " + cuenta.getIban());
                    break; // termina este case y sale del switch
                case 3:
                    // Si opcion vale 3, muestra el titular de la cuenta
                    System.out.println("Titular: " + cuenta.getTitular());
                    break; // termina este case y sale del switch
                case 4:
                    // Si opcion vale 4, muestra el saldo de la cuenta
                    System.out.println("Saldo: " + cuenta.getSaldo() + " €");
                    break; // termina este case y sale del switch
                case 5:
                    // Si opcion vale 5, pide la cantidad a ingresar
                    System.out.print("Cantidad a ingresar: ");
                    // Lee lo que escribe el usuario (texto) y lo convierte en un número con decimales
                    double cantidadIngreso = Double.parseDouble(sc.nextLine());
                    // Llama al método ingresar de la cuenta, que suma el dinero y guarda el movimiento
                    cuenta.ingresar(cantidadIngreso);
                    // Solo llega aquí si el ingreso ha ido bien
                    System.out.println("Ingreso realizado");
                    // Si la cantidad ingresada es mayor de 3000, avisa para notificar a hacienda
                    if (cantidadIngreso > 3000) {
                        System.out.println("AVISO: Notificar a hacienda");
                    }
                    // Si el saldo ha quedado por debajo de 0, avisa de que es negativo
                    if (cuenta.getSaldo() < 0) {
                        System.out.println("AVISO: Saldo negativo");
                    }
                    break; // termina este case y sale del switch
                case 6:
                    // Si opcion vale 6, pide la cantidad a retirar
                    System.out.print("Cantidad a retirar: ");
                    // Lee lo que escribe el usuario (texto) y lo convierte en un número con decimales
                    double cantidadRetirada = Double.parseDouble(sc.nextLine());
                    // Llama al método retirar de la cuenta, que resta el dinero y guarda el movimiento
                    cuenta.retirar(cantidadRetirada);
                    // Solo llega aquí si la retirada ha ido bien
                    System.out.println("Retirada realizada");
                    // Si la cantidad retirada es mayor de 3000, avisa para notificar a hacienda
                    if (cantidadRetirada > 3000) {
                        System.out.println("AVISO: Notificar a hacienda");
                    }
                    // Si el saldo ha quedado por debajo de 0, avisa de que es negativo
                    if (cuenta.getSaldo() < 0) {
                        System.out.println("AVISO: Saldo negativo");
                    }
                    break; // termina este case y sale del switch
                case 7:
                    // Si opcion vale 7, muestra el historial de movimientos de la cuenta
                    // (el método ya se encarga de avisar si no hay ninguno)
                    cuenta.mostrarMovimientos();
                    break; // termina este case y sale del switch
                case 8:
                    System.out.println("Gracias por usar DawBank. ¡Hasta pronto!");
                    break; // sale del switch (no del bucle)
                default:
                    // default: lo que pasa si la opción no coincide con ningún case
                    System.out.println("Opción pendiente de programar");
                    break;
            }
                // catch: si lo escrito no es un número (letras, o decimales con coma), entra aquí
            } catch (NumberFormatException e) {
                System.out.println("ERROR: debes escribir un número (los decimales con punto)");
            } catch (IllegalArgumentException e) {
                // e.getMessage() entrega el texto que pusiste en el throw
                System.out.println("ERROR: " + e.getMessage());
            }

            // Si la opción NO es 8, vuelve arriba y repite el menú. Si es 8, el bucle termina
        } while (opcion != 8);
    }
}