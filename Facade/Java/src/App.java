public class App {
    public static void main(String[] args) {
        CheckFacade cliente1 = new CheckFacade();
        cliente1.buscar("02/07/2021","08/07/2021","CDMX", "Las Vegas");

        CheckFacade cliente2 = new CheckFacade();
        cliente2.buscar("10/10/2021", "20/10/2001", "GDL", "Cosumel" );
    }
}
