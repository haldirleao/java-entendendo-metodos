/* Cria uma aplicação que calcula a área dos 3 quadriláteros notáveis: quadrado, retângulo e trapézio.
Obs: Use sobrecarga. */

package Aula_sobrecarga;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- Exercício. Área de quadriláteros ---");

        Quadrilatero.area(3);
        Quadrilatero.area(5d, 5d); // cast double para garantir que execute a sobrecarga "área retângulo"
        Quadrilatero.area(7, 8, 9);
        Quadrilatero.area(5f, 5f); // cast float para garantir que execute a sobrecarga "área losango"

        float a = (float) (5 * Math.sqrt(2));
        Quadrilatero.area(a, a); // float, logo área losango. Que também é um quadrado de lado 5, logo diagonal
                                 // 5*√2
    }
}