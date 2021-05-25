public class CuentaCorriente implements ICuentaBancaria {
    @Override
    public void abrirCuenta(Cuenta cuenta) {
        System.out.println("Se abrió una cuenta corriente");
        System.out.println("Cliente :" + cuenta.getCliente());
    }
}
