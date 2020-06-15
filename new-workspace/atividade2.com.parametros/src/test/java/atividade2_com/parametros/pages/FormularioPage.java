package atividade2_com.parametros.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import atividade2.com.parametros.uimaps.FormularioMap;
import atividade2.com.parametros.uimaps.VoosMap;
import atividade2_com.parametros.core.Element;
import atividade2_com.parametros.enums.ByValue;

public class FormularioPage {
	
	WebDriver driver;
	
	public FormularioPage(WebDriver driver) {
	
		this.driver = driver;
	}
	
	VoosMap voosMap = new VoosMap(driver);
	
	FormularioMap formularioMap = new FormularioMap(driver);
	
		
	public void preencherFormulario(String name, String adress, String city, String state, String zipCode, String cardType,
			String creditCardNumber, String month, String year, String nameCard) {
		formularioMap.inputName.sendKey(driver, name);
		formularioMap.inputAdress.sendKey(driver, adress);
		formularioMap.inputCity.sendKey(driver, city);
		formularioMap.inputState.sendKey(driver, state);
		formularioMap.inputZipCode.sendKey(driver, zipCode);
		formularioMap.inputCardType.sendKey(driver, cardType);
		formularioMap.inputCreditCardNumber.sendKey(driver, creditCardNumber);
		formularioMap.inputMonth.sendKey(driver, month);
		formularioMap.inputYear.sendKey(driver, year);
		formularioMap.inputNameCard.sendKey(driver, nameCard);
		formularioMap.btnRemember.click(driver);
		formularioMap.btnPurchase.click(driver);
	}

	public void validarMensagem() {
		WebDriverWait wait = new WebDriverWait(driver, 10);

	
	try {
		String mensagem = driver.findElement(By.xpath(formularioMap.validaMensagem.getValue())).getText();
		System.out.println(mensagem);
		mensagem = mensagem;
		Assert.assertEquals("Thank you for your purchase today!",mensagem);
		System.out.println("Cadastro realizado com sucesso!");
		}catch(Exception e){
			System.out.println("Falha!");
		}
	}

}
