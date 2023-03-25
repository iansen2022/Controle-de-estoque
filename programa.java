package aplicacao;

import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		produtos produto = new produtos ();
		
		System.out.println ("Qual produto deseja cadastrar: ");
		produto.produto = teclado.next();
		
		System.out.println ("Insira a quantidade: ");
		produto.quantidade = teclado.nextDouble ();
		
		System.out.println ("Insira o preço individual: ");
		produto.preco = teclado.nextDouble();

		}
	}