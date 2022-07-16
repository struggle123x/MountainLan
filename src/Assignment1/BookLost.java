package Assignment1;

public class BookLost extends Lost{

    private String bookName;
    private String author;
    private String ownerName;

    public BookLost(){}

    public BookLost(String bookName,String author,String ownerName,String date,String retrievalPlace,String lostPlace){
        super(date,retrievalPlace,lostPlace);
        this.author = author;
        this.bookName = bookName;
        this.ownerName = ownerName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    @Override
    public String toString() {
        return "BookLost{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
