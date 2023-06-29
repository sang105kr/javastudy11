package day16.exam1;

import java.sql.Array;
import java.util.ArrayList;

/*
  Wrapper클래스 : 기본타입을 객체화 하기위한 클래스
  byte    ->  Byte
  short   ->  Short
  char    ->  Character
  int     ->  Integer
  long    ->  Long
  float   ->  Float
  double  ->  Double
  boolean ->  Boolean

  문자열 -> 기본타입의 값으로 변환 할때 wrapper클래스 parse로 시작하는 메소드사용
  기본타입 -> 문자열  : String.valueOf(기본타입값)
 */
public class Wrapper {
  public static void main(String[] args) {
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MIN_VALUE);

    if(Boolean.parseBoolean("true")){
      System.out.println("참");
    }

    int y = 10;
    Integer x = 10;
    System.out.println(x);

    ArrayList<Boolean> list = new ArrayList<Boolean>();
    list.add(true);
    list.add(false);
    list.add(true);
    System.out.println(list);
  }
}
