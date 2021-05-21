public class Main {

    public static void main(String[] args) {
        CuentaBanco cuentaDeAhorro = new CuentaBanco();
        cuentaDeAhorro.setMonto(200);
        CuentaBanco cuentaClonada = (CuentaBanco) cuentaDeAhorro.clonar();

        if (cuentaClonada != null){
            System.out.println(cuentaClonada);
        }
        System.out.println(cuentaClonada == cuentaDeAhorro);

        CuentaBanco cuentaDeAhorro2 = new CuentaBanco();
        cuentaDeAhorro2.setMonto(300);
        CuentaBanco cuentaCloada2 = (CuentaBanco)cuentaDeAhorro2.clonar();

        if (cuentaCloada2 != null){
            System.out.println(cuentaCloada2);
        }

        System.out.println("La primera cuenta clonada fue :"+ cuentaClonada);
        System.out.println("La segunda cuenta clonada fue :"+ cuentaCloada2);

    }
}
