package day11.exec1.quiz34;

public class CircleDriver {
  public static void main(String[] args) {
//    변수들
//	cir: Circle 객체 참조변수
    Circle cir = null;
//	area: 원의 면적
    double area = 0.0;
//	perm: 원의 둘레
    double perm = 0.0;
//
//    알고리즘
//    (1)	Circle 객체를 만들어 cir가 가리키게 한다.
    cir = new Circle();
//    (2)	cir의 반지름을 5.0으로 변경한다.
    cir.setRadius(5.0);
//    (3)	cir의 면적을 구하여 area에 저장한다.
    area = cir.computeArea();
//    (4)	cir의 둘레를 구하여 perm에 저장한다.
    perm = cir.comoputePerimeter();
//    (5)	area와 perm을 출력한다.
    System.out.printf("원의면적 : %.2f \t 원의둘레 : %.2f", area, perm);
    System.out.println();
    System.out.println(cir.toString());
  }
}
