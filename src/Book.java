import java.util.Objects;

public class Book {
    private final String bookTitle;
    private final Author bookAuthor;
    private int publishingYear;

    public Book(String title, Author author, int year) {
        this.bookTitle = title;
        this.bookAuthor = author;
        this.publishingYear = year;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public Author getBookAuthor() {
        return bookAuthor;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int year) {
        this.publishingYear = year;
    }

    @Override
    public String toString() {
        return bookAuthor + " \"" + bookTitle + "\", " + publishingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(bookTitle, book.bookTitle) && Objects.equals(bookAuthor, book.bookAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, bookAuthor, publishingYear);
    }
}