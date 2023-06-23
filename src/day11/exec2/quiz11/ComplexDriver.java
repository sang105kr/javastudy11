package day11.exec2.quiz11;

public class ComplexDriver {
  public static void main(String[] args) {
    Complex x = null, y = null, z = null; // 복소수 객체
    //    1.	2 + 3i를 나타내는 복소수 객체 x를 생성한다.
    x = new Complex(2, 3);
    //    2.	-3 + 7i를 나타내는 복소수 객체 y를 생성한다.
    y = new Complex(-3, 7);
    //    3.	z = x – y
    z = new Complex();
    z = z.substract(x, y);
    //    4.	x, y, z를 출력한다
    x.print();
    y.print();
    z.print();
  }
}
