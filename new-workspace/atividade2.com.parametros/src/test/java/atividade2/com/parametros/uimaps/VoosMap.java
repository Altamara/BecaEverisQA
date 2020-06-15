package atividade2.com.parametros.uimaps;

import java.awt.List;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

import atividade2_com.parametros.core.Element;
import atividade2_com.parametros.enums.ByValue;



public class VoosMap {
	
WebDriver driver;
	
	public VoosMap(WebDriver driver) {
		this.driver = driver;
	}
	
	//botões voo
	public Element btnEscolherViagem0 = new Element(driver, ByValue.XPATH, "//td[text()='43']//preceding::input[@value = 'Choose This Flight'][1]");
	public Element btnEscolherViagem1 = new Element(driver, ByValue.XPATH, "//td[text()='234']//preceding::input[@value = 'Choose This Flight'][1]");
	public Element btnEscolherViagem2 = new Element(driver, ByValue.XPATH, "//td[text()='9696']//preceding::input[@value = 'Choose This Flight'][1]");
	public Element btnEscolherViagem3 = new Element(driver, ByValue.XPATH, "//td[text()='12']//preceding::input[@value = 'Choose This Flight'][1]");
	public Element btnEscolherViagem4 = new Element(driver, ByValue.XPATH, "//td[text()='4346']//preceding::input[@value = 'Choose This Flight'][1]");
	
	//#flights
	public Element voo0 = new Element(driver, ByValue.XPATH, "//td[text()='43']");
	public Element voo1 = new Element(driver, ByValue.XPATH, "//td[text()='234']");
	public Element voo2 = new Element(driver, ByValue.XPATH, "//td[text()='9696']");
	public Element voo3 = new Element(driver, ByValue.XPATH, "//td[text()='12']");
	public Element voo4 = new Element(driver, ByValue.XPATH, "//td[text()='4346']");
	
	//valida cabeçalho
	public Element tituloCabecalho = new Element(driver, ByValue.XPATH, "//div[2]/h3");
	
	
	
}
