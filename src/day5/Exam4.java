package day5;
/*
  2차원 배열
  모든 배열은 1차원으로 이루어진다.
 */
public class Exam4 {
  public static void main(String[] args) {
    int[][] arr = new int[2][3];

    System.out.println("arr="+arr);
    System.out.println("arr[0]="+arr[0]);
    System.out.println("arr[1]="+arr[1]);

    System.out.println("arr[0][0]="+arr[0][0]);
    System.out.println("arr[0][1]="+arr[0][1]);
    System.out.println("arr[0][1]="+arr[0][2]);

    System.out.println("arr[0][1]="+arr[1][0]);
    System.out.println("arr[0][1]="+arr[1][1]);
    System.out.println("arr[0][1]="+arr[1][2]);

    System.out.println("arr.length="+arr.length);
    System.out.println("arr[0].length="+arr[0].length);
    System.out.println("arr[1].length="+arr[1].length);

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.println("arr["+i+"]["+j+"] = " + arr[i][j]);
      }
    }
  }
}
