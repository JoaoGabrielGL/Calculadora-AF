package CalculadoraJunitTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @version 1.1
 * @author João Gabriel
 * @since Release 1.1 - 16/11/2023
 *
 * Esta classe representa a classe que ira validar atraves dos testes de jnuit 
 * as operações de Subtração.
 */
public class subtracaoJunitTest {

    @Test
    public void subtracaoTest() {
        subtracao calSubtracao = new subtracao();//Instancia a classe

        double subtracao1 = calSubtracao.Subtracao(8, 1);

        // Verifica se a subtração está igual a expectada usando JUnit
        assertEquals(7, subtracao1);
        System.out.println(subtracao1);

    }
}
