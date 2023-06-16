package day7.exam11;

public class Main {
  public static void main(String[] args) {
    Person p1 = new Person();

    Car c1 = new Car();

    Person.car = c1;
    Person.car.drive();
  }
}
