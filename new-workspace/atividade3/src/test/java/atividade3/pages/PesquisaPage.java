/**
 * 
 */
package atividade3.pages;

import org.openqa.selenium.WebDriver;

import atividade3.uimaps.InicioMap;
import atividade3.uimaps.PesquisaMap;

/**
 * @author Altamara
 *
 */
public class PesquisaPage {
	WebDriver driver;
	//ProdutoMap produtoMap = new ProdutoMap(driver); 
	
	public PesquisaPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	PesquisaMap pesquisaMap = new PesquisaMap(driver);
	

	public void acessaLink() {
		pesquisaMap.linkProduto.click(driver);
	}
		
		//Capa Targus Ipad Mini Rotating Versavu THZ668 Grafite
	

}
