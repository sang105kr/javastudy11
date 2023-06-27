package day13.quiz9;

import java.util.Scanner;

public class CartDriver {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    ShoppingCart scart = null;        //ShoppingCart 객체
    String itemName = null;           // 구매하는 상품의 이름
    int itemPrice = 0;                // 구매하는 상품의 가격
    int itemQuantity = 0;             // 구매하는 상품의 수량
//    1.	flag = “예”
    String flag = "예";               // 상품 추가 여부 확인

//    2.	ShoppingCart 객체를 만든다.
    scart = new ShoppingCart();
    do {
//    3.	flag = “예”인 동안 다음을 반복한다:
//      ①	구매하는 상품의 이름 이름, 가격과 수량을 입력 받는다.
      System.out.print("상품이름 > ");
      itemName = scanner.nextLine();
      System.out.print("가격 > ");
      itemPrice= Integer.parseInt(scanner.nextLine());
      System.out.print("수량 > ");
      itemQuantity= Integer.parseInt(scanner.nextLine());
//      ②	장바구니에 입력 받은 상품을 추가한다.
      scart.addToCart(itemName,itemPrice,itemQuantity);
//      ③	추가할 상품이 있는지 요청하고 사용자 입력 값을  flag에 저장한다.
      System.out.print("상품을 추가하겠습니까?(예/아니오)");
      flag = scanner.nextLine();
    } while (flag.equals("예"));
//    4.	총 결제액을 출력한다.
    System.out.println("총 결재액 : " + scart.getTotalPrice());
  }
}
