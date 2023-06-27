package day13.quiz8;

public class Book {
  private String bookname;
  private String bookAuthor;
  private int bookPrice;

  public Book(String bookname, String bookAuthor, int bookPrice) {
    this.bookname = bookname;
    this.bookAuthor = bookAuthor;
    this.bookPrice = bookPrice;
  }

  @Override
  public String toString() {
    return "Book{" +
        "bookname='" + bookname + '\'' +
        ", bookAuthor='" + bookAuthor + '\'' +
        ", bookPrice=" + bookPrice +
        '}';
  }
}
