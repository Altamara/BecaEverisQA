package atividade3.pages;

import org.openqa.selenium.WebDriver;

import atividade3.uimaps.InicioMap;
import atividade3.uimaps.PesquisaMap;

public class InicioPage {
	WebDriver driver;
	PesquisaMap pesquisaMap;
	String produto;

	public InicioPage(WebDriver driver) {

		this.driver = driver;
	}
	
	InicioMap inicioMap = new InicioMap(driver);

	public void pesquisarProduto(String pesquisaProduto) {
		this.produto = pesquisaProduto;
		inicioMap.pesquisaProduto.sendKey(driver, pesquisaProduto);
		inicioMap.btnBuscaProduto("BUSCAR").click(driver);

	}

	// "Capa Targus Ipad Mini Rotating Versavu THZ668 Grafite"
}
