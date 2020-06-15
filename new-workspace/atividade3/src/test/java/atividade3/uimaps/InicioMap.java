package atividade3.uimaps;

import org.openqa.selenium.WebDriver;

import atividade3.core.Element;
import atividade3.enums.ByValue;



public class InicioMap {
	
WebDriver driver;
	
	public InicioMap(WebDriver driver) {
		this.driver = driver;
	}
	
	public Element pesquisaProduto = new Element(driver, ByValue.XPATH, "//div[5]/header/div[1]/div/div[4]/form/input[1]");
	
	public Element btnBuscaProduto(String string) {
		return new Element(driver, ByValue.XPATH, "//div[5]/header/div[1]/div/div[4]/form/input[2]");
	}


}
