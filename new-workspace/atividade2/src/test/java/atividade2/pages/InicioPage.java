package atividade2.pages;

import org.openqa.selenium.WebDriver;

import atividade2.uimaps.InicioMap;



public class InicioPage {

WebDriver driver;
	
	public InicioPage(WebDriver driver) {
	
		this.driver = driver;
	}
	
	InicioMap inicioMap = new InicioMap(driver);
	
	public void selecionarCidade() {
		inicioMap.selectCidadeOrigem.select(driver, "San Diego");
		inicioMap.selectCidadeDestino.select(driver, "New York");
		inicioMap.btnEncontrarVoo("Encontrar voos").click(driver);
	}
	
}
