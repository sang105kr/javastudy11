package day5;
/*
  무한루프 빠져나오기
 */
public class Exam9 {
  public static void main(String[] args) {
    int i = 0;
//    case1) break사용
//    while (true) {
//      i++;
//      System.out.println(i);
//      // i 값이 10 이면 반복문 빠져나오기
//      if (i == 10) {
//        break;
//      }
//    }
    
    //case2) flag사용
//    boolean stop = false;
//    while(!stop){
//      i++;
//      System.out.println(i);
//      // i 값이 10 이면 반복문 빠져나오기
//      if (i == 10) {
//        stop = true;
//      }
//    }

    //case3) 중첩반복문  break label;
//    outer:
//    while (true) {
//      System.out.println(i++);
//      int j = 0;
//      while (true) {
//        System.out.println(j++);
//        //j값이 10일때 제일 바깥쪽 while문 빠져나오기
//        if (j == 10) {
//          break outer;
//        }
//      }
//    }
    //case4) 중첩반복문 flag
    boolean outerStop = false;
    while (!outerStop) {
      System.out.println(i++);

      int j = 0;
      boolean innerStop = false;
      while (!innerStop) {
        System.out.println(j++);
        //j값이 10일때 제일 바깥쪽 while문 빠져나오기
        if (j == 10) {
          innerStop = true;
          outerStop = true;
        }
      }
    }

  }
}
