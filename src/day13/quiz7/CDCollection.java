package day13.quiz7;

import java.util.Arrays;

public class CDCollection {

  private CD[]	collection;   //CD 객체들의 배열
  private	int count;        //수집한 CD들의 갯수
  private int	totalCost;    //총 구입가격

  //생성자메소드: 비어있는 배열 객체를 만든다
  public CDCollection() {
    collection = new CD[10];
  }

  //addCD: 현 CDCollection 객체에 한 CD 겍체를 추가한다
  public void addCD(CD cd){
    collection[count] = cd;
    count++;
    totalCost += cd.getCost();
  }

  //toString: 현 Course 객체의 상태를 문자열로 반환한다
  @Override
  public String toString() {
    String str = "내 CD 수집품\n\n";

    str += "CD들의 개수: " + count + "\n";
    str += "총 구입가격: " + totalCost + "\n";
    str += "평균 구입가격: " + totalCost/count;

    str += "\n\nCD 목록:\n\t";

    for (int cd = 0; cd < count; cd++)
      str += collection[cd].toString() + "\n\t";

    return str;
  }
}
