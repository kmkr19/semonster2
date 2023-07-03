package semonster2;

import org.junit.Test;
import org.junit.Assert;

public class PlayerTest {
    @Test
    public void testtoString(){
        Player player = new Player(0,0);
        Assert.assertEquals("スライム2:レア度[2]\n",player.toString());
    }
}
