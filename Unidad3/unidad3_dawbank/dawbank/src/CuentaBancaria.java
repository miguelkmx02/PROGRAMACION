public class CuentaBancaria {

    private String iban;
    private String titular;
    private double saldo;
    private Movimiento[] movimientos = new Movimiento[100];
    private int numMovimientos;

    /*
    Los get sirven para leer una caja private desde fuera de la clase.
    En CuentaBancaria las cajas (iban, titular, saldo) son private, así que DawBank no puede escribir cuenta.saldo:
    Java daría error. Los get son la ventanilla por la que DawBank puede pedirle el dato a la cuenta:
     */
    public CuentaBancaria(String iban, String titular) {
        // Si el IBAN no tiene 2 letras y 22 números, no se puede crear la cuenta
        if (!ibanValido(iban)) {
            // Detiene el constructor y avisa del error: la cuenta no llega a crearse
            throw new IllegalArgumentException("IBAN no válido");
        }
        if (titular.isBlank()) {
            throw new IllegalArgumentException("El titular no puede estar vacío");
        }
        // Solo llega aquí si el IBAN es válido: se guardan los datos
        this.iban = iban;
        this.titular = titular;
        // Toda cuenta nueva empieza con 0 euros
        this.saldo = 0;
        this.numMovimientos = 0;
    }
    public String getIban() {
        return iban;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
    /*
    boolean es un tipo que solo puede valer true (sí) o false (no). El método responde si el IBAN es correcto.
    matches comprueba si el texto sigue un patrón.
    [A-Z]{2} significa dos letras mayúsculas.
    [0-9]{22} significa 22 números.
    static quiere decir que puedes usarlo sin tener una cuenta creada, que tiene sentido porque quieres comprobar
     el IBAN antes de crearla. Se llama así: CuentaBancaria.ibanValido(...).
     */
    public static boolean ibanValido(String iban) {
        return iban.matches("[A-Z]{2}[0-9]{22}");
    }
    /**
     * Ingresa dinero en la cuenta y registra el movimiento.
     * Lanza una excepción si la cantidad no es mayor que cero.
     */
    public void ingresar(double cantidad) {
        // Solo se puede ingresar una cantidad mayor que cero
        if (cantidad <= 0) {
            // Detiene el método y avisa del error: el saldo no se toca
            throw new IllegalArgumentException("La cantidad debe ser mayor que cero");
        }
        // Solo llega aquí si la cantidad es válida: se suma al saldo
        this.saldo = this.saldo + cantidad;
        // Se crea el movimiento; el id es el número de movimientos que ya había + 1
        Movimiento m = new Movimiento(numMovimientos + 1, "Ingreso", cantidad);
        // Se guarda en el primer hueco libre del array
        movimientos[numMovimientos] = m;
        // Se sube el contador para que el siguiente movimiento vaya al hueco siguiente
        numMovimientos++;
    }
    /**
     * Retira dinero de la cuenta y registra el movimiento.
     * Lanza una excepción si la cantidad no es mayor que cero
     * o si el saldo quedaría por debajo de -50 euros.
     */
    public void retirar(double cantidad) {
        // Solo se puede retirar una cantidad mayor que cero
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor que cero");
        }
        // El saldo nunca puede quedar por debajo de -50
        if (this.saldo - cantidad < -50) {
            throw new IllegalArgumentException("Saldo insuficiente: no puede bajar de -50 euros");
        }
        // Solo llega aquí si todo es válido: se resta la cantidad al saldo
        this.saldo = this.saldo - cantidad;
        // Se crea el movimiento de tipo Retirada
        Movimiento m = new Movimiento(numMovimientos + 1, "Retirada", cantidad);
        // Se guarda en el primer hueco libre y se sube el contador
        movimientos[numMovimientos] = m;
        numMovimientos++;
    }
    /**
     * Muestra todos los movimientos de la cuenta, del primero al último.
     */
    public void mostrarMovimientos() {
        // Si no hay ninguno, se avisa en vez de mostrar una lista vacía
        if (numMovimientos == 0) {
            System.out.println("No hay movimientos todavía");
        } else {
            // Se recorren los cajones usados, del 0 al último
            for (int i = 0; i < numMovimientos; i++) {
                // Cada movimiento se muestra con el método que ya escribiste en Movimiento
                movimientos[i].mostrarInfoMovimiento();
            }
        }
    }
}

