package day11.exec2.quiz12;

public class Pig {
  private int goal;                   //	목표 점수
  private PairOfDice dice;            //	주사위 쌍 객체
  private PigPlayer computer;         //	컴퓨터 선수
  private PigPlayer human;            //	사용자 선수
  private PigPlayer currentPlayer;    // 현 선수

  //생성자 메소드: 목표 점수를 포함하여 게임 시작 전에 초기화한다
  public Pig(int gogal){
    this.goal = gogal;
    dice = new PairOfDice();
    computer = new PigPlayer(20);
    human = new PigPlayer(PigPlayer.ASK);
  }

  //play: 한 선수가 이길 때까지 게임을 반복한다
  private void play(){
    boolean stop = false;
    //컴퓨터 먼저
    currentPlayer = computer;

    do{
      takeTurn();
      //승자 확인, 승자 없으면 선수를 교체후 게임을 이어간다.
      if (currentPlayer.getTotal() >= goal) {
        stop = true;
      }else {
        currentPlayer = (currentPlayer == computer) ? human : computer;
      }
    }while (!stop);

    //결과
    announceWinner();
  }

  //takeTurn: 한 선수의 순서에 대한 게임을 한다
  private void takeTurn(){
    boolean stop = false;

    if (currentPlayer == computer) {
      System.out.println("컴퓨터 차례!");
    }else{
      System.out.println("당신 차례!");
    }

    System.out.println("현 점수");
    System.out.println("컴퓨터 점수: " + computer.getTotal());
    System.out.println("당신 점수: " + human.getTotal());

    while (!stop) {
      stop = currentPlayer.roll(dice,goal);
    }
  }

  //announceWinner: 승자를 발표하고 결과를 출력한다
  private void announceWinner() {
    if (currentPlayer == computer) {
      System.out.println("컴퓨터 승!");
    }else{
      System.out.println("축하합니다. 당신 승!");
    }
    System.out.println("최종결과");
    System.out.println("컴퓨터 점수: " + computer.getTotal());
    System.out.println("당신 점수: " + human.getTotal());
  }

  //main: Pig 객체를 생성하여 게임을 한다
  public static void main(String[] args) {
    Pig game = new Pig(50);
    game.play();
  }
}
