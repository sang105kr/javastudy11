package day11.exec2.quiz1314;

public class ItemSales {
  private int	numberSold;         // 총 판매 수량
  private double sales;           // 총 판매금액
  private double discounts;       // 총 할인금액
  private double itemCost;        // 판매 가격
  private int bulkMin;            // 대량 판매 수량
  private double bulkDiscount;    // 대량 판매 할인율

  //ItemSales: 물품의 판매금액, 대량 판매 수량과 대량 판매 할인율을 각각 주어진 값으로 초기화하면서 객체를 생성한다\
  public ItemSales(double itemCost, int bulkMin, double bulkDiscount) {
    this.itemCost = itemCost;
    this.bulkMin = bulkMin;
    this.bulkDiscount = bulkDiscount;
  }

  //displaySales: 물품의 누적 판매 수량, 누적 판매금액과 누적 할인금액을 출력한다
  public void displaySales(){
    System.out.printf("누적 판매 수량 : %d \t 누적 판매금액 : %.2f \t 누적 할인금액 : %.2f\n",
        numberSold,sales,discounts);
  }

  /**
   * 물품들의 판매 내역을 기록한다
   * @param n 판매수량
   */
  public void registerSale(int n) {
    if( n <= 0) return;
    double basicCost;     // 판매 금액
    double discountGiven; // 할인 금액

//    (1)	한 판매의 기본 판매 금액을 계산한다
    basicCost = n * itemCost;
//    (2)	할인 금액을 0으로 초기화한다
    discountGiven = 0.0;
//    (3)	총 판매 수량 = 총 판매 수량 + n
    numberSold += n;
//    (4)	판매 수량이 대량 판매 수량보다 크거나 같다면 할인 금액을 계산한다
    if( n >= bulkMin) {
      discountGiven = basicCost * bulkDiscount / 100;
    }
//    (5)	총 판매금액에 (기본 판매 금액 – 할인 금액)을 더한다
    sales += basicCost - discountGiven;
//    (6)	총 할인금액에 할인 금액을 더한다
    discounts += discountGiven;
  }

  public int getNumberSold() {
    return numberSold;
  }

  public void setNumberSold(int numberSold) {
    this.numberSold = numberSold;
  }

  public double getSales() {
    return sales;
  }

  public void setSales(double sales) {
    this.sales = sales;
  }

  public double getDiscounts() {
    return discounts;
  }

  public void setDiscounts(double discounts) {
    this.discounts = discounts;
  }

  public double getItemCost() {
    return itemCost;
  }

  public void setItemCost(double itemCost) {
    this.itemCost = itemCost;
  }

  public int getBulkMin() {
    return bulkMin;
  }

  public void setBulkMin(int bulkMin) {
    this.bulkMin = bulkMin;
  }

  public double getBulkDiscount() {
    return bulkDiscount;
  }

  public void setBulkDiscount(double bulkDiscount) {
    this.bulkDiscount = bulkDiscount;
  }
}
