package day8.exam1;

public class Main {
  public static void main(String[] args) {
    Calculator c1 = new Calculator();
    double result = 0.0;
    result = c1.add(1,2);
    System.out.println(result);
    result = c1.add(1,-2.0);
    System.out.println(result);
    result = c1.add(1.0,2.0);
    System.out.println(result);
    result = c1.add(1.0,2.0,3.0);
    System.out.println(result);
  }
}
