/* Recrie a aplicação que calcula a área dos 3 quadriláteros notáveis. Agora faça os métodos retornarem valores. */

package Aula_retorno;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- Exercício. Área de quadriláteros ---");

        System.out.println("Área do quadradro: " + Quadrilatero.area(3));
        System.out.println("Área do retângulo: " + Quadrilatero.area(5,5));
        System.out.println("Área do trapézio: " + Quadrilatero.area(7,8,9));
    }
}