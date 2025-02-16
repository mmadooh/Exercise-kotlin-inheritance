package library

class NonFictionBook : Book()  {
    var area: String = ""
    fun readNonFiction(){
        println("Reading $title by $author ISBN: ($iSBN) from $area genre")
    }

}
