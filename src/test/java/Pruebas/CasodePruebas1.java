package Pruebas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Tareas.LoginUnUsuario;

public class CasodePruebas1 {
   
	public static void main(String [] args) {
	WebDriver driver;

	System.setProperty("webdriver.chrome.driver", "..\\ScreenPlayTest\\Drivers\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	LoginUnUsuario.Como(driver, "standard_user", "secret_sauce");
	
	driver.quit();
	
	}
	
}
