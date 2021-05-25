public class DisminuyeTI extends CuentaDecorador{

    public DisminuyeTI(ICuentaBancaria cuentaDecorada) {
        super(cuentaDecorada);
    }

    @Override
    public void abrirCuenta(Cuenta cuenta) {
        cambiaTI(cuenta);
    }

    public void cambiaTI(Cuenta cuenta){
        System.out.println("Disminuyendo la Tasa de Interes del cliente :"+cuenta.getCliente());
    }
}
