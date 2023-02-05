package Acciones;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Escribir {
	
	public static void sobre(WebDriver driver,By localizador, String texto) {
		
		driver.findElement(localizador).sendKeys(texto);
		
	}

}
