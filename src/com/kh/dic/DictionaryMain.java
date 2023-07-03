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
      try {
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
            //          try {
            dic.save(word, meaning);
            //          } catch (DictionaryException e) {
            //            System.out.println(e.getMessage());
            //          }
            break;
          case "2": //검색
            System.out.print("단어 입력 : ");
            word = scanner.nextLine();
            findedWords = dic.findByWord(word);
            //case1) keyset
            Set<String> words = findedWords.keySet();
            for (String key : words) {
              System.out.printf("%s : %s\n", key, findedWords.get(key));
            }
            //case2) entry
            //          Set<Map.Entry<String, String>> entries = findedWords.entrySet();
            //          for (Map.Entry<String, String> entry : entries) {
            //            System.out.printf("%s : %s\n",entry.getKey(),entry.getValue());
            //          }

            break;
          case "3":  //수정
            System.out.print("단어 입력 : ");
            word = scanner.nextLine();
            System.out.print("의미 입력 : ");
            meaning = scanner.nextLine();
            if (dic.update(word, meaning)) {
              System.out.println("단어를 수정하였습니다.!");
            }
            break;
          case "4": //삭제
            System.out.print("단어 입력 : ");
            word = scanner.nextLine();
            if (dic.delete(word)) {
              System.out.println("단어를 삭제하였습니다.!");
            }
            break;
          case "5": //목록
            System.out.println("1.오름차순 2.내림차순");
            System.out.print("선택 >> ");
            String submenu = scanner.nextLine();

            switch (submenu) {
              case "1":
                findedWords = dic.listAll(Dictionary.ASC_SORT);
                break;
              case "2":
                findedWords = dic.listAll(Dictionary.DESC_SORT);
                break;
            }
            for (String key : findedWords.keySet()) {
              System.out.printf("%s : %s\n", key, findedWords.get(key));
            }

            break;
          case "6": // 색인
            do {
              System.out.print("초성 입력 : ");
              word = scanner.nextLine();
              findedWords = dic.index(word.charAt(0));
              for (String key : findedWords.keySet()) {
                System.out.printf("%s : %s\n", key, findedWords.get(key));
              }
            }while(word.length() != 1);

            break;
          case "7": //통계
            break;
          case "8": //종료
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
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    } while (!stop);
    System.out.println("영어 단어장을 종료합니다.");
  }
}
