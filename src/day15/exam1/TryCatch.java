package day15.exam1;

import java.lang.*;

public class TryCatch {
  public static void main(String[] args) {
    try {
      System.out.println(3 / 0);
    }catch(Exception e){
      System.out.println("0 으로 나눌수 없습니다.");
    }finally {
      System.out.println("finally");
    }
    System.out.println("ㅎㅎㅎ");
    System.out.println("-----------");
    try {
      System.out.println(3 / 1);
    }catch(Exception e){
      System.out.println("0 으로 나눌수 없습니다.");
    }finally {
      System.out.println("finally");
    }
    System.out.println("ㅎㅎㅎ");
  }
}
