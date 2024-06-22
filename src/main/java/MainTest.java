import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MainTest {
    @Test
    public void testCombinacao() {
        assertEquals(84, Combinatoria.combinacao(9, 3));
        assertEquals(1, Combinatoria.combinacao(5, 0));
        assertEquals(10, Combinatoria.combinacao(5, 3));
        assertEquals(0, Combinatoria.combinacao(3, 5)); // r > n deve retornar 0
    }

    @Test
    public void testPermutacao() {
        assertEquals(60, Permutacao.permutacao(5, 3));
        assertEquals(24, Permutacao.permutacao(4, 3));
        assertEquals(6, Permutacao.permutacao(3, 3));
    }
}
