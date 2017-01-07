package sitstest.sitstest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SITSmercury {

	public static void main(String[] args) {
		// TODO Auto-generated method stubri
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		System.out.println("Mercury Page is opened");
	}

}
