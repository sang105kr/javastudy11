package day7.exam10;

public class CarMain {
  public static void main(String[] args) {
    //정적 멤버는 인스턴스 생성없이 접근 가능
    Car.method2();
    System.out.println(Car.field2);

    //인스턴스 멤버는 인스턴스 생성하고나서 접근가능
    Car c1 = new Car();
    c1.method1();
    System.out.println(c1.field1);

  }
}
