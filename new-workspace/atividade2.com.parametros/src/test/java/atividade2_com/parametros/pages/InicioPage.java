package atividade2_com.parametros.pages;

import org.openqa.selenium.WebDriver;

import atividade2.com.parametros.uimaps.InicioMap;



public class InicioPage {
	
	WebDriver driver;
	String vooOrigem;
	String vooDestino;
	
	
	public InicioPage(WebDriver driver) {
	
		this.driver = driver;
	}
	
	InicioMap inicioMap = new InicioMap(driver);
	
	public void selecionarCidade(String selecionaVooOrigem, String selecionaVooDestino) {
		this.vooOrigem = selecionaVooOrigem;
		this.vooDestino = selecionaVooDestino;
		inicioMap.selectCidadeOrigem.select(driver, selecionaVooOrigem);
		inicioMap.selectCidadeDestino.select(driver, selecionaVooDestino);
		inicioMap.btnEncontrarVoo("Encontrar voos").click(driver);
	}

}
