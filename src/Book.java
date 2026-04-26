public class Book {
    private final Author authorName;
    private final String bookTitle;
    private String publisher;
    private int publishingYear;

    public Book(Author authorName, String publisher, int publishingYear, String bookTitle) {
        this.authorName = authorName;
        this.publisher = publisher;
        this.publishingYear = publishingYear;
        this.bookTitle = bookTitle;
    }
    public String getbookTitle() {
        return this.bookTitle;
    }
    public Author getAuthor() {
        return authorName;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        if (publishingYear < 1950 || publishingYear > 2050) {
            System.out.println("Invalid publishing year:" + publishingYear);
            return;
        }
        this.publishingYear = publishingYear;
    }
}
