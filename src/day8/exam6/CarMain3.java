package day8.exam6;

public class CarMain3 {
  public static void main(String[] args) {
    //int[] x = new int[3];
    Car[] garage = new Car[3];
    for (int i = 0; i < garage.length; i++) {
      System.out.println(garage);
      System.out.println(garage[i]);
    }

    garage[0] = new Car(1111,"검정");
    String displayUniqueNumber = garage[0].getDisplayUniqueNumber();
    System.out.println(displayUniqueNumber);

    garage[0].speedUp();
    garage[0].speedUp();
    int speed = garage[0].getSpeed();
    System.out.println(speed);

    garage[1] = new Car(2222,"흰색");
    garage[0] = garage[1];
    garage[1] = null;
  }
}













