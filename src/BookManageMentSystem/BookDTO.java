package BookManageMentSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class BookDTO {
    private String isbn;
    private String title;
    private String author;
    private String publisher;
    private double price;

    public BookDTO(String isbn, String title, String author, String publisher, double price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    // Getters and toString()
    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "ISBN: " + isbn + ", 도서명: " + title + ", 저자명: " + author + ", 출판사: " + publisher + ", 가격: " + price;
    }

    public static void main(String[] args) {
        BookManageController controller = new BookManageController();
        BookManageView view = new BookManageView(controller);
        view.showMenu();
    }
}
