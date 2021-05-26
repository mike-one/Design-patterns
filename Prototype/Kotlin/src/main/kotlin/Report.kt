class Report {

    constructor() {
    }

    fun printReport(reportItems: MutableMap<String, ReportItemPrototype>) {
        reportItems.forEach {
            if (it.value is TextItem) {
                println("${it.key} TextItem")
            } else if (it.value is ImageItem) {
                println("${it.key} ImageItem")
            }
        }
    }
}