package desafioStone;

import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Classe responsável por realizar o teste da aplicação
 * @author daniel
 *
 */
class DesafioTest {
		
	Item arroz = new Item("arroz",1,850);
	Item feijao = new Item("feijao",1,900);
	Item macarrao = new Item("macarrao",2,800);
	Item bolacha = new Item("bolacha",3,300);
	Item acucar = new Item("acucar",8,400);
	Item leite = new Item("leite",6,350);
	
	String email1= "maria.abc@gmail.com";
	String email2="estela.paulista@gmail.com";
	String email3="marcosLeandro@outlook.com";
	String email4 = "estevao.marcos@yahoo.com";
	
	Compra compras = new Compra();
	Desafio desafio = new Desafio();
	
	@Test
	void testCalcula() {
		Map<String,Integer> emailValor;
		
		
		compras.addItens(macarrao);
		compras.addItens(feijao);
		compras.addItens(arroz);
		compras.addItens(bolacha);
		compras.addItens(acucar);
		compras.addItens(leite);
		
		compras.addEmails(email1);
		compras.addEmails(email2);
		compras.addEmails(email3);
		compras.addEmails(email4);
		
		
		//Chama o método calcula passando a lista de Itens e a de Emails
		emailValor = desafio.calcula(compras.getListItens(), compras.getEmails());
		
		
		
		
		Assertions.assertEquals(2389, emailValor.get(email1));	
		Assertions.assertEquals(2387, emailValor.get("estela.paulista@gmail.com"));	
		Assertions.assertEquals(2387, emailValor.get(email3));	
		Assertions.assertEquals(2387, emailValor.get(email4));	
		
		
		Item carneDeSoja = new Item("CarnedeSoja", 5, 900);	
		compras.addItens(carneDeSoja);
		
		emailValor = desafio.calcula(compras.getListItens(), compras.getEmails());
		
		
		Assertions.assertEquals(7, compras.getListItens().size());		
		Assertions.assertEquals(3512, emailValor.get("estela.paulista@gmail.com"));	
		
		
		
	}
	
	@Test 
	void verificaVazio() {
		Map<String,Integer> emailValor;
		
		emailValor = desafio.calcula(compras.getListItens(), compras.getEmails());
		
		Assertions.assertTrue(emailValor.isEmpty());
		
		compras.addItens(macarrao);
		compras.addItens(feijao);
		compras.addItens(arroz);
		
		emailValor = desafio.calcula(compras.getListItens(), compras.getEmails());
		
		Assertions.assertTrue(emailValor.isEmpty());
		
		
		compras.addEmails(email1);
		compras.addEmails(email2);
		
		emailValor = desafio.calcula(compras.getListItens(), compras.getEmails());
		
		Assertions.assertFalse(emailValor.isEmpty());
		
		
	}
}
