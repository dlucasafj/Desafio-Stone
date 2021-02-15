package desafioStone;

import java.util.ArrayList;
import java.util.List;


/**
 * Classe representa uma lista de compras, 
 * onde contém a lista de itens a serem comprados e 
 * os emails das pessoas que dividirão o valor da conta
 * 
 * @author daniel
 *
 */
public class Compra {
	
	private List<Item> listaItens;
	private List<String> emails;
	
	
	/**
	 * Método construtor que inicializa as listas de emails e de itens
	 */
	public Compra() {
		listaItens = new ArrayList<>();
		emails = new ArrayList<>();
		
	}
	
	
	/**
	 * Método adiciona um item na lista de compras
	 * 
	 * @param item - Item a ser comprado, ex: Arroz
	 */
	void addItens(Item item) {
		listaItens.add(item);
	}
	
	/**
	 * Metodo adiciona na lista de email,  
	 * o email de uma pessoa que irá contribuir com o valor da compra
	 * 
	 * @param email - email de uma pessoa que irá contribuir com a conta
	 */
	void addEmails(String email) {
		emails.add(email);
	}
	
	
	/**
	 * Metodo retorna a lista dos itens a serem comprados
	 * 
	 * @return List<Item> - lista de itens a serem comprados
	 */
	List<Item> getListItens(){
		return listaItens;
	}
	
	/**
	 * Método retorna a lista de emails das pessoas envolvida na compra
	 * 
	 * @return List<String> - emails de pessoas envolvidas na compra
	 */
	List<String>getEmails(){
		return emails;
	}

}
