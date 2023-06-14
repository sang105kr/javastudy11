package day5;
/*
  값 복사, 주소 복사
 */
public class Exam3 {
  //값 복사
  public static int method1(int x){
    System.out.println("method1()호출됨");
    System.out.println("method1()_x="+x);  // 10
    x += 10; //x = x + 10;
    System.out.println("method1()_x="+x);  // 20
    return x;
  }
  //주소 복사
  public static void method2(int[] subject){  // subject = x100
    System.out.println("method2()_subject=" +subject);
    for (int ele : subject) {
      System.out.println("ele="+ele);  // 90, 80, 70
    }
    subject[0] = 50; subject[1] = 60; subject[2] = 70;
  }
  public static void main(String[] args) {
    int x = 10;
//    method1(x);   // 메소드 호출
//    System.out.println("main()_x=" + x);   // 10

    int y = method1(x); // 20
    System.out.println("y=" + y);
//=====================================================================
    int[] subject = new int[]{90,80,70};      // x100
    System.out.println("main()_subject="+subject);  // x100
    method2(subject); // x100
    for (int ele : subject) {
      System.out.println("ele="+ele);   // 50, 60, 70
    }
  }
}
