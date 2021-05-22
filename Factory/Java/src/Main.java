public class Main {
    public static void main(String[] args) {

        Fabrica fabrica = new Fabrica();

        Conexion cx1 = fabrica.getConexion("MYSQL");
        cx1.conectar();
        cx1.desconectar();

        Conexion cx2 = fabrica.getConexion("ORACLE");
        cx2.conectar();
        cx2.desconectar();

        Conexion cx3 = fabrica.getConexion("POSTGRE");
        cx3.conectar();
        cx3.desconectar();

        Conexion cxn = fabrica.getConexion("");
        cxn.conectar();
        cxn.desconectar();

    }
}
