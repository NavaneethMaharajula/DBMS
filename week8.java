week 8
package nava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class nava6 {
	public static void main(String args[]) throws Exception{
//        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        WebElement nava=driver.findElement(By.name("q"));
        nava.sendKeys("cmrit hyderabad");
        Thread.sleep(1000);
        nava.sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("h3")).click();
        Thread.sleep(1000);
//        driver.findElement(By.className("elementor-sub-item menu-link")).click();
        driver.findElement(By.linkText("EXAMINATION")).click();
        driver.findElement(By.linkText("Results")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("btech")).click();
        driver.findElement(By.id("R22")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("examListHolderOne")).click();
        WebElement num=driver.findElement(By.cssSelector("input"));
        num.click();
        num.sendKeys("22R01A05N5");
        
        }

}

week 7

