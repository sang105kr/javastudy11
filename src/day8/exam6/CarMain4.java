package day8.exam6;

public class CarMain4 {
  public static void main(String[] args) {
    Car[] garage = new Car[3];

    garage[0] = new Car(1111, "검정");
    System.out.println(garage[0].getSpeed());
    garage[0].speedUp();
    garage[0].speedUp();
    garage[0].speedDown();
    System.out.println(garage[0].getSpeed());

    garage[1] = new Car(2222, "흰색");
    System.out.println(garage[1].toString());
    garage[2] = new Car(3333, "빨강");
    System.out.println(garage[2].toString());

    Car[] garage2 = new Car[5];
    for (int i = 0; i < garage.length; i++) {
      garage2[i] = garage[i];
    }

    System.out.println("-------");
    for (int i = 0; i < garage2.length; i++) {
      if(garage2[i]  != null) {
        System.out.println(garage2[i].toString());
      }
    }

  }
}
