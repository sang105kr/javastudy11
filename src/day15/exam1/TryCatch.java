package day15.exam1;

import java.lang.*;

public class TryCatch {
  public static void main(String[] args) throws InterruptedException {
    try {
      System.out.println(3 / 0);
      int[] arr = new int[3];
      arr[3] = 10;
//    }catch(ArithmeticException e){
//      System.out.println("0 으로 나눌수 없습니다.");
//    }catch(ArrayIndexOutOfBoundsException e) {
//      System.out.println("인덱스 범위초과");
//    }
    }catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
      System.out.println("0으로 나누었거나 인덱스 초과예외발생");
    }catch(Exception e){
      System.out.println("그외 예외 발생");
    }finally{
      System.out.println("finally");
    }

    Thread.sleep(1000); // checkedException : 반드시 예외를 잡아줘야함.

//    System.out.println("ㅎㅎㅎ");
//    System.out.println("-----------");
//    try {
//      System.out.println(3 / 1);
//    }catch(Exception e){
//      System.out.println("0 으로 나눌수 없습니다.");
//    }finally {
//      System.out.println("finally");
//    }
//    System.out.println("ㅎㅎㅎ");
  }
}
