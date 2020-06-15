package atividade1.uimaps;

import org.openqa.selenium.WebDriver;

import atividade1.core.Element;
import atividade1.enums.ByValue;

public class InicioMap {
	
WebDriver driver;
	
	public InicioMap(WebDriver driver) {
		this.driver = driver;
	}

	public Element selectTipoFormulario = new Element(driver, ByValue.XPATH, "//div[@class='nav']/select");
	
	public Element btnViewDemo(String string) {
		return new Element(driver, ByValue.XPATH, "(//a[text()='"+string+"']//following::a[text()='View Demo'])[1]");
	}


}
