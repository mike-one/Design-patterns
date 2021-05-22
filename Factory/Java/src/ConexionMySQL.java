public class ConexionMySQL implements Conexion{
    private String host;
    private String puerto;
    private String usuario;
    private String contrasena;

public ConexionMySQL(){
    this.host = "localHost";
    this.puerto = "3306";
    this.usuario = "root";
    this.contrasena ="123";
}
    @Override
    public void conectar() {
        System.out.println("Se conectó a MySQL");
        toString();
    }

    @Override
    public void desconectar() {
        System.out.println("Se desconectó de MySQL");
    }

    @Override
    public String toString() {
        return "ConexionMySQL{" +
                "host='" + host + '\'' +
                ", puerto='" + puerto + '\'' +
                ", usuario='" + usuario + '\'' +
                ", contrasena='" + contrasena + '\'' +
                '}';
    }
}
