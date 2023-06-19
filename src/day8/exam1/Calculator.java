package day8.exam1;
/*
  오버로딩 : 메소드이름을 같고 매겨변수를 다르게 정의할수 있는 개념

  return : 1. 메소드 종료
           2. return문뒤에 표현식을 평가한 값을 반환하므로
              메소드의 반환타입과 같거나 커야한다.
 */
public class Calculator {


  public double add(int x, double y) {
    if( x < 0 || y < 0) return -1;
    System.out.println("add(int x, double y)");
    double result = 0.0;
    result = x + y;
    return result;
  }

  public double add(double x, double y) {
    System.out.println("add(double x, double y)");
    double result = 0.0;
    result = x + y;
    return result;
  }

  public double add(double x, double y, double z) {
    System.out.println("add(double x, double y, double z)");
    double result = 0.0;
    result = x + y + z;
    return result;
  }

  public double add(int x, int y) {
    System.out.println("add(int x, int y)");
    double result = 0.0;
    result = x + y;
    return result;
  }
}
