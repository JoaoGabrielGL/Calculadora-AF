package Calculadora;

/**
 * @version 1.1
 * @author João Gabriel
 * @since Release 1.1 - 16/11/2023
 *
 * classe representante o teste de subtraçaõ da calculadora.
 */
public class TesteSubtracao {

    public static void main(String[] args) {
        subtracao calSubtracao = new subtracao();// intsancia a classe

        double subtracao1 = calSubtracao.Subtracao(7, 2);
        System.out.println(subtracao1);
    }
}
