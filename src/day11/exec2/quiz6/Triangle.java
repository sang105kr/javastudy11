package day11.exec2.quiz6;

public class Triangle {
  private int side1;
  private int side2;
  private int side3;

  public Triangle(int side1, int side2, int side3) {
    //super(); 컴파일시 자동 추가
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }

  //직각삼각형인지 : 2변을 각각 제곱한 값이 나머지 1변의 제곱한 값과 같다.
  public boolean isRight() {
    boolean flag = false;

    //연산자 우선순위 : 산술 > 비교 > 논리 > 대입
    if( side1 * side1 + side2 * side2 == side3 * side3 ||
        side2 * side2 + side3 * side3 == side1 * side1 ||
        side3 * side3 + side1 * side1 == side2 * side2) {
      flag = true;
    }

    return flag;
  }

  //이등변삼각형인지 : 3변중 2변이 같다.
  public boolean isIsosceles() {
    boolean flag = false;

    // 비교 > 논리 > 대입
    if( side1 == side2 || side2 == side3 || side3 == side1) {
      flag = true;
    }

    return flag;
  }

  @Override
  public String toString() {
    return "Triangle{" +
        "side1=" + side1 +
        ", side2=" + side2 +
        ", side3=" + side3 +
        '}';
  }
}
