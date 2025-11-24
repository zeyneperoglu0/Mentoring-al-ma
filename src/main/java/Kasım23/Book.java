package Kasım23;

public class Book {

  String title;
  String author;
  int price;

    public Book() {
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }


    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}
