package semonster2;

import org.junit.Test;
import org.junit.Assert;

public class MonsterTest {
    @Test
    public void testtoString(){
        Monster monstertest = new Monster(0,0);
        Assert.assertEquals("スライム:レア度[0]\n",monstertest.toString());
    }
}
