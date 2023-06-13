package day4;

/*
  Lotto 프로그램 구현하시오.
  단) 1~45 사이의 중복없는 6자리 숫자 생성
  Math.random() : 0.0 <= X <1   임의의 실수생성
  1. 1~45사이의 랜덤정수 발생
  2. 중복체크
 */
public class Lotto {

  public static void main(String[] args) {

    final int SIZE = 6;
    int[] lotto = new int[SIZE];

    for (int k=1; k<=5; k++) {
      int dupCnt = 0;   // 중복 발생 카운트
      // lotto 생성
      for (int i = 0; i < lotto.length; i++) {

        boolean stop = false;
        int num = 0;

        while(!stop) {
          //1) 번호추출
          num = (int) (Math.random() * 45) + 1;
          //2) 기존 번호와 중복체크
          boolean isDup = false;
          for (int j = 0; j < i; j++) {
            if (lotto[j] == num) {
              isDup = true;
              dupCnt++;
              System.out.printf("중복 숫자 [%d] %d \n" ,j, num);
              break;
            }
          }
          //3) 중복이 없는 경우 stop = true
          if(!isDup) stop = true;
        }
        lotto[i] = num;
      }

      // 중복 발생 횟수 출력
      System.out.println("중복발생횟수 : " + dupCnt);
      // lotto 출력
      for (int i = 0; i < lotto.length; i++) {
        if( i != lotto.length - 1) {
          System.out.printf("%d,", lotto[i]);
        }else{
          System.out.printf("%d", lotto[i]);
        }
      }
      System.out.println();
    }
  }
}
