public class Book {
    private final String author;
    private String publisher;
    private int publishingYear;

    public Book(String author, String publisher, int publishingYear) {
        this.author = author;
        this.publisher = publisher;
        this.publishingYear = publishingYear;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
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
