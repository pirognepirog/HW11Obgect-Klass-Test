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

        Book bookIvana = new Book(ivanov,"Ivanov Compani ltd", 2026, "War and Peace");
        Book bookIvana2 = new Book(ivanov,"Ivanov Compani ltd", 2025,"War and Peace2");

        System.out.println(ivanov.getSurname() + " " + bookIvana.getPublisher()
                + " " + bookIvana.getPublishingYear() + " " + bookIvana.getbookTitle());
        System.out.println(ivanov.getSurname() + bookIvana2.getAuthor() + " " + bookIvana2.getPublisher()
                + " " + bookIvana2.getPublishingYear() + " " + bookIvana2.getbookTitle());

        Book bookPetra = new Book(pitrov,"Ivanov Compani ltd", 2025,"House of the Dragon");
        Book bookPetra2 = new Book(pitrov,"Ivanov Compani ltd", 2025,"House of the Dragon2");

        System.out.println(pitrov.getSurname() + bookPetra.getAuthor()  + " " + bookPetra.getPublisher()
                + " " + bookPetra.getPublishingYear() + " " + bookPetra.getbookTitle());
        System.out.println(pitrov.getSurname() + bookPetra2.getAuthor()  + " " + bookPetra2.getPublisher()
                + " " + bookPetra2.getPublishingYear() + " " + bookPetra2.getbookTitle());

        System.out.println("============= МЕНЯЮ ЗНАЧАНЕНИЯ В ОБЪЕКТАХ =================");
        bookIvana.setPublishingYear(1999);
        bookPetra.setPublishingYear(1995);

        System.out.println(ivanov.getSurname() + " " + bookIvana.getPublisher()
                + " " + bookIvana.getPublishingYear() + " " + bookIvana.getbookTitle());
        System.out.println(pitrov.getSurname() + " " + bookPetra.getPublisher()
                + " " + bookPetra.getPublishingYear()+ " " + bookPetra.getbookTitle());

        System.out.println("============= ДОПОЛНИТЕЛЬНЫЕ ИЗМЕНЕНИЯ ЗНАЧАНЕНИЙ В ОБЪЕКТАХ =================");
        bookIvana.setPublisher("- Old Compani Ivanov ltd -");
        bookPetra.setPublisher("- Old Compani Petrov ltd -");

        System.out.println(ivanov.getSurname() + " " + bookIvana.getPublisher()
                + " " + bookIvana.getPublishingYear() + " " + bookIvana.getbookTitle());
        System.out.println(pitrov.getSurname() + " " + bookPetra.getPublisher()
                + " " + bookPetra.getPublishingYear() + " " + bookPetra.getbookTitle());
    }
}