package semonster2;

import org.junit.Test;
import org.junit.Assert;

public class PlayerTest {
    @Test
    public void testtoString(){
        Player player = new Player();
        Assert.assertEquals("スライム2:レア度[3]\n",monstertest.toString());
    }
}
