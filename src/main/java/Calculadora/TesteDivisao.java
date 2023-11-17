package Calculadora;

/**
 * @version 1.1
 * @author João Gabriel
 * @since Release 1.1 - 16/11/2023
 *
 * classe representante o teste de divisão da calculadora.
 */

public class TesteDivisao {

    public static void main(String[] args) {
        divisao calDivisao = new divisao();// intsancia a classe

        double divisao1 = calDivisao.Divisao(8.0, 2.0);
        System.out.println(divisao1);
    }
}
