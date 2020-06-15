package atividade3.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import atividade3.uimaps.ProdutoMap;

public class ProdutoPage {

	WebDriver driver;

	public ProdutoPage(WebDriver driver) {
		this.driver = driver;
	}
	
	ProdutoMap produtoMap = new ProdutoMap(driver);
	
	public void preencheCep(String cep) {
		
		produtoMap.inputCEP.sendKey(driver, cep);
	}
	
	public void calculaFrete() {
		produtoMap.btnCalculaCep.click(driver);
	}
	
	public void validaFrete() {
	WebDriverWait wait = new WebDriverWait(driver, 10);
	
	
	try {
		String frete1 = driver.findElement(By.xpath(produtoMap.validaFrete1.getValue())).getText().intern();
		System.out.println(frete1);
		//frete1 = frete1;
		Assert.assertEquals("R$ 25,10",frete1);
		System.out.println("Sucesso!");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Falha!");
		}
	
	try {
		String frete2 = driver.findElement(By.xpath(produtoMap.validaFrete2.getValue())).getText().intern();
		System.out.println(frete2);
		frete2 = frete2;
		Assert.assertEquals("R$ 28,03",frete2);
		System.out.println("Sucesso!");
		}catch(Exception e){
			System.out.println("Falha!");
		}
	try {
		String frete3 = driver.findElement(By.xpath(produtoMap.validaFrete3.getValue())).getText().intern();
		System.out.println(frete3);
		frete3 = frete3;
		Assert.assertEquals("R$ 45,83",frete3);
		System.out.println("Sucesso!");
		}catch(Exception e){
			System.out.println("Falha!");
		}
	try {
		String frete4 = driver.findElement(By.xpath(produtoMap.validaFrete4.getValue())).getText().intern();
		System.out.println(frete4);
		frete4 = frete4;
		Assert.assertEquals("R$ 54,38",frete4);
		System.out.println("Sucesso!");
		}catch(Exception e){
			System.out.println("Falha!");
		}
		
	}
}
