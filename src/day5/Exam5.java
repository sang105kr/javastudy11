package day5;
/*
  3차원 배열
 */
public class Exam5 {
  public static void main(String[] args) {
    int[][][] arr = new int[2][3][4];

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        for (int k = 0; k < arr[i][j].length; k++) {
          System.out.println("arr["+i+"]["+j+"][" + k + "] = " + arr[i][j][k]);
        }
      }
    }
  }
}
