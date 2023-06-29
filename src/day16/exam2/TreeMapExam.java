package day16.exam2;

import java.util.*;

public class TreeMapExam {
  public static void main(String[] args) {
    TreeMap<Integer,String> treeMap = new TreeMap<>();
    for (int i = 20; i > 0; i -= 2) {
      treeMap.put(i, i + "번째 데이터");
    }
    System.out.println(treeMap);

    // key가 8~12구간 추출
    //case1)
    SortedMap<Integer, String> sortedMap = treeMap.subMap(8, 14);
    System.out.println(sortedMap);

    //case2)
    sortedMap = treeMap.subMap(8,true,12,true);
    System.out.println(sortedMap);

    sortedMap = treeMap.subMap(8,false,12,false);
    System.out.println(sortedMap);

    //정렬
    NavigableSet<Integer> desendingOfTreeMap = treeMap.descendingKeySet();
    System.out.println(desendingOfTreeMap);

    NavigableMap<Integer, String> desendingOfTreeMap2 = treeMap.descendingMap();
    System.out.println(desendingOfTreeMap2);
    for (Integer key : desendingOfTreeMap2.keySet()) {
      System.out.println(key + " : " + treeMap.get(key));
    }

    desendingOfTreeMap2 = desendingOfTreeMap2.descendingMap();
    System.out.println(desendingOfTreeMap2);

  }
}
