package day5;
/*
  변수 유효범위 : 변수가 선언된 블럭 내에서 유효함.
 */
public class Exam2 {
  public static void method1(){
    int x = 10;
  }
  public static void main(String[] args) {
    int x = 10;
    {
      //int x;
      int y = 20;
      x = 30;
      System.out.println("x="+x);
      System.out.println("y="+y);
      if(true){
        int z = 100;
        System.out.println("z=" + z);
      }
      //System.out.println("z=" + z);
    }
    System.out.println("x="+x);
    //System.out.println("y="+y);
    int y = 50;

    int sum = 0;
    int i = 0;
    for ( ; i < 5; i++) {
      sum += i;
    }
    System.out.println("sum=" + sum);
    System.out.println("i="+i);
  }
}
