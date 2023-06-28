package day14.exam1;

public class Main {
  public static void main(String[] args) {
    //Person p = new Person();
    Student s = new Student();

    //상위 타입은 하위타입을 참조할수 있다.
    Person p = new Student();

    //하위 타입은 상위타입을 참조할수 없다.
    //Student s2 = new Person();
    int x = 10;
    double y = 20.0;

    y = x; // 상위 타입에 하위타입을 대입할 수 있다.
    //x = y; // 하위 타입에 상위타입을 대입할 수 없다.

     x = (int)y;   // 하지만 강제 형변환을 통해 대입 가능(주의: 값손실발생)

    short a = 10;  // 2byte
    byte b = (byte)a;    // 1byte

    byte c = -128;
    byte d = (byte)-129;
    System.out.println("d="+d);
  }
}
