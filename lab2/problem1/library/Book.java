package library;

public class Book extends LibraryItem{
    private int numberOfPages;

    public Book(String title, String author, int year, int numberOfPages){
        super(title, author, year);

        if (numberOfPages <= 0){
            throw new IllegalArgumentException("Pages must be positive");
        }

        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages(){
        return numberOfPages;
    }

    @Override
    public String toString(){
        return super.toString() + ", Pages: " + numberOfPages;
    }
}