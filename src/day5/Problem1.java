package day5;

/*
  문제) 교실에 앉아있는 교육생 자리를 참고하여 2차원 비정방행열을 만들고
        반장 1명, 각 테이블에서 조장을 1명 랜덤하게 선출하는 프로그램을 구현하시오
 */
public class Problem1 {
  public static void main(String[] args) {
    //case1)
    String[][] classRoom = {
        {"고형창", "박정현", "정인수"},
        {"곽문경", "최민석", "김재민", "김병국"},
        {"김기덕2", "유재성", "박수미"},
        {"김기덕1", "김영환", "박정연"},
        {"권기준", "김지열", "김홍섭"}
    };
//    //case2)
//    String[][] classRoom2 = new String[][]{
//        {"고형창", "박정현", "정인수"},
//        {"곽문경", "최민석", "김재민", "김병국"},
//        {"김기덕2", "유재성", "박수미"},
//        {"김기덕1", "김영환", "박정연"},
//        {"권기준", "김지열", "김홍섭"}
//    };
//    //case3)
//    String[][] classRoom3 = new String[5][];
//    classRoom3[0] = new String[]{"고형창", "박정현", "정인수"};
//    classRoom3[1] = new String[]{"곽문경", "최민석", "김재민", "김병국"};
//    classRoom3[2] = new String[]{"김기덕2", "유재성", "박수미"};
//    classRoom3[3] = new String[]{"김기덕1", "김영환", "박정연"};
//    classRoom3[4] = new String[]{"김기덕1", "김영환", "박정연"};

    // 반장 선출
    int row = (int) (Math.random() * classRoom.length);
    int column =  (int) (Math.random() * classRoom[row].length);
    System.out.println("반장 : " + classRoom[row][column]);
    classRoom[row][column] = null;

    // 조장 선출
    for (int i = 0; i < classRoom.length; i++) {
      boolean stop = false;
      // 반장으로 선출되면 조장에서 제외
      while (!stop) {
        int rColumn = (int) (Math.random() * classRoom[i].length);
        if(classRoom[i][rColumn] == null)  {
          continue;
        }else {
          stop = true;
        }
        System.out.println((i + 1) + "조 조장 : " + classRoom[i][rColumn]);
      }
    }
  }
}
