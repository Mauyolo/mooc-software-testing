package tudelft.ghappy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class GHappyTest {

    @Test
    public void testHappyG() {
        GHappy gh = new GHappy();
        Assertions.assertTrue(gh.gHappy("xxggxx"));
        Assertions.assertFalse(gh.gHappy("xxgxx"));
        Assertions.assertFalse(gh.gHappy("xxggyygxx"));
    }
}

