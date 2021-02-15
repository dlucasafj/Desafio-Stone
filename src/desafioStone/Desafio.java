package desafioStone;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Classe responsável por implementar a função/método solicitada no desafio
 * 
 * @author daniel
 */
public class Desafio {
	
	private float valorTotalLista;
	private int valorDeCadaEmail;
	

	
/**
 * Método responsável por realizar os cálculos para saber o valor total da lista de compras 
 * e quanto cada email(pessoa) envolvida deverá pagar
 * 
 * @param itens - Lista de itens para a compra
 * @param emails - Lista dos envolvidos na compra
 * @return Map<String,Integer> - Retorna um map relacionando o email(pessoa) ao valor que deverá ser pago
 */
 public Map<String,Integer> calcula(List<Item>itens,List<String>emails){
	 
	 Map<String,Integer>mapa = new HashMap<>();
	 int qtdItemPreco=0;
	 valorTotalLista =0;
	 
	 
	 if(!itens.isEmpty() || !emails.isEmpty()) {
		 
		 for(Item i:itens) {
			 
			 qtdItemPreco = i.getQuantidadeItem()*i.getPreco(); // multiplica quantidade pelo valor do item 
			 valorTotalLista+=qtdItemPreco; 
		 }
		 
		 valorDeCadaEmail = (int) (valorTotalLista/emails.size()); 
		 
		 int resto = calculaResto(valorDeCadaEmail,emails.size()); // caso tenha alguma dizima, obter o resto
		 
		 
		 for(int i=0;i<emails.size();i++) {
			 
			 if(i==0) {
				 mapa.put(emails.get(i),resto +valorDeCadaEmail);
			 }else {
				 mapa.put(emails.get(i), valorDeCadaEmail);
			 }
			 
		 }
		 return mapa;	 
	 }else {
		 
		 return mapa;
	 }
	 
	}
 
 
 private int calculaResto(int valor, int qtdEmail) {
	 
	 int valorTotalEmail = valor*qtdEmail;
	 int resto = (int) (valorTotalLista-valorTotalEmail);
	 
	 return resto;
	 
 }
}
