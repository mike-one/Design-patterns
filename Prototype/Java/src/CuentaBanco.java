public class CuentaBanco implements ICuenta {

    private String tipo;
    private double monto;

    public CuentaBanco(){
        tipo="Ahorro";
    }

    @Override
    public ICuenta clonar() {
     CuentaBanco cuentaBanco = null;

     try {
         cuentaBanco = (CuentaBanco)clone();
     } catch (CloneNotSupportedException e) {
         e.printStackTrace();
     }
        return cuentaBanco;
    }

    @Override
    public String toString() {
        return "CuentaBanco {" +
                "tipo='" + tipo + '\'' +
                ", monto=" + monto +
                '}';
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }
}
