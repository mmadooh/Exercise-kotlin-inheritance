import library.*

fun main() {

    val  myFictionBook = FictionBook()
    myFictionBook.title = "Space"
    myFictionBook.author = "NASA"
    myFictionBook.iSBN = 1234
    myFictionBook.genre = "Astronomy"

    val myNonFictionBook = NonFictionBook()
    myNonFictionBook.title = "War"
    myNonFictionBook.author = "UN"
    myNonFictionBook.iSBN = 5678
    myNonFictionBook.area = "History"

    myFictionBook.readFiction()
    println("---")
    myNonFictionBook.readNonFiction()


}