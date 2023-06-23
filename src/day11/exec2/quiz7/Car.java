package day11.exec2.quiz7;

public class Car {
  private static int uniqueNumber;
  private static final String maker = "현대";

  private String color;

  public Car(){
    uniqueNumber++;
  }

  public static int getUniqueNumber(){
    return uniqueNumber;
  }
}
