package atividade2.uimaps;

import org.openqa.selenium.WebDriver;

import atividade2.core.Element;
import atividade2.enums.ByValue;



public class InicioMap {

	WebDriver driver;
	
	public InicioMap(WebDriver driver) {
		this.driver = driver;
	}

	public Element selectCidadeOrigem = new Element(driver, ByValue.XPATH, "//div[3]/form/select[1]");
	
	public Element selectCidadeDestino = new Element(driver, ByValue.XPATH, "//div[3]/form/select[2]");
	
	public Element btnEncontrarVoo(String string) {
		return new Element(driver, ByValue.XPATH, "//div[3]/form/div/input");
	}

}
