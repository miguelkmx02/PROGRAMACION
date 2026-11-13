import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Ejercicio 1: Escribe un programa que dé los “buenos días”.
         */
        System.out.println("soy el ejercicio1, Buenos días");

        /*
        Ejercicio 2: Escribe un programa que calcule y muestre el área de un cuadrado de lado igual a 5.
         */
        System.out.println("Ejercicio 2");
        double lado = 7;
        double area = lado * lado;
        System.out.println("el area es:" + area);

        /*
        Ejercicio 3: Escribe un programa que calcule el área de un cuadrado cuyo
        lado se introduce por teclado.
         */
        System.out.println("EJERCICIO 3");
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el valor de lado");
        double lado2 = scan.nextDouble();
        System.out.println("El area del cuadrado es:"+(lado2*lado));

        /*
        Ejercicio 4:Escribe un programa que lea dos números, calcule y muestre el valor de sus suma, resta,
        producto y división.
         */
        System.out.println("Ejercicio 4");
        scan = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        double num1 = scan.nextDouble();
        System.out.println("Ingrese el segundo número");
        double num2 = scan.nextDouble();

        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division = num1 / num2;

        System.out.println("El resultado de la suma es:"+ suma);
        System.out.println("El resultado de la resta es:"+ resta);
        System.out.println("El resultado de la multiplicación es:"+ multiplicacion);
        System.out.println("El resultado de la division es:"+ division);

        /*
        Ejercicio 5: Escribe un programa que toma como dato de entrada un número que corresponde a la
        longitud de un radio y nos escribe la longitud de la circunferencia, el área del círculo y el
        volumen de la esfera que corresponden con dicho radio.
         */
        System.out.println("Ejercicio 5");
        scan = new Scanner(System.in);
        System.out.println("Ingrese longitud del radio");
        double radio = scan.nextDouble();

        double longitud = 2 * radio * Math.PI;
        double area1 = Math.PI * (radio * radio);
        double volumen = (4/3.0)*Math.PI*Math.pow(radio,3);

        System.out.println("la longitud es:" + longitud);
        System.out.println("el area es:"+ area1);
        System.out.println("el volumen es: "+ volumen);

        /*
        Ejercicio 6: Escribe un programa que dado el precio de un artículo y el precio de venta real nos
        muestre el porcentaje de descuento realizado
         */
        System.out.println("Ejercicio 6");
        scan = new Scanner(System.in);
        System.out.println("Ingrese precio articulo");
        double precioArticulo = scan.nextDouble();
        System.out.println("Ingrese precio venta");
        double precioFinal = scan.nextDouble();

        double rebaja= ((precioArticulo - precioFinal) / precioArticulo) * 100.0;

        System.out.println("La rebaja es del:" + rebaja + "%");

        /*
        Ejercicio 7: Escribe un programa que lea un valor correspondiente a una distancia en millas marinas
        y escriba la distancia en metros. Sabiendo que una milla marina equivale a 1.852 metros.
        */
        System.out.println("Ejercicio 7");
        scan = new Scanner(System.in);
        System.out.println("Ingrese distancia en millas");
        double milla = scan.nextDouble();

        double metros = milla * 1.852;

        System.out.println("La distancia en metros es " + metros);

        /*
        Ejercicio 8:Escribe un programa que lee dos números y los visualiza en orden ascendente.
         */
        System.out.println("Ejercicio 8");
        scan = new Scanner(System.in);
        System.out.println("Ingrese primer numero");
        double Num1 = scan.nextDouble();
        System.out.println("Ingrese segundo numero");
        double Num2 = scan.nextDouble();

        System.out.println("Los números en orden ascendente: " + Math.min (Num1,Num2) +">"+ Math.max(Num1,Num2));

        /*
        Ejercicio 9:Escribe un programa que lee dos números y nos dice cuál es el mayor o si son iguales.
         */
        System.out.println("Ejercicio 9");
        scan = new Scanner(System.in);
        System.out.println("Ingrese primer numero");
        double NUm1 = scan.nextDouble();
        System.out.println("Ingrese segundo numero");
        double NUm2 = scan.nextDouble();

        System.out.println("Los numeros son iguales "+(NUm1==NUm2));
        System.out.println("El primer numero es mayor que el segundo: " + (NUm1 > NUm2));

        /*
        Ejercicio 10:Escribe un programa que lea tres números distintos y nos diga cuál es el mayor.
         */
        System.out.println("Ejercicio 10");
        scan = new Scanner(System.in);
        System.out.println("Ingrese primer numero");
        double nuM1 = scan.nextDouble();
        System.out.println("Ingrese segundo numero");
        double nuM2 = scan.nextDouble();
        System.out.println("Ingrese tercer numero");
        double nuM3 = scan.nextDouble();

        System.out.println("EL numero mayor es: "+ Math.max(nuM1, (Math.max(nuM2, nuM3))));

        /*
        Ejercicio 11:. Escribe un programa que lee dos números, calcula y muestra el valor de su suma, resta,
        producto y división. (Ten en cuenta la división por cero).
         */
        System.out.println("Ejercicio 11");
        scan = new Scanner(System.in);
        System.out.println("Ingrese primer numero");
        double num5 = scan.nextDouble();
        System.out.println("Ingrese segundo numero");
        double num6 = scan.nextDouble();

        double suma2 = num5 + num6;
        double resta2 = num5 - num6;
        double multiplicacion2 = num5 * num6;
        double division2 = (num5 / num6)*0;

        System.out.println("El resultado de la suma es:"+ suma2);
        System.out.println("El resultado de la resta es:"+ resta2);
        System.out.println("El resultado de la multiplicación es:"+ multiplicacion2);
        System.out.println("El resultado de la division es:"+ division2 + "multiplicado por 0");

        /*
        Ejercicio 12:Escribe un programa que lee 2 números y muestra el mayor.
         */
        System.out.println("Ejercicio 12");
        scan = new Scanner(System.in);
        System.out.println("Ingrese primer numero");
        double num7 = scan.nextDouble();
        System.out.println("Ingrese segundo numero");
        double num8 = scan.nextDouble();

        System.out.println("EL numero mayor es: "+ Math.max(num7,num8));

        /*
        Ejercicio 13: Escribe un programa que lee un número y me dice si es positivo o negativo
        consideraremos el cero como positivo.
         */
        System.out.println("Ejercicio 13");
        scan = new Scanner(System.in);
        System.out.println("Ingrese numero");
        double num9 = scan.nextDouble();

        System.out.println("El numero es positivo :" +(num9 >= 0));
        System.out.println("El numero es negativo :" +(num9 < 0));

    }
}