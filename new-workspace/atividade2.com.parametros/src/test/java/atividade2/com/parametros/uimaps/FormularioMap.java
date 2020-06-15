package atividade2.com.parametros.uimaps;

import org.openqa.selenium.WebDriver;

import atividade2_com.parametros.core.Element;
import atividade2_com.parametros.enums.ByValue;

public class FormularioMap {
	
WebDriver driver;
	
	public FormularioMap(WebDriver driver) {
		this.driver = driver;
	}
	
			//formulario
			public Element inputName = new Element(driver, ByValue.ID, "inputName");
			public Element inputAdress = new Element(driver, ByValue.ID, "address");
			public Element inputCity = new Element(driver, ByValue.ID, "city");
			public Element inputState = new Element(driver, ByValue.ID, "state");
			public Element inputZipCode = new Element(driver, ByValue.ID, "zipCode");
			public Element inputCardType = new Element(driver, ByValue.ID, "cardType");
			public Element inputCreditCardNumber = new Element(driver, ByValue.ID, "creditCardNumber");
			public Element inputMonth = new Element(driver, ByValue.ID, "creditCardMonth");
			public Element inputYear = new Element(driver, ByValue.ID, "creditCardYear");
			public Element inputNameCard = new Element(driver, ByValue.ID, "nameOnCard");
			public Element btnRemember = new Element(driver, ByValue.XPATH, "//div[2]/form/div[11]/div/label");
			public Element btnPurchase = new Element(driver, ByValue.XPATH, "//div[2]/form/div[11]/div/input");
			
			//mensagem de sucesso 	
			public Element validaMensagem = new Element(driver, ByValue.XPATH, "//div[2]/div/h1");


}
