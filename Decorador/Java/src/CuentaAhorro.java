public class CuentaAhorro implements ICuentaBancaria{
    @Override
    public void abrirCuenta(Cuenta cuenta) {
        System.out.println("Se abrió una cuenta de Ahorros");
        System.out.println("Cliente :" + cuenta.getCliente());
    }
}
