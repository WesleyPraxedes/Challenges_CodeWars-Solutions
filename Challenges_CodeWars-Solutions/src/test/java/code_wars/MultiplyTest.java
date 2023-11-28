package code_wars;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplyTest {

    @Test
    void testMultiply() {
        // Testando a multiplicação de dois números positivos
        assertEquals(20.0, Multiply.multiply(4.0, 5.0), 0.0001);

        // Testando a multiplicação de um número positivo por zero
        assertEquals(0.0, Multiply.multiply(7.0, 0.0), 0.0001);

        // Testando a multiplicação de um número negativo por um número positivo
        assertEquals(-15.0, Multiply.multiply(-3.0, 5.0), 0.0001);

        // Testando a multiplicação de dois números negativos
        assertEquals(12.25, Multiply.multiply(-3.5, -3.5), 0.0001);

        // Adicione mais casos de teste conforme necessário para cobrir diferentes cenários.
    }

}
