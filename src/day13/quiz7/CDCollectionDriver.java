package day13.quiz7;

public class CDCollectionDriver {
  public static void main(String[] args) {

    CDCollection music = null;    // CDCollection 객체

//    1.	CDCollection 객체를 만든다.
    music = new CDCollection();
//    2.	CDCollection 객체에 제목이 ‘가야금 작품집’이고 연주자가 ‘홍길동’이고 가격이 25000인 CD 객체를 추가한다.
    music.addCD(new CD("가야금 작품집","홍길동",25000));
//    3.	CDCollection 객체에 제목이 ‘희망의 노래’이고 연주자가 ‘김길동’이고 가격이 20000인 CD 객체를 추가한다.
    music.addCD(new CD("희망의 노래","김길동",20000));
//    4.	CDCollection 객체에 제목이 ‘거문고 작품집’이고 연주자가 ‘이갑순’이고 가격이 30000인 CD 객체를 추가한다.
    music.addCD(new CD("거문고 작품집","이갑순",30000));
//    5.	CDCollection 객체의 내용을 출력한다.
    System.out.println(music);
//    6.	CDCollection 객체에 제목이 ‘기타 작품집’이고 연주자가 ‘전훈동’이고 가격이 40000인 CD 객체를 추가한다.
    music.addCD(new CD("기타 작품집","전동훈",40000));
//    7.	CDCollection 객체에 제목이 ‘바이올린 작품집’이고 연주자가 ‘고소문’이고 가격이 30000인 CD 객체를 추가한다.
    music.addCD(new CD("바이올린 작품집","고소문",30000));
//    8.	CDCollection 객체의 내용을 출력한다.
    System.out.println(music);

  }
}
