package day13.quiz9;

public class Item {
  private String name;    //상품이름
  private int price;      //가격
  private int quantity;   //수량

  public Item(String name, int price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public String getName() {
    return name;
  }

  public int getPrice() {
    return price;
  }

  public int getQuantity() {
    return quantity;
  }

  @Override
  public String toString() {
    return "Item{" +
        "name='" + name + '\'' +
        ", price=" + price +
        ", quantity=" + quantity +
        '}';
  }
}
