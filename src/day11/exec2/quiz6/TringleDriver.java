package day11.exec2.quiz6;

public class TringleDriver {
  private static void printTriangeType(Triangle triangle) {
    if(triangle.isRight()){
      System.out.println("직각삼각형");
    } else if (triangle.isIsosceles()) {
      System.out.println("이등변삼각형");
    } else {
      System.out.println("직각삼각형도 아니고 이등변삼각형도 아니다");
    }
    System.out.println(triangle);
  }

  public static void main(String[] args) {
    Triangle t1 = null ,t2 = null ,t3 = null;

    t1 = new Triangle(3, 5, 7);
    t2 = new Triangle(3, 4, 5);
    t3 = new Triangle(7, 10, 7);

    printTriangeType(t1);
    printTriangeType(t2);
    printTriangeType(t3);

//    if(t1.isRight()){
//      System.out.println("직각삼각형");
//    } else if (t1.isIsosceles()) {
//      System.out.println("이등변삼각형");
//    } else {
//      System.out.println("직각삼각형도 아니고 이등변삼각형도 아니다");
//    }
//    if(t2.isRight()){
//      System.out.println("직각삼각형");
//    } else if (t2.isIsosceles()) {
//      System.out.println("이등변삼각형");
//    } else {
//      System.out.println("직각삼각형도 아니고 이등변삼각형도 아니다");
//    }
//    if(t3.isRight()){
//      System.out.println("직각삼각형");
//    } else if (t3.isIsosceles()) {
//      System.out.println("이등변삼각형");
//    } else {
//      System.out.println("직각삼각형도 아니고 이등변삼각형도 아니다");
//    }


  }

}
