package day02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.text.Position;
import java.time.Duration;

public class tekrar {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https:www.amazon.com");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

































































}}
