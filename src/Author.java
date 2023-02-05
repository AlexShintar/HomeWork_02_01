import java.util.Objects;

public class Author {
    private final String authorName;
    private final String authorSurname;

    public Author(String name, String surname) {
        this.authorName = name;
        this.authorSurname = surname;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public String getAuthorSurname() {
        return this.authorSurname;
    }

    @Override
    public String toString() {
        return authorName + " " + authorSurname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(authorName, author.authorName) && Objects.equals(authorSurname, author.authorSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, authorSurname);
    }
}
