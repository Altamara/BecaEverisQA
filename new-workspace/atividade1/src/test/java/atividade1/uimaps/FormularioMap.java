package atividade1.uimaps;

import org.openqa.selenium.WebDriver;

import atividade1.core.Element;
import atividade1.enums.ByValue;

public class FormularioMap {
	
WebDriver driver;
	
	public FormularioMap(WebDriver driver) {
		this.driver = driver;
	}
	//Formulario
	public Element inputFrequence = new Element(driver, ByValue.ID, "wpforms-260271-field_1_2");
	public Element inputAttend = new Element(driver, ByValue.ID, "wpforms-260271-field_2");
	public Element inputTypes = new Element(driver, ByValue.ID, "wpforms-260271-field_3");
	public Element inputParticipate = new Element(driver, ByValue.ID, "wpforms-260271-field_4_4");
	public Element inputNotParticpate = new Element(driver, ByValue.ID, "wpforms-260271-field_5");
	public Element inputTypesActivities = new Element(driver, ByValue.ID, "wpforms-260271-field_6");
	public Element btnSubmit = new Element(driver, ByValue.XPATH, "//button[text()='Submit']");
	
	//Mensagem
	public Element tituloMensagem = new Element(driver, ByValue.XPATH, "//h3[text()='Congrats, You Completed the First Step!']");
	public Element btnMensagem = new Element(driver, ByValue.XPATH, "//h3[text()='Congrats, You Completed the First Step!']/..//a[@class='button']");
	
}
