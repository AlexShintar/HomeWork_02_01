public class Main {
    public static void main(String[] args) {

        Author ivanov = new Author("Иван", "Иванов");
        Author petrov = new Author("Петр", "Петров");

        Book shekspir = new Book("Шекспир", ivanov, 1896);
        Book borel = new Book("Борель", petrov, 1931);

        System.out.println(ivanov.getAuthorName() + " " + ivanov.getAuthorSurname());
        System.out.println(petrov);
        System.out.println(borel.getBookTitle() + " " + borel.getPublishingYear() + " " + borel.getBookAuthor().getAuthorSurname());
        System.out.println(shekspir);
        borel.setPublishingYear(1960);
        System.out.println(borel);
    }
}
