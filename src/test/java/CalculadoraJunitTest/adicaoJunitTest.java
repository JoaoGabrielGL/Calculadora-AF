package CalculadoraJunitTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @version 1.1
 * @author João Gabriel
 * @since Release 1.1 - 16/11/2023
 *
 * Esta classe representa a classe que ira validar atraves dos testes de jnuit 
 * as operações de Adição. 
 */
public class adicaoJunitTest {

    @Test
    public void adicaoTest() {
        adicao calAdicao = new adicao(); //Instancia a classe
        double adicao1 = calAdicao.Adicao(5, 2);

        // Verifica se a adição está igual a expectada usando JUnit
        assertEquals(7, adicao1);
        System.out.println(adicao1);

    }
}
