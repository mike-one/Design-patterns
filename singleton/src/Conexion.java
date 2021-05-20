
public class Conexion {

    //Declaración
    private static Conexion instancia;
    private String nombre;

    //Para evitar instancia mediante el operador new
    private Conexion(){

    }

    //Podremos obtener la instancia únicamente por este método
    public static Conexion getInstance(){
        if (instancia == null)
            instancia = new Conexion();
        return instancia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
