package BookManageMentSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManageController {
    private ArrayList<BookDTO> bookList;

    public BookManageController() {
        this.bookList = new ArrayList<>();
    }

    public void addBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("새 도서 정보 입력:");
        System.out.print("- ISBN: ");
        String isbn = scanner.nextLine();
        System.out.print("- 도서명: ");
        String title = scanner.nextLine();
        System.out.print("- 저자명: ");
        String author = scanner.nextLine();
        System.out.print("- 출판사: ");
        String publisher = scanner.nextLine();
        System.out.print("- 가격: ");
        double price = scanner.nextDouble();

        BookDTO newBook = new BookDTO(isbn, title, author, publisher, price);
        bookList.add(newBook);

        System.out.println("도서가 추가되었습니다.");
    }

    public void showBooks() {
        if (bookList.isEmpty()) {
            System.out.println("등록된 도서가 없습니다.");
        } else {
            for (BookDTO book : bookList) {
                System.out.println(book);
            }
        }
    }

    // 수정 및 삭제 메서드 추가 가능
}

