package atividade2_com.parametros.scenarios;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import atividade2_com.parametros.core.Driver;
import atividade2_com.parametros.pages.FormularioPage;
import atividade2_com.parametros.pages.InicioPage;
import atividade2_com.parametros.pages.VoosPage;



public class CT03 {

	WebDriver driver;
	InicioPage inicioPage;
	VoosPage voosPage;
	FormularioPage formularioPage;
	String selecionaVooOrigem = "San Diego";
	String selecionaVooDestino = "New York";
	String fligth = "234";
	String name = "Altamara Rodovalho"; String adress = "Av. Adriano Bailoni, 415"; String city = "Uberlândia"; String state = "Minas Gerais"; 
	String zipCode = "38415001"; String cardType = "American Express";
	String creditCardNumber = "525325622555233"; String month = ""; String year = ""; String nameCard = "Altamara Rodovalho";
	
	/*
	 *  1 - Acessar o site: https://blazedemo.com/
		2 - Em select “Choose your departure city:” selecionar qualquer valor passado por parâmetro
		3 - Em select “Choose your destination city:” selecionar qualquer valor passado por parâmetro
		3 - Clicar em “Find Flights”.
		4 - Escolher a viagem baseada no “Flight#”, ou seja clicar no botão “Choose This Flight” do “Flight#” passado por parâmetro
		5 - Preencher todos os campos do formulário (passar as informações por parâmetro)
		5 - Enviar (Purchase Flight) o formulário
		6 - Validar mensagem de sucesso
	 */
	
	@Before
	public void before(){
		driver = new Driver().getDriver();
		Driver.acessarURL(driver, "https://blazedemo.com/");
		inicioPage = new InicioPage(driver);
		voosPage = new VoosPage(driver);
		formularioPage = new FormularioPage(driver);
	}
	
	@Test
	public void test() {
		inicioPage.selecionarCidade(selecionaVooOrigem, selecionaVooDestino);
		voosPage.escolherViagem(fligth);
		formularioPage.preencherFormulario(name, adress, city, state, zipCode, cardType,
		creditCardNumber, month, year, nameCard);
		formularioPage.validarMensagem();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@After
	public void after() {
		Driver.close(driver);
	}
	
}
