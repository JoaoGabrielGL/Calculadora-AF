package Calculadora;

/**
 * @version 1.1
 * @author João Gabriel
 * @since Release 1.1 - 16/11/2023
 *
 * classe representante o teste de multiplicação da calculadora.
 */

public class TesteMultiplicacao {

    public static void main(String[] args) {
        multiplacao calMultiplacao = new multiplacao();// intsancia a classe

        double multiplacao1 = calMultiplacao.Multplicacao(7.9, 2.0);
        System.out.println(multiplacao1);
    }
}
