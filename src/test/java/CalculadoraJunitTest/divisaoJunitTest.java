package CalculadoraJunitTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @version 1.1
 * @author João Gabriel
 * @since Release 1.1 - 16/11/2023
 *
 * Esta classe representa a classe que ira validar atraves dos testes de jnuit 
 * as operações de Divisão.
 */
public class divisaoJunitTest {

    @Test
    public void divisaoTest() {
        divisao calDivisao = new divisao();//Instancia a classe

        double divisao1 = calDivisao.Divisao(49, 7);

        // Verifica se a divisao está igual a expectada usando JUnit
        assertEquals(7, divisao1);
        System.out.println(divisao1);

    }
}
