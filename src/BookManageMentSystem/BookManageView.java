package BookManageMentSystem;

import java.util.Scanner;

public class BookManageView {
    private BookManageController controller;

    public BookManageView(BookManageController controller) {
        this.controller = controller;
    }

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("메뉴를 입력하세요. (1~5번)");
            System.out.println("1. 도서정보 추가");
            System.out.println("2. 조회");
            System.out.println("3. 수정");
            System.out.println("4. 삭제");
            System.out.println("5. 종료");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    controller.addBook();
                    break;
                case 2:
                    controller.showBooks();
                    break;
                case 3:
                    // 수정 로직 추가
                    break;
                case 4:
                    // 삭제 로직 추가
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }
}

