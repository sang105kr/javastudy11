package day16.exam1;

import java.util.ArrayList;
import java.util.Iterator;

public class ListExam1 {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    ArrayList<String> list2 = new ArrayList<>();

    //추가
    list2.add("홍길동");
    list2.add("홍길서");
    list2.add("홍길서");
    System.out.println(list2);

    //원하는 위치에 추가
    list2.add(2, "홍길남");
    System.out.println(list2);

    //특정위치의 객체 수정
    list2.set(2, "홍길북");
    System.out.println(list2);

    //원하는 요소가 있는지
    boolean isExist = list2.contains("홍길북");
    if (isExist) {
      System.out.println("있다");
    } else {
      System.out.println("없다");
    }

    //특정 위치의 요소 반환
    String name = list2.get(2);
    System.out.println("3번째요소:" + name);

    //컬렉션이 비워졌는지 확인
    if (list2.isEmpty()) {
      System.out.println("요소가 없다");
    } else {
      System.out.println("요소가 있다");
    }

    //요소 갯수
    int size = list2.size();
    System.out.println("요소갯수: " + size);

    //특정 위치 요소 삭제
    String removedElement = list2.remove(2);
    System.out.println(list2 + ":" + removedElement);

    //특정 요소 삭제
    list2.remove("홍길서");
    System.out.println(list2);

    //모든요소
    //case1)
    for (int i = 0; i < list2.size(); i++) {
      System.out.println(list2.get(i));
    }
    //case2)
    for (String str : list2) {
      System.out.println(str);
    }
    //case3)
    Iterator<String> iterator = list2.iterator();
    while (iterator.hasNext()) {
      String str = iterator.next();
      System.out.println(str);
    }

    //모든 요소 삭제
    list2.clear();
    System.out.println(list2 + ":" + list2.size());
  }
}

