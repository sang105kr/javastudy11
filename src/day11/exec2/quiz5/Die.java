package day11.exec2.quiz5;

public class Die {
  private int faceValue;  //주사위 눈

  public Die(){
    super();
    faceValue = 1;
  }

  public void roll(){
    faceValue = (int)(Math.random()*6)+1;
  }

  public int getFaceValue() {
    return faceValue;
  }
}
