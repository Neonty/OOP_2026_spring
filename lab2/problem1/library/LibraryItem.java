package library;

public abstract class LibraryItem{
    private final String title;
    private final String author;
    private final int publicationYear;

    public LibraryItem(String title, String author, int publicationYear){
        if (title == null || title.isBlank()){
            throw new IllegalArgumentException("Title cannot be empty");
        }

        if (author == null || author.isBlank()){
            throw new IllegalArgumentException("Author cannot be empty");
        }

        if (publicationYear <= 0){
            throw new IllegalArgumentException("Invalid year");
        }

        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getPublicationYear(){
        return publicationYear;
    }

    @Override
    public String toString(){
        return "Title: " + title +", Author: " + author +", Year: " + publicationYear;
    }
}