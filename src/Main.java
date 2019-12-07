import java.util.Locale;
import java.util.Scanner;

import entidade.Produtos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println();
		
		Produtos produtos = new Produtos();
		
		System.out.println("Entre com o nome:");
		produtos.nome = sc.nextLine();
		
		
		System.out.println();
		System.out.println("digite o preco");
		produtos.preco = (int) sc.nextDouble();
		
		System.out.println();
		System.out.println("Quantidade no estoque:");
		produtos.quantidade = sc.nextInt();
		
		System.out.println(produtos.nome + ","+ produtos.preco +","+ produtos.quantidade);
		
		System.out.println();
		System.out.println("entre com o numero de produtos pra add no estoque:");
		int quantidade = sc.nextInt();
		produtos.addProducts(quantidade);
		
		System.out.println();
		System.out.println("Update data: "+ produtos);
		
		System.out.println();
		System.out.println("entre com o numero de produtos pra add no estoque:");
		quantidade = sc.nextInt();
		produtos.removerProdutos(quantidade);
		
		System.out.println(produtos.nome + ","+ produtos.preco +","+ produtos.quantidade);
		
		
		
		sc.close();
	}

}
