//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//В методе main создайте несколько объектов «Книга» (достаточно двух) и несколько объектов «Автор» (достаточно тоже двух)
// и инициализируйте их. Учтите, что авторы являются обязательными и книги не могут создаваться без авторов.
//Метод main не должен находиться в классах Book и Author.

        System.out.println("============= СОЗДАЮ ОБЪЕКТЫ =================");
    Author ivanov = new Author("Ivanov","Ivan");
    Author pitrov = new Author("Petrov","Petr");

        Book bookIvana = new Book("Book Ivana","Ivanov Compani ltd", 2025);
        Book bookIvana2 = new Book("Book2 Ivana","Ivanov Compani ltd", 2025);

        System.out.println("bookIvana = " + bookIvana.getAuthor() + " " + bookIvana.getPublisher()
                + " " + bookIvana.getPublishingYear());
        System.out.println("bookIvana2 = " + bookIvana2.getAuthor() + " " + bookIvana2.getPublisher()
                + " " + bookIvana2.getPublishingYear());

        Book bookPetra = new Book("Book Petra","Ivanov Compani ltd", 2025);
        Book bookPetra2 = new Book("Book2 Petra","Ivanov Compani ltd", 2025);

        System.out.println("bookPetra = " + bookPetra.getAuthor()  + " " + bookPetra.getPublisher()
                + " " + bookPetra.getPublishingYear());
        System.out.println("bookPetra2 = " + bookPetra2.getAuthor()  + " " + bookPetra2.getPublisher()
                + " " + bookPetra2.getPublishingYear());

        System.out.println("============= МЕНЯЮ ЗНАЧАНЕНИЯ В ОБЪЕКТАХ =================");
        bookIvana.setPublishingYear(1999);
        bookPetra.setPublishingYear(1995);

        System.out.println("bookIvana = " + bookIvana.getAuthor() + " " + bookIvana.getPublisher()
                + " " + bookIvana.getPublishingYear());
        System.out.println("bookPetra = " + bookPetra.getAuthor()  + " " + bookPetra.getPublisher()
                + " " + bookPetra.getPublishingYear());

        System.out.println("============= ДОПОЛНИТЕЛЬНЫЕ ИЗМЕНЕНИЯ ЗНАЧАНЕНИЙ В ОБЪЕКТАХ =================");
        bookIvana.setPublisher("- Old Compani Ivanov ltd -");
        bookPetra.setPublisher("- Old Compani Petrov ltd -");

        System.out.println("bookIvana = " + bookIvana.getAuthor() + " " + bookIvana.getPublisher()
                + " " + bookIvana.getPublishingYear());
        System.out.println("bookPetra = " + bookPetra.getAuthor()  + " " + bookPetra.getPublisher()
                + " " + bookPetra.getPublishingYear());
    }
}