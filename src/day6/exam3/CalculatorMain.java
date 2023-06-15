package day6.exam3;



public class CalculatorMain {
  public static void main(String[] args) {
    Calculator c1 = new Calculator();

    System.out.println(c1.add(10, 20));

    int result = c1.add(20,30);
    System.out.println("result="+result);

    int result2 = c1.add(c1.add(40, 50), c1.add(60, 70));
    System.out.println("result2="+result2);

    System.out.println(c1.color);
    c1.color = "검정";

    System.out.println(c1.color);

    Calculator c2 = new Calculator("빨강");
    System.out.println(c2.add(10,20));
  }
}
