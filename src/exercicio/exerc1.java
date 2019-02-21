package exercicio;

import java.util.Scanner;

public class exerc1 {

  public static void main (String[] args) {
      double totalvendas, comissao, porcentagem;

      Scanner sc = new Scanner(System.in);
        System.out.println("Digite o total de vendas");
        totalvendas = sc.nextDouble();
         comissao = totalvendas*0.1;
         System.out.println(" Valor da comissão do funcionario " + comissao);
  }
        }