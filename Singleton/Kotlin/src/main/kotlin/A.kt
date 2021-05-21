
class A{
    init {
        println("Metodo init de la clase A.\n" +
                "Variable nombre del objeto Singleton: ${Singleton.variableName}")
        println("\nLlamando el método imprimir de Singleton :")
        Singleton.printVarName()
    }

    fun cambiarNombre(){
        println("\nCambiando el nombre...")
        Singleton.variableName = "Miguel"
    }
}