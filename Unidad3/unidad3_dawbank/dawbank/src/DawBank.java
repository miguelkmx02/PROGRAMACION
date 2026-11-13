public class DawBank {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("ES6621000418401234567891", "Ana Pérez");
        cuenta.ingresar(100);
        cuenta.retirar(30);
        System.out.println("Saldo: " + cuenta.getSaldo());
        cuenta.retirar(100);
        System.out.println("Saldo: " + cuenta.getSaldo());
        cuenta.retirar(100);
        System.out.println("Saldo: " + cuenta.getSaldo());
    }
}