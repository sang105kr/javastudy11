package day10.test;

/*
  static :
 */
public class Account {
  //  속성 :  예금주이름, 잔고, 계좌번호 001,002,...
  private String accountOwnerName;      //예금주이름
  private int balance;                  //잔고
  //String accountNumber;
  private static int accountNumber;

  Account(String accountOwnerName) {
    //1) super() : 부모생성자 호출
    //2) 필드 초기화
    //3) 필드 재할당
    this.accountOwnerName = accountOwnerName;
    this.accountNumber++; // this.accountNumber = this.accountNumber + 1;
  }

  //  기능 :  입금, 출금, 조회
  //입금
  void deposit() {

  }

  //출금
  void withdraw() {

  }

  //조회
  public String toString() {
    return "예금주 : " + getAccountOwnerName() + "\t" +
        "잔액 : " + getBalance() + "\t" +
        "계좌번호 : " + getAccountNumber();
  }

  public String getAccountOwnerName() {
    return accountOwnerName;
  }

  public int getBalance() {
    return balance;
  }

  public static int getAccountNumber() {
    return accountNumber;
  }
}
