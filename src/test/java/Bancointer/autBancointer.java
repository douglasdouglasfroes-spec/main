package Bancointer;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class autBancointer {
	//istancia do meu driver
	WebDriver  driver;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://inter.co/");
		
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void testaberturadeconta() throws InterruptedException {
		 Thread.sleep(2000);
		driver.findElement(By.cssSelector("#my-scroll-container > div.sc-1eyyf0l-1.llAUKn.d-flex.align-items-start.align-items-lg-center > div > div > div > div > div > button")).click();   
        Thread.sleep(10000);
        String texto = driver.findElement(By.xpath("(//h2)[9]")).getText();
        assertEquals("Abra agora sua Conta Digital",texto );
        System.out.println("valor da variavel texto:" + texto);
        driver.findElement(By.id("name")).sendKeys("douglas sousa froes");
        Thread.sleep(2000);
        driver.findElement(By.id("phone")).sendKeys("77991612396");
        driver.findElement(By.id("email")).sendKeys("douglasdouglasfroes@gmail.com");
        driver.findElement(By.id("socialId")).sendKeys("03835393588");
        driver.findElement(By.id("dateOfBirth")).sendKeys("20031991");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("label[for='conta-digital-pf']")).click();
        Thread.sleep(30000);
        driver.findElement(By.xpath("(//button)[9]")).click();
        Thread.sleep(30000);
        
	
		
	}

}
