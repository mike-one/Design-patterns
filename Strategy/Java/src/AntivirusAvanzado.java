public class AntivirusAvanzado extends AnalisisAvanzado {
    @Override
    void iniciar() {
        System.out.println("Antivirus Avanzado - Análisis Avanzado iniciado");
    }

    @Override
    void analizarMemoria() {
    try {
        System.out.println("Analizando Memoria RAM...");
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    }

    @Override
    void analizarKeyloggers() {

        try {
            System.out.println("Analizando KeyLoggers...");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    void analizarRootkits() {
        try {
            System.out.println("Analizando RootKits...");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    void descomprimirZip() {
        try {
            System.out.println("Descomprimiendo archivos .Zip");
            Thread.sleep(1000);
            System.out.println("Analizando archivos .Zip");
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    void detener() {
        System.out.println("Finalizando el análisis...");
    }
}
