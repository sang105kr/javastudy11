package day15.exam2;


public class Main {
  public static void main(String[] args) {
    Account account = new Account();

    try {
      account.deposit(100);
      account.withdraw(200);
    } catch (NoMinusException e) {
      System.out.println(e.getMessage());
    } catch (ShortOfBalanceException e) {
      System.out.println(e.getMessage());
    }

    System.out.println("잔액:" + account.getBalance());
  }
}
