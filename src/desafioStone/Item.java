package desafioStone;

/**
 * Classe para objetos do tipo Item, onde estão contidos os dados referente a um item. 
 * 
 * @author daniel
 * @version 1.0
 */
public class Item {
	
	private String nome;
	private int quantidadeItem;
	private int preco;
	
	/**
	 * Construtor da classe Item
	 * @param nome - nome do item
	 * @param quantidadeItem - Quantidade de itens a serem adicionado a lista de compras
	 * @param preco - valor unitário de cada item 
	 */
	public Item(String nome, int quantidadeItem, int preco) {
	
		this.nome = nome;
		this.quantidadeItem = quantidadeItem;
		this.preco = preco;
	}
	

	/**
	 * Método para retorno do nome do item
	 * @return String - o nome do item
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Metodo retorna a quantidade de item 
	 * @return int - quantidade de itens
	 */
	public int getQuantidadeItem() {
		return quantidadeItem;
	}

	/**
	 * Metodo retorna o preço unitário inteiro do item
	 * @return int - preço do item
	 */
	public int getPreco() {
		return preco;
	}
	
}
