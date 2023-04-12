package Aula_criacao;

import java.util.Scanner;

/* A partir da hora do dia, informe a mensagem adequada: Bom dia, Boa tarde e Boa noite. */

public class Mensagem_scanner {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {

            int hora;
            System.out.println("Entre com a hora do dia (0..23): ");
            hora = scan.nextInt();

            cumprimentar(hora);
        }
    }

    public static void cumprimentar(int hora) {
        if ((hora < 0) || (hora > 23))
            System.out.println("Hora inválida!");
        else if (hora >= 5 && hora <= 12)
            System.out.println("Bom dia!");
        else if (hora > 12 && hora <= 17)
            System.out.println("Boa tarde!");
        else // 18 às 04.
            System.out.println("Boa noite!");
    }

}
