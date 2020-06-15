package atividade2.scenarios;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import atividade2.core.Driver;
import atividade2.pages.InicioPage;
import atividade2.pages.VoosPage;

public class CT02 {

	WebDriver driver;
	InicioPage inicioPage;
	VoosPage voosPage;
	
	/*
	 *  1 - Acessar o site: https://blazedemo.com/
		2 - No select “Choose your departure city:” selecionar “San Diego”.
		3 - No select “Choose your destination city:” selecionar “New York”.
		3 - Clicar em “Find Flights”.
		4 - Escolher a primeira viagem, ou seja clicar no primeiro botão “Choose This Flight”
		5 - Preencher todos os campos do formulário
		6 - Enviar (Purchase Flight) o formulário
		7 - Validar mensagem de sucesso
	 */
	
	@Before
	public void before(){
		driver = new Driver().getDriver();
		Driver.acessarURL(driver, "https://blazedemo.com/");
		inicioPage = new InicioPage(driver);
		voosPage = new VoosPage(driver);
	}
	
	@Test
	public void test() {
		inicioPage.selecionarCidade();
		voosPage.escolherViagem();
		voosPage.preencherFormulario();
		voosPage.validarMensagem();
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
