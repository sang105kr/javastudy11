package day8.exam6;

public class CarMain2 {
  public static void main(String[] args) {
    Car c1 = new Car(1111, "검정");
    Car c2 = new Car(2222, "흰색");
    Car c3 = new Car(3333, "빨강");

    // 마지막 차량고유번호
    System.out.println(Car.getUniqueNumber());

    // 차량고유번호(001,002,...)
    System.out.println(c1.getDisplayUniqueNumber());
    System.out.println(c2.getDisplayUniqueNumber());
    System.out.println(c3.getDisplayUniqueNumber());

    System.out.println(c1);  //c1.toString()
    System.out.println(c2);  //c2.toString()
    System.out.println(c3);  //c3.toString()

    c1.speedUp();
    System.out.println(c1);

//    System.out.println(c1.getUniqueNumber());
//    System.out.println(c2.getUniqueNumber());
//    System.out.println(c3.getUniqueNumber());


//    int num = 23;  //차량 고유번호(숫자)
//    String s = String.valueOf(num); //차량 고유번호(문자열)
//    int length = s.length(); //차량 고유번호(문자열) 길이
//    //System.out.println("차량번호 길이="+length);
//
//    // 전체자리수에서 "0"으로 채울 갯수 계산
//    String zero = "";
//    for (int i = 1; i <= 4 - length; i++) {
//      zero += "0";
//    }
//
//    System.out.println(zero + num);
      Car[] cargo = new Car[3];
      cargo[0] = new Car(1111, "검정");
      cargo[1] = new Car(2222, "흰색");
      cargo[2] = new Car(3333, "빨강");

    for (int i = 0; i < cargo.length; i++) {
      System.out.println(cargo[i]);
    }

  }
}
