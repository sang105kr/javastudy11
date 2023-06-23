package day11.exec2.quiz1213;

public class ItemSalesDriver {
  public static void main(String[] args) {
    //lunchBoxSeller: ItemSales 객체 참조변수
    ItemSales lunchBoxSeller = null;

    //판매 가격이 1000이고 대량 판매 수량은 10이고 대량 판매 할인율은 30%인 ItemSales 객체를 생성하여 lunchBoxSeller가 가리키게 한다.
    lunchBoxSeller = new ItemSales(1000,10,30.0);
    //도시락을 한 개를 판 내역을 출력한다
    lunchBoxSeller.registerSale(1);
    lunchBoxSeller.displaySales();
    //도시락을 한 개를 판 판매 내역을 기록한다
    //도시락의 누적 판매 수량, 누적 판매금액과 누적 할인금액을 출력한다.
    //도시락을 9 개를 판 내역을 출력한다
    //도시락을 9 개를 판 판매 내역을 기록한다
    //도시락의 누적 판매 수량, 누적 판매금액과 누적 할인금액을 출력한다.
    //도시락을 10 개를 판 내역을 출력한다
    //도시락을 10 개를 판 판매 내역을 기록한다
    //도시락의 누적 판매 수량, 누적 판매금액과 누적 할인금액을 출력한다.
    //도시락을 50 개를 판 내역을 출력한다
    //도시락을 50 개를 판 판매 내역을 기록한다
    //도시락의 누적 판매 수량, 누적 판매금액과 누적 할인금액을 출력한다.

  }
}
