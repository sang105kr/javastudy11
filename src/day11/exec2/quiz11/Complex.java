package day11.exec2.quiz11;

public class Complex {
  private double realPart;        // 실수부의 값
  private double imaginaryPart;   // 허수부의 값

  public Complex(){
    super();
  }

  public Complex(double realPart, double imaginaryPart) {
    this.realPart = realPart;
    this.imaginaryPart = imaginaryPart;
  }

  //print: 복소수를 (a, b)의 형태로 출력한다
  public void print() {
    System.out.printf("( %.1f, %.1f )", realPart, imaginaryPart);
    System.out.println();
  }

  //subtract: 한  복소수에서 다른 복소수를 뺀다
  //   ( 2 + 3i ) - ( -3 + 7i ) = 5 + -4i => (5,-4)
  public Complex substract(Complex complex1, Complex complex2) {
    double realPart = complex1.getRealPart() - complex2.getRealPart();
    double imaginaryPart = complex1.getImaginaryPart() - complex2.getImaginaryPart();
    Complex complex = new Complex(realPart, imaginaryPart);
    return complex;
  }

  public double getRealPart() {
    return realPart;
  }

  public double getImaginaryPart() {
    return imaginaryPart;
  }
}
