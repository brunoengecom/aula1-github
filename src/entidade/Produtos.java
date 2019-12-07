package entidade;

public class Produtos{
	public String nome;
	public int preco;
	public int quantidade;
	
	public double totoalValorEstoque(int quantidade) {
		return preco * quantidade;
	}
	
	public void addProducts(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removerProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}
	public String toString() {
		return nome
				+", $"
				+preco
				+", "
				+quantidade
				+" Unidades, Total:$ "
				+ totoalValorEstoque(quantidade);
	}
}