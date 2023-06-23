package day11.exec2.quiz7;

public class CoinDriver {
  public static void main(String[] args) {
    Coin coin = new Coin();
    System.out.println(coin);

    coin.flip();
    System.out.println(coin);

    coin.flip();
    System.out.println(coin);

    int face = coin.getFace();
    System.out.println("face="+face);
  }
}
