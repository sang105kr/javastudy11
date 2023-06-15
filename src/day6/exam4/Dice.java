package day6.exam4;

public class Dice {
  //주사위 눈
  int faceValue;
  
  //주사위 굴리기
  public int roll(){
    faceValue = (int)(Math.random()*6)+1;
    return faceValue;
  }

  //현재 주사위 눈 상태 반환
  public int getFaceValue(){
    return faceValue;
  }
}
