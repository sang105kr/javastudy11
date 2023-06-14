package day5;
/*
  2차원 비정방 행열
 */
public class Exam6 {
  public static void main(String[] args) {
    int[][] arr = new int[3][];

    System.out.println("arr="+arr);
    System.out.println("arr[0]="+arr[0]);
    System.out.println("arr[1]="+arr[1]);
    System.out.println("arr[2]="+arr[2]);
    arr[0] = new int[2];
    arr[1] = new int[1];
    arr[2] = new int[3];

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.println("arr["+i+"]["+j+"] = " + arr[i][j]);
      }
    }

//    arr[0][0] = 1;
//    arr[0][1] = 2;
//    arr[1][0] = 3;
//    arr[2][0] = 4;
//    arr[2][1] = 5;
//    arr[2][2] = 6;
    int value = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        arr[i][j] = ++value;
      }
    }

    System.out.println("-------------");

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.println("arr["+i+"]["+j+"] = " + arr[i][j]);
      }
    }
  }
}
