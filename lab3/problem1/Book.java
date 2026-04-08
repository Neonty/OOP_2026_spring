package problem1;

abstract class Book {
    protected String title;
    protected String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public void printInfo(){
        System.out.println("Книга: " + title + ", автор: " + author);
    }

    abstract void read();
    abstract int getPageCount();
}