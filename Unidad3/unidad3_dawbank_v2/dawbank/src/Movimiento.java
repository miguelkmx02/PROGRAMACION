
//Plantilla de un movimiento

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Movimiento {

    private int id;
    private LocalDateTime fecha;

    private Tipo tipo;

    ;
    private double cantidad;
    /*
    class Movimiento es el nombre del formulario.
    Las cuatro líneas de dentro son las casillas: id, fecha, tipo y cantidad.
    Cada casilla guarda un tipo de dato distinto: números enteros (int), texto (String) y números con decimales (double).
    Ahora hace falta algo que rellene el formulario. Eso se llama constructor. Añádelo debajo de las cuatro casillas, dentro de la clase:
     */


    public Movimiento(int id, Tipo tipo, double cantidad) {
        this.id = id;
        this.fecha = LocalDateTime.now();
        this.tipo = tipo;
        this.cantidad = cantidad;
    }
    /*
     Entre paréntesis van los datos que le das al crear el movimiento. Dentro de las llaves, this.id = id; significa:
     “guarda el id que me han dado en mi casilla id”. El this quiere decir “este movimiento”. Se repite lo mismo con las otras tres casillas.
     */

    public void mostrarInfoMovimiento() {
        System.out.println("ID: " + id);
        System.out.println("Fecha: " + fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        System.out.println("Tipo: " + tipo);
        System.out.println("Cantidad: " + cantidad + " €");
    }
    /*
    System.out.println(...) escribe una línea en la pantalla.
    Lo que va entre comillas es texto fijo, como "ID: ".
    El + pega ese texto con el valor de la caja, y así sale ID: 1.
    public void significa que se puede llamar desde fuera y que no devuelve nada, solo muestra cosas.
     */

    }
