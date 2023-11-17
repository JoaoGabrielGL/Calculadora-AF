package Calculadora;

/**
 * @version 1.1
 * @author João Gabriel
 * @since Release 1.1 - 16/11/2023
 *
 * classe representante o teste de adição da calculadora.
 */
public class TesteAdicao {

    public static void main(String[] args) {
        adicao calAdicao = new adicao();// intsancia a classe

        double adicao1 = calAdicao.Adicao(1, 2);
        System.out.println(adicao1);
    }
}
