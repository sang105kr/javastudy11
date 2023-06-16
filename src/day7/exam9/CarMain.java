package day7.exam9;

public class CarMain {
  public static void main(String[] args) {
    Car c1 = new Car(200);
    System.out.println("현재속도 : "+c1.getSpeed());

    for (int i = 0; i < 300; i++) {
      c1.upSpeed();
    }

    System.out.println("현재속도 : "+c1.getSpeed());

    Car c2 = new Car(300);
    System.out.println("현재속도 : "+c2.getSpeed());

    for (int i = 0; i < 300; i++) {
      c2.upSpeed();
    }

    System.out.println("현재속도 : "+c2.getSpeed());
  }
}
