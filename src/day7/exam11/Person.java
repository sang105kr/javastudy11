package day7.exam11;

public class Person {
  private String name;
  private int age;
  static Car car;

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public Car getCar() {
    return car;
  }

  public void setCar(Car car) {
    this.car = car;
  }
}
