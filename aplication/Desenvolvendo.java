package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Desenvolvendo {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
	     Produto produto =new Produto();
	     System.out.print("Nome do funcionario: ");
	     produto.nome = sc.nextLine();
	     System.out.printf("Salario bruto: ");
	     produto.salario = sc.nextDouble();
	     System.out.print("Desconto: ");
	     produto.desconto = sc.nextDouble();
	     System.out.println(produto);
		 System.out.print("Qual porcentagem de aumento do salario: ");
	     double taxa = sc.nextDouble();
	     produto.taxa(taxa);
	     System.out.println("Salario atualizado: "+produto);
		 
		 
		 
		 
		 sc.close();
	}

}
