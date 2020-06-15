package atividade2.com.parametros.uimaps;

import org.openqa.selenium.WebDriver;

import atividade2_com.parametros.core.Element;
import atividade2_com.parametros.enums.ByValue;



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
