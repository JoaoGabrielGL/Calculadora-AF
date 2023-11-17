package CalculadoraJunitTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @version 1.1
 * @author João Gabriel
 * @since Release 1.1 - 16/11/2023
 *
 * Esta classe representa a classe que ira validar atraves dos testes de jnuit 
 * as operações de Multiplicação.
 */
public class multiplacaoJunitTest {


    @Test
    public void multiplicacaoTest() {
        multiplacao calMultiplicacao = new multiplacao();//Instancia a classe

        double multiplicacao1 = calMultiplicacao.Multplicacao(7, 7);

        // Verifica se a multiplicação está igual a expectada usando JUnit
        assertEquals(49, multiplicacao1);
        System.out.println(multiplicacao1);

    }
}
