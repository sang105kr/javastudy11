package day10.test;

import java.util.Scanner;

public class AccountMain {
  public static void main(String[] args) {

    Account[] accounts = new Account[5];
    Scanner scanner = new Scanner(System.in);
    boolean stop = false;

    do {
      System.out.println("1.신규 2.폐지 3.입금 4.출금 5.계좌조회(개별) 6.계좌조회(전체) 7.종료(x)");
      System.out.print("선택 >> ");
      String menu = scanner.nextLine();
      switch (menu) {
        case "1": //신규
          System.out.print("예금주 >> ");
          String accountOwnerName = scanner.nextLine();
          for (int i = 0; i < accounts.length; i++) {
            if(accounts[i] == null){
              accounts[i] = new Account(accountOwnerName);
              break;
            }
          }
          break;
        case "2":
          break;
        case "3":
          break;
        case "4":
          break;
        case "5":
          break;
        case "6": // 전체조회
          int usingCount = 0;
          for (int i = 0; i < accounts.length; i++) {
            if(accounts[i] != null) {
              System.out.println(accounts[i]);
              usingCount++;
            }
          }
          System.out.println("사용중인 계좌수 : " + usingCount);
          System.out.println("잔여계좌수 : " + (accounts.length - usingCount));
          break;
        case "7":
          stop = true;
          break;
        default:
          System.out.println("메뉴를 다시 선택바랍니다(1~7)");
      }
    } while (!stop);
    System.out.println("프로그램 종료!");
  }
}
