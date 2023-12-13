// Generated by Selenium IDE
package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InsertAndDeleteSquirtleTest {
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;

	@BeforeAll
	public void setUp() {
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}

	@AfterAll
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void insertAndDeleteSquirtleTest() {
		driver.get("http://localhost:8080/");
		driver.manage().window().setSize(new Dimension(1373, 929));
		driver.findElement(By.id("nombre")).sendKeys("Squirtl");
		driver.findElement(By.id("apellido")).sendKeys("blastoise");
		driver.findElement(By.xpath("//input[@value=\'Enviar datos\']")).click();
		assertThat(driver.findElement(By.xpath("//td[contains(.,'Squirtl')]")).getText()).isEqualTo("Squirtl");
		assertThat(driver.findElement(By.xpath("//td[contains(.,\'blastoise\')]")).getText()).isEqualTo("blastoise");
		driver.findElement(By.id("deleteBtnSquirtl")).click();
	}
}
