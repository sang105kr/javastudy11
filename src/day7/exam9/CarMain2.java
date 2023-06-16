package day7.exam9;

public class CarMain2 {
  public static void main(String[] args) {
    System.out.println(Car.uniqueNumber);
    Car.test();

    Car c1 = new Car(200);
    System.out.println(c1.getUniqueNumber());

    Car c2 = new Car(300);
    System.out.println(c2.getUniqueNumber());

    Car c3 = new Car(400);
    System.out.println(c2.getUniqueNumber());
  }
}
