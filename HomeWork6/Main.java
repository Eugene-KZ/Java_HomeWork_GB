package HomeWork6;
public class Main {
    public static void main(String[] args) {

        Reader reader1 = new Reader("Иванов", "Иван", "Иванович", 2344223,
                "Биотехнологии", "01.11.1968", "2334422123");
        Reader reader2 = new Reader("Петров", "Петр", "Петрович", 34533,
                "Философия", "23.04.1995", "34351211");
        Reader reader3 = new Reader("Сидоров", "Дмитрий", "Иванович", 455322,
                "Журналистика", "13.06.1989", "378989456");
        Book book1 = new Book("Преступление и наказание", "Ф.М. Достоевский");
        Book book2 = new Book("Кому на руси жить хорошо", "Н.А. Некрасов");
        Book book3 = new Book("Война и мир. том 1", "Л.Н. Толстой");
        Book book4 = new Book("Война и мир. том 2", "Л.Н. Толстой");
        Book book5 = new Book("Война и мир. том 3", "Л.Н. Толстой");

        reader1.takeBook(3);
        reader2.takeBook("Сказки, Стихи, Рассказы");
        reader3.takeBook("Сказки Пушкина", "Утиные истории в картинках");
        reader1.takeBook(book3.title, book4.title, book5.title);
        reader1.returnBook(4);
        reader3.returnBook("Журнал, Роман");
        reader2.returnBook(book1.title, book2.title);

    }
}
