package Aula_criacao;
import java.util.Scanner;

/* Exercicio
Calcule as 4 operações básicas: soma, subtração, multiplicação e divisão. Sempre 2 valores devem ser passados.
 */

public class Calculadora {
    public static void main(String[] args) {

        double primeiroNumero;
        double segundoNumero;
        String operacao; // + : soma, - : subtração, * : multiplicação, / : divisão
        Double resultado; // https://stackoverflow.com/questions/20437003/what-is-the-difference-between-double-and-double-in-java

        try (Scanner scan = new Scanner(System.in)) {

            System.out.println("Escolha a operação (+, -, *, /): ");
            operacao = scan.next();

            System.out.println("Digite o 1o. número: ");
            primeiroNumero = scan.nextDouble();

            System.out.println("Digite o 2o. número: ");
            segundoNumero = scan.nextDouble();

            resultado = calcular(operacao, primeiroNumero, segundoNumero);

            String strRetorno = primeiroNumero + " " + operacao + " " + segundoNumero + " = " + resultado;

            if (resultado == null)
                System.out.println("Operação inválida!");
            else
                System.out.println(strRetorno);
        }
    }

    public static Double calcular(String operacao, double primeiroNumero, double segundoNumero) {

        switch (operacao) {
            case "+":
                return somar(primeiroNumero, segundoNumero);
            case "-":
                return subtrair(primeiroNumero, segundoNumero);
            case "*":
                return multiplicar(primeiroNumero, segundoNumero);
            case "/":
                return dividir(primeiroNumero, segundoNumero);
            default:
                return null; // como o tipo é um objeto Double, é possível atribuir null.
        }
    }

    private static double somar(double primeiroNumero, double segundoNumero) {
        return primeiroNumero + segundoNumero;
    }

    private static double subtrair(double primeiroNumero, double segundoNumero) {
        return primeiroNumero - segundoNumero;
    }

    private static double multiplicar(double primeiroNumero, double segundoNumero) {
        return primeiroNumero * segundoNumero;
    }

    private static double dividir(double primeiroNumero, double segundoNumero) {
        return primeiroNumero / segundoNumero;
    }
}
