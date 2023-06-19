package day8.exam6;

public class Car {
  private final int carNumber;      //차량번호
  private int speed;                //운행속도
  private String color;             //색상
  private String displayUniqueNumber; //차량고유번호(문자열로 001,002,003)

  private static int uniqueNumber;  //차량고유번호(정수로 순차적인 번호계산용도)
  private final int MAX_SIZE_OF_UNIQUE_ENUMBER = 3; //차량고유번호 자리수

  public Car(int carNumber, String color) {
    this.carNumber = carNumber;
    this.color = color;
    uniqueNumber++;

    //차량고유번호->문자열변환
    displayUniqueNumber = changeCarNumber(uniqueNumber);
  }

  //차량고유번호->문자열변환
  private String changeCarNumber(int carNumber) {
    //1) 차량고유번호(정수)->차량고유번호(문자열)
    String carNumberToString = String.valueOf(carNumber);
    int lengthOfCarNumber = carNumberToString.length();

    //2) 차량고유번호 전체자리수에서 "0"으로 채울 갯수 계산
    String zero = "";
    for (int i = 1; i <= MAX_SIZE_OF_UNIQUE_ENUMBER - lengthOfCarNumber; i++) {
      zero += "0";
    }

    return zero + carNumberToString;
  }

  //가속하다
  void speedUp(){
    if ( speed + 10 > 240) {
      return;
    }
    speed += 10; //speed = speed + 10;
  }
  //감속하다
  void speedDown(){
    if ( speed - 10 < 0) {
      return;
    }
    speed -= 10; //speed = speed - 10;
  }

  //색상 변경
  public void setColor(String color) {
    this.color = color;
  }

  public int getCarNumber() {
    return carNumber;
  }

  public int getSpeed() {
    return speed;
  }

  public String getColor() {
    return color;
  }

  // 마지막 차량고유번호
  public static int getUniqueNumber() {
    return uniqueNumber;
  }

  // 차량고유번호(001,002,...)
  public String getDisplayUniqueNumber() {
    return displayUniqueNumber;
  }

  @Override
  public String toString() {
    return "Car{" +
        "displayUniqueNumber=" + displayUniqueNumber +
        ", carNumber=" + carNumber +
        ", speed=" + speed +
        ", color='" + color + '\'' +
        '}';
  }
}
