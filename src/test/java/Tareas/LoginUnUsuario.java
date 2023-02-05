package Tareas;

import org.openqa.selenium.WebDriver;

import Acciones.Click;
import Acciones.Escribir;
import Objetos.PO_SaucelabsloginUsuario;

public class LoginUnUsuario {
	
	public static void Como(WebDriver driver, String Usuario,String Password) {
		
		Escribir.sobre(driver,PO_SaucelabsloginUsuario.Username, Usuario);
		Escribir.sobre(driver,PO_SaucelabsloginUsuario.Password, Password);
		Click.sobre(driver, PO_SaucelabsloginUsuario.BtnloginUsuario);
	}

}
