package tudelft.caesarshift;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import tudelft.caesarshift.CaesarShiftCipher;

public class  CaesarShiftCipherTest {

    @Test
    public void testCaesarCipher() {
        CaesarShiftCipher cs = new CaesarShiftCipher();
        Assertions.assertEquals("def", cs.encrypt("abc", 3));
        Assertions.assertEquals("xyz", cs.encrypt("uvw", 3));
        Assertions.assertEquals("abc", cs.encrypt("xyz", 3));
    }
}
