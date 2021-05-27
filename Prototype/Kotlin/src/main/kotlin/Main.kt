fun main(){
    val report : Report = Report()
    val reportItems : MutableMap<String, ReportItemPrototype> = mutableMapOf()

    val text = TextItem()
    text.texto = "Texto normal"
    text.color = "Verde"
    reportItems["Texto normal"] = text

    val image = ImageItem()
    image.url = "/imagen/url.jpg"
    image.width = 100
    reportItems["Normal imagen"] = image

    report.printReport(reportItems)

    val redText = text.clone()
    redText.inicializarTexto("Texto Rojo", "Rojo")
    reportItems["Leer linea"] = redText

    val secondImage = image.clone()
    reportItems["Second image"] = secondImage

    println("\n \nUpdate report\n")
    report.printReport(reportItems)

}