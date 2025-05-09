package tudelft.mirror;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MirrorTest {

    @Test
    public void testMirrorEnds() {
        Mirror mirror = new Mirror();
        
        // Caso 1: "abXYZba" - Reflejo: "ab"
        assertEquals("ab", mirror.mirrorEnds("abXYZba"));
        
        // Caso 2: "abca" - Reflejo: "a"
        assertEquals("a", mirror.mirrorEnds("abca"));
    
        // Caso 3: "a" - Un solo carácter, reflejo completo
        assertEquals("a", mirror.mirrorEnds("a"));
        
        // Caso 4: "ab" - No hay reflejo, vacío
        assertEquals("", mirror.mirrorEnds("ab"));
        
        // Caso 5: "" - Cadena vacía, reflejo vacío
        assertEquals("", mirror.mirrorEnds(""));
    }
}

