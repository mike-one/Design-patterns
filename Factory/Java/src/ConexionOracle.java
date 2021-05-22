public class ConexionOracle implements Conexion{
    private String host;
    private String puerto;
    private String usuario;
    private String contrasena;

    public ConexionOracle(){
        this.host = "localHost";
        this.puerto = "1521";
        this.usuario = "admin";
        this.contrasena ="123";
    }


    @Override
    public void conectar() {
        System.out.println("Se conectó a Oracle");
        toString();
    }

    @Override
    public void desconectar() {
        System.out.println("Se desconectó de Oracle");
    }

    @Override
    public String toString() {
        return "ConexionOracle{" +
                "host='" + host + '\'' +
                ", puerto='" + puerto + '\'' +
                ", usuario='" + usuario + '\'' +
                ", contrasena='" + contrasena + '\'' +
                '}';
    }
}
