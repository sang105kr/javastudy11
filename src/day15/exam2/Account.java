package day15.exam2;

public class Account {
  private int balance;      //잔액

  //입금
  public void deposit(int money) throws NoMinusException{
    if( money <= 0) {
      //System.out.println("마이너스 입금 불가");
      throw new NoMinusException("마이너스 입금 불가");
//      return;
    }
    balance += money;
  }

  //출금
  public void withdraw(int money) throws NoMinusException{
    if( money <= 0) {
      //System.out.println("마이너스 입금 불가");
      throw new NoMinusException("마이너스 입금 불가");  // checked Exception
//      return;
    }
    if(balance-money < 0){
      throw new ShortOfBalanceException("잔액이 모지랍니다"); //unchecked Exception
    }
    balance -= money;
  }

  //잔액
  public int getBalance() {
    return balance;
  }
}
