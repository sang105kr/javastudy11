package day13.quiz8;

import java.util.Scanner;

public class CatalogueDriver {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    BookCatalogue bcat = null;      // BookCatalogue 객체
    String bookName = null;         // 추가하는 도서의 도서명
    String bookAuthor = null;       // 추가하는 도서의 저자
    int bookPrice = 0;              // 추가하는 도서의 가격

//    1.	flag = “예”
    String flag = "예";           // 도서 추가 여부 확인

//    2.	BookCatalogue 객체를 만든다.
    bcat = new BookCatalogue();

    do {
//    3.	flag = “예”인 동안 다음을 반복한다:
//      ①추가하는 도서의 도서명, 저자와 가격을 입력 받는다.
      System.out.print("도서명 > ");
      bookName = scanner.nextLine();
      System.out.print("저자 > ");
      bookAuthor = scanner.nextLine();
      System.out.print("도서가격 > ");
      bookPrice = Integer.parseInt(scanner.nextLine());
//      ②도서목록에 입력 받은 도서를 추가한다.
      //case1)
//      bcat.addToCatalogue(bookName,bookAuthor,bookPrice);
      Book book = new Book(bookName,bookAuthor,bookPrice);
      bcat.addToCatalogue(book);
//      ③추가할 도서가 있는지 요청하고 사용자 입력 값을 flag에 저장한다.
      System.out.print("도서를 추가하시겠습니까?(예/아니오)");
      flag = scanner.nextLine();
    }while(flag.equals("예"));
//    4.	BookCatalogue 객체의 내용을 출력한다.
    System.out.println(bcat);
  }
}
