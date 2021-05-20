public class Main {

    public static void main(String[] args) {
        System.out.println("Patron de diseño Singleton");

        //Se instancia por primera vez
        Conexion conexion = Conexion.getInstance();

        //Se declara un nombre y se prueba la instancia
        conexion.setNombre("Miguel");
        System.out.println(conexion.getNombre());

        //Se intenta hacer una segunda instancia
        Conexion conexion1 = Conexion.getInstance();

        //Se verifica que no se puede crear otra instancia y por lo tanto nos regresa el nombre declarado anteriormente
        System.out.println(conexion1.getNombre());

        System.out.println("Fin...");


    }
}

