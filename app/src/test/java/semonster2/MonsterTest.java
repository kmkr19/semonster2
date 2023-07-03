package semonster2;

import org.junit.Test;
import org.junit.Assert;

public class MonsterTest {
    @Test
    public void testtoString(){
        Monster monstertest = new Monster(0,0);
        Assert.assertEquals("スライム:レア度[0]\n",monstertest.toString());
    }
    @Test
    public void testtoString2(){
        Monster monstertest = new Monster(0,3);
        Assert.assertEquals("スライム2:レア度[3]\n",monstertest.toString());
    }
}
