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
		
		System.out.println ("Insira o pre�o individual: ");
		produto.preco = teclado.nextDouble();
		
		System.out.println ("Confirma��o: "+produto.produto+", Estoque: "+produto.quantidade+" Pre�o: "+produto.preco);
		
		System.out.println ("Deseja acrescentar produtos ao estoque? ");
		int estoque = teclado.nextInt();
		produto.addProdutos(estoque);
		System.out.println ("Atualiza��o: "+produto.produto+", Estoque atual: "+produto.quantidade+" Pre�o: "+produto.preco);
		
		System.out.println ("Foi realizada alguma venda no per�odo? ");
		estoque = teclado.nextInt();
		produto.subProdutos(estoque);
		System.out.println ("Confirma��o ap�s vendas: "+produto.produto+", Estoque atual: "+produto.quantidade+" Pre�o: "+produto.preco+"Valor atual do estoque: R$ "+produto.quantidade*produto.preco);
		
		teclado.close();
		
		}
	}