package day11.exec2.quiz7;

public class CarDriver {
  public static void main(String[] args) {
    System.out.println(Car.getUniqueNumber());

    Car c1 = new Car();
    System.out.println(Car.getUniqueNumber());

    Car c2 = new Car();
    System.out.println(Car.getUniqueNumber());
  }
}
