package day2;

public class Exam10 {
  public static void main(String[] args) {
    System.out.println( true ^ true);
    System.out.println( false ^ false);
    System.out.println( true ^ false);
    System.out.println( false ^ true);
    
    int num = 7;
    if( num % 3 == 0){
      System.out.println("3배수다");
    }else{
      System.out.println("3배수 아니다");
    }

    String result = (num % 3 == 0) ? "3배수다" : "3배수아니다";
    System.out.println(result);
  }
}
