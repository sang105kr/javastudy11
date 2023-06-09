package day2;

public class Exam8 {
  public static void method1(){
    System.out.println("method1()호출됨");
  }
  public static void method2(int n){
    System.out.println("method2()호출됨");
  }
  // 2배수 메소드
  public static int method3(int n){
    System.out.println("method3()호출됨");

    int result = n * 2;
    return result;
  }
  // 3배수 메소드
  public static int method4(int n){
    System.out.println("method3()호출됨");

    int result = n * 3;
    return result;
  }

  public static void main(String[] args) {
    System.out.println("main()호출됨");
    method1();
    int result = method3(2);
    System.out.println("result="+result);

    result = method3(3);
    System.out.println("result="+result);

    int x = 10;
    int y = 20;
    method2(x+y);

    //변수초기화
    int z = 10;
    int z2 = x + y;
    int z3 = method3(z);
    int z4 = method3(z) + method4(z2);
  }
}
