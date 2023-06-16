package day7.exam10;

public class Car {
  //인스턴스 필드
  int field1;
  //정적 필드 : 인스턴스가 공유하는 변수
  //           인스턴스 생성없이 접근할수 있는 변수
  static int field2;

  // 인스턴스 메소드
  void method1(){
    System.out.println("method1()호출됨");
    field1 = 10;
    field2 = 20;
  }
  
  // 정적 메소드
  static void method2(){
    System.out.println("method2() 호출됨");
    //field1 = 10; 정적 메소드에서 인스턴스 메소드는 사용불가
    field2 = 20;

    //method1(); 정적 메소드에서 인스턴스 메소드는 사용불가
  }
}
