package semonster2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;

public class SeMonsterGame {

  HashMap<String, Player> playerMap = new HashMap<>();
  LinkedList<Integer> randomNumberList = new LinkedList<Integer>();

  /**
   * 0~4までの値がランダムに一定数格納されたLinkedLIst
   *
   * @param randomNumberList
   */
  SeMonsterGame(LinkedList<Integer> randomNumberList) {
    this.randomNumberList = randomNumberList;
  }

  /**
   * プレイヤーを追加
   *
   * @param playerName
   */
  void addPlayer(String playerName) {
    this.playerMap.put(playerName, new Player(randomNumberList, playerName));
  }

  void draw(String playerName) {
    Player player = this.playerMap.get(playerName);
    player.drawMonsters();
    System.out.println(player);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    Random random = new Random();
    LinkedList<Integer> monsterList = new LinkedList<>();
      for(int i=0; i < 10; i++){
        monsterList.add(random.nextInt(5));
      }
    Monster monster = new Monster(random.nextInt(5),random.nextInt(5));
    Player player = new Player(monsterList, "user");
    sb.append(player.toString());
    sb.append("VS\n");
    sb.append(monster.toString());
    return sb.toString();
  }

}