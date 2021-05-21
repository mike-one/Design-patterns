public abstract class AnalisisAvanzado implements IEstrategia {
    @Override
    public void analizar() {
        iniciar();
        analizarMemoria();
        analizarKeyloggers();
        analizarRootkits();
        descomprimirZip();
        detener();

    }

    abstract void iniciar();
    abstract void analizarMemoria();
    abstract void analizarKeyloggers();
    abstract void analizarRootkits();
    abstract void descomprimirZip();
    abstract void detener();
}
