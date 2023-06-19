package day8.exam6;

public class CarMain {
  public static void main(String[] args) {
    Car c1 = new Car(1111, "검정");
    System.out.println(c1);
    System.out.println(c1.getCarNumber());
    System.out.println(c1.getSpeed());
    System.out.println(c1.getColor());
    System.out.println(Car.getUniqueNumber());
    
    Car c2 = new Car(2222, "흰색");
    System.out.println(c2);
    System.out.println(c2.getCarNumber());
    System.out.println(c2.getSpeed());
    System.out.println(c2.getColor());
    System.out.println(Car.getUniqueNumber());
    
    Car c3 = new Car(3333, "빨강");
    System.out.println(c3);
    System.out.println(c3.getCarNumber());
    System.out.println(c3.getSpeed());
    System.out.println(c3.getColor());
    System.out.println(Car.getUniqueNumber());

    // 250까지 speedUp()
    for (int i=0; i<25; i++) {
      c1.speedUp();
      System.out.println(c1);
    }

    // -10까지 speedDown()
    for (int i=0; i<25; i++) {
      c1.speedDown();
      System.out.println(c1);
    }
  }
}
