package problem1;

class Novel extends Book {
    private int pages;

    public Novel(String title, String author, int pages) {
        super(title, author);
        this.pages = pages;
    }

    void read() {
        System.out.println("Читаем роман \"" + title + "\"");
    }

    int getPageCount() {
        return pages;
    }
}