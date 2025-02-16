package library

class FictionBook(): Book()  {
    var genre: String = ""
    fun readFiction(){
        println("Reading $title by $author ISBN: ($iSBN) from $genre genre")
    }


    }
