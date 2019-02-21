package exercicio;

import java.util.Scanner;

public class exerc4 {
    public static void main(String[] args) {
        double media, soma=0, nota;
        double[] notas = new double[4];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println(" Digite a nota do aluno " + (i + 1));
            notas[i] = sc.nextDouble();
            soma = notas[i];
        }
        media = soma / 4;

        System.out.println(" media de notas da turma: " + media);

    }
}