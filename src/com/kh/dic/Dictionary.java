package com.kh.dic;

import com.sun.source.tree.Tree;

import java.util.TreeMap;

public class Dictionary {
  private TreeMap<String,String> dic;

  public Dictionary() {
    this.dic = new TreeMap<>();
  }

  //저장
  public void save(String word,String meaning){
    //중복체크
    if(dic.containsKey(word)){
      throw new RuntimeException("중복!");
    }
    dic.put(word,meaning);
  }

  //검색

  //수정


}
