class TextItem : ReportItemPrototype{

    var texto : String ?= null
    var color : String ?= null

    constructor(){
    }

    constructor(fuente: TextItem){
        this.texto = fuente.texto
        this.color = fuente.color
    }

    fun inicializarTexto(newText: String, newColor : String){
        this.texto = newText
        this.color = newColor
    }

    override fun clone(): TextItem {
        return TextItem(this)
    }



}