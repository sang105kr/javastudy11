package day11.exec1.quiz8;

public class TimeDriver {
  public static void main(String[] args) {
    Time time = new Time();

    time.printTime();

    time.setHour(12);
    time.setMinute(27);
    time.setSecond(30);

    time.printTime();

    time.adjustHour(1);
    time.printTime();

    time.adjustHour(20);

    System.out.println(time);
    System.out.println(time.toString());
  }
}
