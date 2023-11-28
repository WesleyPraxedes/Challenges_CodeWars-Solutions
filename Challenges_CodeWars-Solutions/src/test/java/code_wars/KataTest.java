package code_wars;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
	
	@Test
    void testCheck_same_case() {
        
		assertEquals(1, Kata.sameCase('a', 'g'));
		
		// Testando quando ambos são minúsculos, deve retornar 1
        assertEquals(1, Kata.sameCase('a', 'g'));

        // Testando quando ambos são maiúsculos, deve retornar 1
        assertEquals(1, Kata.sameCase('A', 'C'));

        // Testando quando um é minúsculo e o outro é maiúsculo, deve retornar 0
        assertEquals(0, Kata.sameCase('b', 'G'));

        // Testando quando um é maiúsculo e o outro é minúsculo, deve retornar 0
        assertEquals(0, Kata.sameCase('B', 'g'));

        // Testando quando pelo menos um não é uma letra, deve retornar -1
        assertEquals(-1, Kata.sameCase('0', '?'));

        // Adicione mais casos de teste conforme necessário para cobrir diferentes cenários.
        
	}

}
