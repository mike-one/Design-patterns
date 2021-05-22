public class ConexionVacia implements Conexion {
    @Override
    public void conectar() {
        System.out.println("No se especificó proveedor");
    }

    @Override
    public void desconectar() {
        System.out.println("No se especificó proveedor");
    }
}
