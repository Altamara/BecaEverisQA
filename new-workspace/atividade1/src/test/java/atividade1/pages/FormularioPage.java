package atividade1.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import atividade1.uimaps.FormularioMap;


public class FormularioPage {
	
WebDriver driver;
	
	public FormularioPage(WebDriver driver) {
	
		this.driver = driver;
	}
	
	FormularioMap formularioMap = new FormularioMap(driver);
	
	public void preencherFormulario() {
		formularioMap.inputFrequence.sendKey(driver, "Very often");
		formularioMap.inputAttend.sendKey(driver, "Eu sempre participo");
		formularioMap.inputTypes.sendKey(driver, "Festa Junina");
		formularioMap.inputParticipate.sendKey(driver, "Slightly often");
		formularioMap.inputNotParticpate.sendKey(driver, "Falta de Tempo");
		formularioMap.inputTypesActivities.sendKey(driver, "Beneficientes");
		formularioMap.btnSubmit.click(driver);
	}
	
		/**metodo que valida a mensagem de sucesso
	 	 */
	
	public void validarMensagemSucesso() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(formularioMap.tituloMensagem.getValue())));
			String resultado = driver.findElement(By.xpath(formularioMap.btnMensagem.getValue())).getText();
			System.out.println(resultado);
			resultado = resultado;
			//void org.junit.Assert.assertEquals("Get Started with WPForms Today", resultado);
			Assert.assertEquals("Get Started with WPForms Today",resultado);
			System.out.println("Sucesso!");
			}catch(Exception e){
				System.out.println("Falha!");
			}
		
	}
	

}
