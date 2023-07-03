package com.kh.dic;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Dictionary extends TreeMap<String, String> {
  private static final int WORD_CAPACITY = 5; // 단어 최대 저장 갯수

  public static final int ASC_SORT  = 1;    // 1:오름차순 2:내림차순
  public static final int DESC_SORT =  2;

  public Dictionary() {
    super();
    init();
  }

  //저장
  public void save(String word, String meaning) {
    String wordToLowerCase = word.toLowerCase();
    //1) 단어수 초과
    if (size() == WORD_CAPACITY) {
      throw new DictionaryException("최대 단어수 초과!");
    }
    ;
    //2) 단어 중복체크
    if (containsKey(wordToLowerCase)) {
      throw new DictionaryException("이미 등록되었습니다!");
    }
    put(wordToLowerCase, meaning);
  }

  //검색
  public Map<String, String> findByWord(String word) {
    String wordToLowerCase = word.toLowerCase();
    Map<String, String> map = new HashMap<>();

    //1)일치하는 단어를 검색
    if (containsKey(wordToLowerCase)) {
      String meaning = get(wordToLowerCase);
      map.put(wordToLowerCase, meaning);
      return map;
    }
    //2)일치하는 단어가 없을경우. 즉, 범위검색  ex) sm
    String frontWord = wordToLowerCase.substring(0, wordToLowerCase.length() - 1);  // "s"
    char lastLetter = wordToLowerCase.charAt(wordToLowerCase.length() - 1); // 단어의 마지막문자. 'm'
    char nextLetter = (char) (lastLetter + 1); // 단어의 마지막문자의 다음문자 'n'
    String nextForntWord = frontWord + String.valueOf(nextLetter); // "sn"
    map = subMap(wordToLowerCase, true, String.valueOf(nextForntWord), false);

    //3) 범위검색에도 포함되지 않으면
    if (map.size() == 0) {
      throw new DictionaryException("검색하고자 하는 단어가 없습니다.");
    }
    return map;
  }

  //수정
  public boolean update(String word, String meaning) {
    boolean flag = false;
    String wordToLowerCase = word.toLowerCase();

    if (replace(wordToLowerCase, meaning) == null) {
      throw new DictionaryException("수정하고자 하는 단어가 없습니다.");
    } else {
      flag = true;
    }
    return flag;
  }

  //삭제
  public boolean delete(String word) {
    boolean flag = false;
    String wordToLowerCase = word.toLowerCase();

    if (remove(wordToLowerCase) == null) {
      throw new DictionaryException("삭제하고자 하는 단어가 없습니다.");
    } else {
      flag = true;
    }
    return flag;
  }

  //목록
  public Map<String, String> listAll(int sort) {
    Map<String, String> map = null;
    switch (sort) {
      case ASC_SORT :   // 오름차순
        map = this;
        break;
      case DESC_SORT:_SORT : //내림차순
        map = this.descendingMap();
        break;
      default:
        throw new DictionaryException("정렬방법이 잘못 지정되었습니다.(1: 오름차순, 2:내림차순)");
    }
    return map;
  }

  //색인
  public Map<String,String> index(char ch) {
    char nextLetter = (char)(ch + 1);
    Map<String,String> map = subMap(String.valueOf(ch),true,String.valueOf(nextLetter),false);
    if (map.size() == 0) {
      throw new DictionaryException("초성값으로 시작하는 단어가 없습니다.");
    }
    return map;
  }

  //초기값
  public void init() {
    put("student", "학생");
    put("teacher", "교사");
    put("classroom", "교실");
    put("smart", "현명한");
    put("lunch", "점심");
  }

}
