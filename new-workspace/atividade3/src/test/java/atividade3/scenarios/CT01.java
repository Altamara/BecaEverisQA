package atividade3.scenarios;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import atividade3.core.Driver;
import atividade3.pages.InicioPage;
import atividade3.pages.PesquisaPage;
import atividade3.pages.ProdutoPage;

public class CT01 {
	WebDriver driver;
	InicioPage inicioPage;
	String pesquisaProduto = "HD WD Blue, 1TB, 3.5´, SATA - WD10EZEX";
	PesquisaPage pesquisaPage;
	ProdutoPage produtoPage;
	String cep = "38413"+"108 ";
	
	
	
	/*
	 *  1- Acessar o site: https://www.kabum.com.br/ok
		2- No input “buscar”, pesquisar: HD WD Blue, 1TB, 3.5´, SATA - WD10EZEX/ok
		3- Clicar em “Buscar”/ok
		4- Clicar no Link do produto pesquisado/ok
		5- No campo “Digite seu CEP” preencher com o CEP: 38413-108/ok
		6- Clicar em “Calcular Frete”/ok
		7- Validar se os 3 valores de frete são: "R$ 25,10", "R$ 28,03", "R$ 45,83, R$ 54,38"
	 */
	
	
	@Before
	public void before(){
		driver = new Driver().getDriver();
		Driver.acessarURL(driver, "https://www.kabum.com.br/");
		inicioPage = new InicioPage(driver);
		pesquisaPage = new PesquisaPage(driver);
		produtoPage = new ProdutoPage(driver);
		
	}
	
	/*
	 * public CT01() { inicioPage = new InicioPage(driver); pesquisaPage = new
	 * PesquisaPage(); produtoPage = new ProdutoPage(driver); pesquisaProduto =
	 * "Capa Targus Ipad Mini Rotating Versavu THZ668 Grafite";
	 * 
	 * }
	 */
	
	@Test
	public void test() {
		inicioPage.pesquisarProduto(pesquisaProduto);
		pesquisaPage.acessaLink();
		produtoPage.preencheCep(cep);
		produtoPage.calculaFrete();
	//	produtoPage.teste();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	@After
	public void after() {
		Driver.close(driver);
	}

}
