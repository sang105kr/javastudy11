package day13.quiz7;

public class CD {
  private String title;	// 제목
  private String artist;	// 연주자
  private int cost;		// 구입가격

  public CD(String title, String artist, int cost) {
    this.title = title;
    this.artist = artist;
    this.cost = cost;
  }

  @Override
  public String toString() {
    return "CD{" +
        "title='" + title + '\'' +
        ", artist='" + artist + '\'' +
        ", cost=" + cost +
        '}';
  }

  public int getCost() {
    return cost;
  }
}
