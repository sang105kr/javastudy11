package day1;

public class Exam8 {
  public static void main(String[] args) {
    int value = 6;

    // value 값은 2의 배수인가?
    if( (value % 2) == 0) {
      System.out.println("2의 배수다");
    }else{
      System.out.println("2의 배수가 아니다");
    }

    // value 값은 2의 배수이고 3의 배수인가?
    if(value % 2 == 0 && value % 3 == 0){
      System.out.println("2 and 3의 배수다");
    }else{
      System.out.println("2 and 3의 배수가 아니다");
    }
    // value 값은 2의 배수 또는 3의 배수인가?
    if(value % 2 == 0 || value % 3 == 0){
      System.out.println("2 or 3의 배수다");
    }else{
      System.out.println("2 or 3의 배수가 아니다");
    }

    boolean result = value % 2 == 0 || value % 3 == 0;
    System.out.println("result=" + result);

    boolean flag2 = false;
    boolean result2 = !flag2;
    System.out.println("result2=" + result2);
  }
}
