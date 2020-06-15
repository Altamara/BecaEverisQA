package atividade2_com.parametros.core;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	WebDriver driver;

	//gerar construtor
	public Driver() {
		System.setProperty("webdriver.chrome.driver","driver"+File.separator+"chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	//gerar get and set(sem necessidade)
	public WebDriver getDriver() {
		return driver;
	}

	//criar metodo para acesar URL:
	public static void acessarURL(WebDriver driver, String url) {
		driver.get(url);
	}
	
	//metodo para finalizar o driver
	public static void close(WebDriver driver) {
		driver.close();
		driver.quit();
	}
	


}
