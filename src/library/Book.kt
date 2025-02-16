package library

open class Book () {
    var title: String = ""
    var author: String = ""
    var iSBN: Int = 0
    fun displayInfo(){
        println("$title by $author ($iSBN)")
    }
}