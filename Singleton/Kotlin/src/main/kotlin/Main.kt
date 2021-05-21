fun main() {

    Singleton.printVarName()

    Singleton.variableName = "Raul"

    var a = A()

    a.cambiarNombre()

    Singleton.printVarName()
}