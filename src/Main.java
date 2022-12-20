public class Main {
    public static void main(String[] args) {
        Author tolstoy = new Author("Лев", "Толстой");
        Author gogol = new Author("Николай", "Гоголь");
        Book warAndPeace = new Book("Война и мир", tolstoy, 1990);
        Book viy = new Book("Вий", gogol, 1992);
        viy.setPublicationYear(1995);
        System.out.println("Книга: " + warAndPeace.getNameOfTheBook() + "; \nавтор: " + tolstoy.getNameAuthor() + " " + tolstoy.getSurnameAuthor() + "; \nгод публикации: " + warAndPeace.getPublicationYear() + ".");
        System.out.println("Книга: " + viy.getNameOfTheBook() + "; \nавтор: " + gogol.getNameAuthor() + " " + gogol.getSurnameAuthor() + "; \nгод публикации: " + viy.getPublicationYear() + ".");
    }
}