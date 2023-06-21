package day10.test;

import java.util.Scanner;

public class AccountMain {
  /**
   * 계좌번호와 일치하는 계좌를 참조하는 배열의 인덱스를 반환
   * @param accountNumber 계좌번호
   * @param accounts 계좌를 참조하는 배열
   * @return 찾은 인덱스
   */
  private static int findIndexOfAccounts(String accountNumber, Account[] accounts){
    int findedAccountIndex = -1;
    for (int i = 0; i < accounts.length; i++) {
      if (accounts[i] != null && accounts[i].getAccountNumber().equals(accountNumber)) {
//              existAccount = true;
        findedAccountIndex = i;
        break;
      }
    }
    return findedAccountIndex;
  }

  /**
   * 사용중인 계좌수 반환
   * @param accounts 계좌정보
   * @return  사용중인 계좌수
   */
  private static int countOFUsing(Account[] accounts) {
    int cnt = 0;
    for (int i = 0; i < accounts.length; i++) {
      if (accounts[i] != null) {
        cnt++;
      }
    }
    return cnt;
  }


  public static void main(String[] args) {
    final int SIZE_OF_ACCOUNT = 5;
    Account[] accounts = new Account[SIZE_OF_ACCOUNT];
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

          //1) 계좌생성 한도 체크
          if(SIZE_OF_ACCOUNT == countOFUsing(accounts)){
            System.out.println("계좌생성 한도 초과로 인해 더이상 계좌생성할수 없습니다.");
            break;
          }

          //2)계좌생성
          for (int i = 0; i < accounts.length; i++) {
            if(accounts[i] == null){
              accounts[i] = new Account(accountOwnerName);
              break;
            }
          }

          break;
        case "2":  //폐지
          System.out.print("계좌번호 >> ");
          String accountNumber = scanner.nextLine();

          // input : accounts, "찾고자하는 계좌번호"

          //1) 찾고자하는 계좌가 있는지 체크
          //boolean existAccount = false;
          int findedAccountIndex = -1;
          for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null && accounts[i].getAccountNumber().equals(accountNumber)) {
//              existAccount = true;
              findedAccountIndex = i;
              break;
            }
          }

          //2) 존재하면 null, 없으면 "계좌없음" 메세지
          if(findedAccountIndex == -1){
            System.out.println("계좌번호가 없습니다.");
          }else{
            System.out.printf("%s 계좌가 폐지 되었습니다.\n", accounts[findedAccountIndex].getAccountNumber());
            accounts[findedAccountIndex] = null;
          }
          break;

        case "3": // 입금
          System.out.print("계좌번호 >> ");
          accountNumber = scanner.nextLine();
          findedAccountIndex = findIndexOfAccounts(accountNumber, accounts);
          if (findedAccountIndex == -1) {
            System.out.println("계좌번호가 없습니다.");
            break;
          }
          System.out.print("입금액 >> ");
//          String money = scanner.nextLine();
          int money = Integer.parseInt(scanner.nextLine());
          accounts[findedAccountIndex].deposit(money);
          System.out.println(accounts[findedAccountIndex]);
          break;
        case "4": // 출금
          System.out.print("계좌번호 >> ");
          accountNumber = scanner.nextLine();
          findedAccountIndex = findIndexOfAccounts(accountNumber, accounts);
          if (findedAccountIndex == -1) {
            System.out.println("계좌번호가 없습니다.");
            break;
          }
          System.out.print("출금액 >> ");
//          String money = scanner.nextLine();
          money = Integer.parseInt(scanner.nextLine());
          accounts[findedAccountIndex].withdraw(money);
          System.out.println(accounts[findedAccountIndex]);
          break;
        case "5": //계좌조회(개별)
          System.out.print("계좌번호 >> ");
          accountNumber = scanner.nextLine();

          //1) 찾고자하는 계좌가 있는지 체크
          //boolean existAccount = false;
          findedAccountIndex = -1;
          for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null && accounts[i].getAccountNumber().equals(accountNumber)) {
//              existAccount = true;
              findedAccountIndex = i;
              break;
            }
          }
          //case1)
          //System.out.println(accounts[findedAccountIndex]);

          //case2)
          System.out.printf("예금주명 : %s \t 잔액 : %d \t 계좌번호 : %s \n",
              accounts[findedAccountIndex].getAccountOwnerName(),
              accounts[findedAccountIndex].getBalance(),
              accounts[findedAccountIndex].getAccountNumber());

          break;
        case "6": // 전체조회
//          int usingCount = 0;
          for (int i = 0; i < accounts.length; i++) {
            if(accounts[i] != null) {
              System.out.println(accounts[i]);
//              usingCount++;
            }
          }
          int usingCount = countOFUsing(accounts);
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
