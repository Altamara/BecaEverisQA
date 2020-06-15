package atividade3.uimaps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import atividade3.core.Element;
import atividade3.enums.ByValue;

public class ProdutoMap {

	WebDriver driver;
	String vFrete;
	
	public ProdutoMap(WebDriver driver) {
		this.driver = driver;
	}

	// Preencher CEP
	public Element inputCEP = new Element(driver, ByValue.XPATH,
			"//div[@class='frete']//input[@class='input-frete cep']");
	

	// Calcula Frete
	public Element btnCalculaCep = new Element(driver, ByValue.XPATH,
			"//div[@class='frete']//input[@class='button-calcula-cep']");

	// Valida valores de Frete

	
		//public Element validaFrete1 = new Element(driver, ByValue.XPATH, "//div[4]//tbody['table-calcular']//tr[1]//td[3]");
	
		public Element validaFrete1 = new Element(driver, ByValue.XPATH, "//td[contains(text(), '25,10')]");
		public Element validaFrete2 = new Element(driver, ByValue.XPATH, "//td[contains(text(), '28,03')]");
		public Element validaFrete3 = new Element(driver, ByValue.XPATH, "//td[contains(text(), '45,83')]");
		public Element validaFrete4 = new Element(driver, ByValue.XPATH, "//td[contains(text(), '54,38')]");

}
