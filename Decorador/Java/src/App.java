public class App {

    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(1, "Miguel");

        ICuentaBancaria cuentaBancaria = new CuentaAhorro();
        ICuentaBancaria cuentaBlindada = new BlindajeDecorador(cuentaBancaria);
        ICuentaBancaria cuentaMenorTI = new DisminuyeTI(cuentaBancaria);

       cuentaBlindada.abrirCuenta(cuenta);
       cuentaMenorTI.abrirCuenta(cuenta);
    }
}
