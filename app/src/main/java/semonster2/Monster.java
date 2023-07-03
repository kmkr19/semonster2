package semonster2;

public class Monster {
  String name;
  int rare;// 1:normal,2:uncommon,3:rare,4:ultra rare

  Monster(int nameNum, int rareNum) {
    this.name = this.summonMonster(nameNum);
    if(rareNum >= 3){
      this.name = this.summonMonster2(nameNum);
    }
    this.rare = rareNum;
  }

  String summonMonster(int mnumber) {
    String monsters[] = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント" };
    return monsters[mnumber];
  }

  String summonMonster2(int mnumber) {
    String monsters[] = { "ギガスライム", "ギガサハギン", "ギガドラゴン", "テラデュラハン", "テラシーサーペント" };
    return monsters[mnumber];
  }

  @Override
  public String toString() {

    return this.name + ":レア度[" + this.rare + "]\n";
  }
}
