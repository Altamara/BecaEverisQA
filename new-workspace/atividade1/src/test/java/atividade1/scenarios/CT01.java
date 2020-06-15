package atividade1.scenarios;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import atividade1.core.Driver;
import atividade1.pages.FormularioPage;
import atividade1.pages.InicioPage;

public class CT01 {
	
	WebDriver driver;
	InicioPage inicioPage;
	FormularioPage formularioPage;
			
	//PASSO A PASSO DO CASO DE TESTE:
	//acessar o site: https://wpforms.com/demo/
	//selecionar o tipo de formulário “Viewing All Templates” 
	//selecionar “FeedBack”
	//clicar em demo
	//preencher o formulário e enviar
	//validar o envio do formulário
	
	@Before
	public void before(){
		driver = new Driver().getDriver();
		Driver.acessarURL(driver, "https://wpforms.com/demo/");
		inicioPage = new InicioPage(driver);
		formularioPage = new FormularioPage(driver);
	}
	
	@Test
	public void test() {
		inicioPage.selecionarTipoFormulario();
		formularioPage.preencherFormulario();
		formularioPage.validarMensagemSucesso();
		
		
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
