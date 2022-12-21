import java.util.Objects;

public class Book {
    private final String nameOfTheBook;
    private final Author author;
    private int publicationYear;

    public Book(String nameOfTheBook, Author author, int publicationYear) {
        this.nameOfTheBook = nameOfTheBook;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Книга: " + nameOfTheBook+ "; \n" + author.toString() + "; \n" +
                "Год публикации: " + publicationYear + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return nameOfTheBook.equals(book.nameOfTheBook) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfTheBook, author);
    }

    public String getNameOfTheBook() {
        return nameOfTheBook;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public Author getAuthor() {
        return author;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
