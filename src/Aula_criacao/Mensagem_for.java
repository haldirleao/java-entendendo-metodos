package Aula_criacao;

/* A partir da hora do dia, informe a mensagem adequada: Bom dia, Boa tarde e Boa noite. */

public class Mensagem_for {
    public static void main(String[] args) {

        for (int hora = -1; hora < 25; hora++) {
            
            System.out.print(hora + " horas: ");

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

}
