package atividade2_com.parametros.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import atividade2.com.parametros.uimaps.VoosMap;



public class VoosPage {
	WebDriver driver;
	
	public VoosPage(WebDriver driver) {
	
		this.driver = driver;
	}
	
	VoosMap voosMap = new VoosMap(driver);
	
	//Escolha do voo - botão "Choose this Fligth
	public void escolherViagem(String Flight) {
	
		if (Flight == driver.findElement(By.xpath(voosMap.voo0.getValue())).getText().intern()) {
			voosMap.btnEscolherViagem0.click(driver);
		}
		else if (Flight == driver.findElement(By.xpath(voosMap.voo1.getValue())).getText().intern()) {
			voosMap.btnEscolherViagem1.click(driver);
		}
		else if (Flight == driver.findElement(By.xpath(voosMap.voo2.getValue())).getText().intern()) {
			voosMap.btnEscolherViagem2.click(driver);
		}
		else if (Flight == driver.findElement(By.xpath(voosMap.voo3.getValue())).getText().intern()) {
			voosMap.btnEscolherViagem3.click(driver);
		}
		else {
			voosMap.btnEscolherViagem4.click(driver);
		
		}
	}
	

	
	
	
}
