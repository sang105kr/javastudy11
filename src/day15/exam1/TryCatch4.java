package day15.exam1;
/*
Unchecked Exception :  예외 위임시 메소드 선언부에 throws명시할 필요가 없다.
예외처리 2가지 방법
1. try-catch-finally
2. 예외 위임
 */
public class TryCatch4 {
  public static void main(String[] args) {

    method1(0);

    try {
      method2(0);
    } catch (Exception e) {

    }

    try {
      method3();
    } catch (InterruptedException e) {

    }
  }


  //1.try-catch-finally
  private static void method1(int i){
    try {
      System.out.println( 3 / i);
    } catch (Exception e) {

    } finally {
    }
  }

  //2.예외 위임
  private static void method2(int i) {
      System.out.println( 3 / i);
  }


  private static void method3() throws InterruptedException{
    for (int i = 0; i < 5; i++) {
      System.out.println(i);
      Thread.sleep(1000); // unchecked Exception
    }
  }

}
