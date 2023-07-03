package semonster2;

import org.junit.Test;
import org.junit.Assert;

import java.util.LinkedList;

public class PlayerTest {
    @Test
    public void testtoString(){
        LinkedList<Integer> monsterList = new LinkedList<>();
        monsterList.add(4);
        monsterList.add(4);
        monsterList.add(3);
        monsterList.add(3);
        monsterList.add(2);
        monsterList.add(2);
        monsterList.add(1);
        monsterList.add(1);
        monsterList.add(0);
        monsterList.add(0);
        String name = "user"; 
        Player player = new Player(monsterList, name);
        Assert.assertEquals("Deck:user\n",player.toString());
    }
}
