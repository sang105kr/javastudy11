package day6.exam3;

public class Calculator {
  // 명사, 필드
  String color;

  // 생성자 오버로딩(overloading)
  // 생성자 이름이 같고, 매개변수가 다른 생성자를 복수로 정의가능
  Calculator(){ }

  Calculator(String color){
    this.color = color;
  }

  //동사,  메소드
  //2개의 정수를 받아 사칙연산
  public int add(int num1, int num2) {
    int sum = 0;
    sum = num1 + num2;
    return sum;
  }
}
