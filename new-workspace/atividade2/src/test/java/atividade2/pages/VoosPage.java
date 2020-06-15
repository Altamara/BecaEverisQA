package atividade2.pages;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import atividade2.uimaps.VoosMap;

public class VoosPage {
	
WebDriver driver;
	
	public VoosPage(WebDriver driver) {
	
		this.driver = driver;
	}
	
	VoosMap voosMap = new VoosMap(driver);
	
	//botão "Choose this Fligth
	public void escolherViagem() {
		voosMap.btnEscolherViagem.click(driver);
	}
	
	/**metodo que valida a mensagem de sucesso
 	 */

	public void validarCabecalho() {
	WebDriverWait wait = new WebDriverWait(driver, 10);
	

	try {
		String resultado = driver.findElement(By.xpath(voosMap.tituloCabecalho.getValue())).getText();
		System.out.println(resultado);
		resultado = resultado;
		Assert.assertEquals("Flights from San Diego to New York:",resultado);
		System.out.println("Sucesso!");
		}catch(Exception e){
			System.out.println("Falha!");
		}
	
	}
	
	public void preencherFormulario() {
		voosMap.inputName.sendKey(driver, "Altamara Rodovalho");
		voosMap.inputAdress.sendKey(driver, "Av. Adriano Bailoni, 415");
		voosMap.inputCity.sendKey(driver, "Uberlândia");
		voosMap.inputState.sendKey(driver, "Minas Gerais");
		voosMap.inputZipCode.sendKey(driver, "38414304");
		voosMap.inputCardType.sendKey(driver, "American Express");
		voosMap.inputCreditCardNumber.sendKey(driver, "25202314200");
		voosMap.inputMonth.sendKey(driver, "02");
		voosMap.inputYear.sendKey(driver, "2027");
		voosMap.inputNameCard.sendKey(driver, "Altamara Rodovalho");
		voosMap.btnRemember.click(driver);
		voosMap.btnPurchase.click(driver);
	}
	
	public void validarMensagem() {
		WebDriverWait wait = new WebDriverWait(driver, 10);

	
	try {
		String mensagem = driver.findElement(By.xpath(voosMap.validaMensagem.getValue())).getText();
		System.out.println(mensagem);
		mensagem = mensagem;
		Assert.assertEquals("Thank you for your purchase today!",mensagem);
		System.out.println("Cadastro realizado com sucesso!");
		}catch(Exception e){
			System.out.println("Falha!");
		}
	}
}
