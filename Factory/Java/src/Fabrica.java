public class Fabrica {

    //Devuelve una instancia de alguna implementación que dependa de la interfaz Conexion
    public Conexion getConexion(String motor){

        if (motor == null)
            return new ConexionVacia();
        else if (motor.equals("MYSQL"))
            return new ConexionMySQL();
        else if (motor.equals("ORACLE"))
            return new ConexionOracle();
        else if (motor.equals("POSTGRE"))
            return new ConexionPostgreSQL();

        return new ConexionVacia();
    }
}
