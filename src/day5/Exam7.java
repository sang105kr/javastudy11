package day5;

public class Exam7 {
  public static void main(String[] args) {
    int[][] coin = new int[2][4];

    int[][] coin2 = {
        {500,100,50,10},
        {10,5,20,30}
    };

    for (int i = 0; i < coin2.length; i++) {
      for (int j = 0; j < coin2[i].length; j++) {
        System.out.printf("%3d\t",coin2[i][j]);
      }
      System.out.println();
    }
  }
}
