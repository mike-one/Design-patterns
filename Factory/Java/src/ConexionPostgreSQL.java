public class ConexionPostgreSQL implements Conexion{

    private String host;
    private String puerto;
    private String usuario;
    private String contrasena;

    public ConexionPostgreSQL(){
        this.host = "localHost";
        this.puerto = "5433";
        this.usuario = "postgres";
        this.contrasena ="123";
    }

    @Override
    public void conectar() {
        System.out.println("Se conectó a PostgreSQL");
        toString();
    }

    @Override
    public void desconectar() {

    }

    @Override
    public String toString() {
        return "ConexionPostgreSQL{" +
                "host='" + host + '\'' +
                ", puerto='" + puerto + '\'' +
                ", usuario='" + usuario + '\'' +
                ", contrasena='" + contrasena + '\'' +
                '}';
    }
}
