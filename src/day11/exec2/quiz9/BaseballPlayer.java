package day11.exec2.quiz9;

public class BaseballPlayer {
  private String name;       //야구선수의 이름
  private String position;    //야구선수의 위치
  private int	numHits;        //야구선수의 안타수
  private int	numWalks;       // 야구선수의 4구수

  public BaseballPlayer(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public int getNumHits() {
    return numHits;
  }

  public void setNumHits(int numHits) {
    this.numHits = numHits;
  }

  public int getNumWalks() {
    return numWalks;
  }

  public void setNumWalks(int numWalks) {
    this.numWalks = numWalks;
  }

  @Override
  public String toString() {
    return "BaseballPlayer{" +
        "name='" + name + '\'' +
        ", position='" + position + '\'' +
        ", numHits=" + numHits +
        ", numWalks=" + numWalks +
        '}';
  }
}
