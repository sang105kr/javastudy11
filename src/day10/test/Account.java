package day10.test;

/*
  static :
 */
public class Account {
  //  속성 :  예금주이름, 잔고, 계좌번호 001,002,...
  private String accountOwnerName;      //예금주이름
  private int balance;                  //잔고
  private String accountNumber;            //계좌번호
  
  // 계좌번호 누적기 0->1->2
  private static int accountNumberAccumulator;

  Account(String accountOwnerName) {
    //1) super() : 부모생성자 호출
    //2) 필드 초기화
    //3) 필드 재할당
    this.accountOwnerName = accountOwnerName;
    accountNumber = changeAccountNumberToString(++accountNumberAccumulator);
  }

  /**
   * 정수 계좌번호를 입력받아 문자열 계좌번호로 반환한다
   * ex) 12->"012"
   * @param num  정수 계좌번호 ex)12
   * @return     문자열 계좌번호 ex)"012"
   */
  private String changeAccountNumberToString(int num){
    String zero = "";

    String numStr = String.valueOf(num); // 12->"12"
    int len = numStr.length(); // 2

    for (int i = 0; i < 3 - len; i++) {
       zero += "0";
    }

    return zero + num;  //"012"
  }

  //  기능 :  입금, 출금, 조회
  //입금
  void deposit(int money) {
    //1)1회 입금한도는 4만원을 초과할 수 없다.
    if(money > 40_000){
      System.out.println("1회 입금한도는 4만원을 초과할 수 없다.");
      return;
    }
    //2)예치금액은 10만원 이하로 제한 한다.
    if(this.balance + money > 100_000){
      System.out.println("예치금액은 10만원 이하로 제한 한다.");
      return;
    }
    this.balance += money;
  }

  //출금
  void withdraw(int money) {
    //1)1회 출금한도는 4만원을 초과할 수 없다.
    if(money > 40_000){
      System.out.println("1회 출금한도는 4만원을 초과할 수 없다.");
      return;
    }
    //2)마이너스 잔고는 허용하지 않는다.
    if (this.balance - money < 0) {
      System.out.println("잔액이 부족합니다.");
      return;
    }
    this.balance -= money;
  }

  //조회
  public String toString() {
    return "계좌번호 : " + getAccountNumber() + "\t" +
        "예금주 : " + getAccountOwnerName() + "\t" +
        "잔액 : " + getBalance();
  }

  public String getAccountOwnerName() {
    return accountOwnerName;
  }

  public int getBalance() {
    return balance;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

}
