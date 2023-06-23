package day11.exec2.quiz7;

public class Coin {
  private final int HEADS = 1;
  private final int TAILS = 2;
  private int face;  //1 앞면,2 뒷면

  public Coin(){
    flip();
  }

  public void flip(){
    face = (int)Math.random()*2+1;
  }

  public int getFace() {
    return face;
  }

  @Override
  public String toString() {
//    String statusOfCoin = "";
//
//    //case1)
////    if (face == 1) {
////      statusOfCoin = "앞면";
////    }else{
////      statusOfCoin = "뒷면";
////    }
//    //case2)
//    statusOfCoin = (face == 1) ? "앞면" : "뒷면";
//    return "Coin{" + statusOfCoin + "}";
////    return "Coin{" +
////        "face=" + ((face==1) ? "앞면":"뒷면") +
////        '}';

    return (face == 1) ? "앞면" : "뒷면";
  }
}
