package day16.exam1;

import java.util.HashSet;
import java.util.Iterator;

public class SetExam1 {
  public static void main(String[] args) {

    HashSet<String> set = new HashSet<>();
    //요소추가
    set.add("홍길동");
    set.add("홍길서");
    set.add("홍길남");
    set.add("홍길남"); // 중복시 나중요소로 덮어쓴다.
    System.out.println(set);
    System.out.println("요소갯수 : " + set.size());

    //특정요소가 존재하는지
    if(set.contains("홍길동")){
      System.out.println("있다");
    }else{
      System.out.println("없다");
    };
    
    //컬렉션이 비워있는지
    if (set.isEmpty()) {
      System.out.println("요소가 하나도 없다");
    }else{
      System.out.println("요소가 적어도 하나 존재한다");
    }

    //특정요소 제거
    set.remove("홍길서");
    System.out.println(set);

    //모든 요소 접근
    //case1)
    for (String str : set) {
      System.out.println(str);
    }
    //case2) Iterator
    Iterator<String> iterator = set.iterator();
    while (iterator.hasNext()) {
      String str = iterator.next();
      System.out.println(str);
    }

    //모든요소 제거
    set.clear();
    System.out.println(set);

  }
}
