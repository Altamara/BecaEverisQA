/**
 * 
 */
package atividade3.uimaps;

import org.openqa.selenium.WebDriver;

import atividade3.core.Element;
import atividade3.enums.ByValue;

/**
 * @author Altamara
 *
 */
public class PesquisaMap {
	WebDriver driver;
	
	public PesquisaMap(WebDriver driver) {
		this.driver = driver;
	}

	//Clique no link do produto
		public Element linkProduto = new Element(driver, ByValue.XPATH,"//div[@class='sc-fzozJi dIEkef']//a");
		

}
