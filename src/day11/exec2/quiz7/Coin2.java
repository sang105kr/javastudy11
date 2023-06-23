package day11.exec2.quiz7;

public class Coin2 {

  private FACE_OF_COIN face;  //1 앞면,2 뒷면

  public Coin2(){
    flip();
  }

  public void flip(){
    int l_face = (int)Math.random()*2+1;
    switch (l_face){
      case 1:
        face = FACE_OF_COIN.HEADS;
        break;
      case 2:
        face = FACE_OF_COIN.TAILS;
        break;
    }
  }

  public FACE_OF_COIN getFace() {
    return face;
  }

  @Override
  public String toString() {
    String statusOfCoin = "";
    switch (face){
      case HEADS:
        statusOfCoin = "앞면";
        break;
      case TAILS:
        statusOfCoin = "뒷면";
        break;
    }
    return statusOfCoin;
  }
}
