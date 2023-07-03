package com.kh.dic;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DictionaryMain {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Dictionary dic = new Dictionary();
    boolean stop = false;

    do {
      System.out.println("1.저장 2.검색 3.수정 4.삭제 5.목록 6.색인 7.통계 8.종료 9.초기화 10.비우기");
      System.out.print("선택 >> ");
      String menu = scanner.nextLine();
      String word = "";       //단어
      String meaning = "";    //의미
      Map<String, String> findedWords = null; // 검색된 단어목록;
      switch (menu) {
        case "1": //저장
          System.out.print("단어 입력 : ");
          word = scanner.nextLine();
          System.out.print("의미 입력 : ");
          meaning = scanner.nextLine();
          try {
            dic.save(word, meaning);
          } catch (DictionaryException e) {
            System.out.println(e.getMessage());
          }
          break;
        case "2": //검색
          System.out.print("단어 입력 : ");
          word = scanner.nextLine();
          findedWords = dic.findByWord(word);
          //case1) keyset
          Set<String> words = findedWords.keySet();
          for (String key : words) {
            System.out.printf("%s : %s\n",key,findedWords.get(key));
          }
          //case2) entry
//          Set<Map.Entry<String, String>> entries = findedWords.entrySet();
//          for (Map.Entry<String, String> entry : entries) {
//            System.out.printf("%s : %s\n",entry.getKey(),entry.getValue());
//          }

          break;
        case "3":
          break;
        case "4":
          break;
        case "5": //목록
          Map<String,String> map = dic.listAll();
          for(String key : map.keySet()){
            System.out.printf("%s : %s\n",key,map.get(key));
          }
          break;
        case "6":
          break;
        case "7":
          break;
        case "8":
          stop = true;
          break;
        case "9": //초기화
          dic.init();
          break;
        case "10": //비우기
          dic.clear();
          break;
        default:
          System.out.println("잘못된 메뉴 선택!(1~8)");
      }
    } while (!stop);
    System.out.println("영어 단어장을 종료합니다.");
  }
}
