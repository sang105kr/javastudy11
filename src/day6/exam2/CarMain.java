package day6.exam2;

public class CarMain {
  public static void main(String[] args) {
    Car c1 = new Car();
    Car c2 = new Car();

    c1.run();
    c1.upSpeed();
    System.out.println(c1.speed);
    c1.upSpeed();
    System.out.println(c1.speed);

    c2.run();
    System.out.println(c2.speed);
  }
}
