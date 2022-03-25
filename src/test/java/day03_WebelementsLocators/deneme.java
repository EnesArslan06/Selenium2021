package day03_WebelementsLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class deneme {
    public static void main(String[] args) throws InterruptedException {
        //	a.google web sayfasına gidin. https://www. amazon.com/
        //	b. Search(ara) “city bike”
        //	c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        //	d. “Shopping” e tıklayın.
        //	e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //  a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
       driver.get("http://a.testaddressbook.com/sign_in");
        //	b. Locate email textbox
        WebElement id= driver.findElement(By.xpath("//input[@id='session_email']"));
        //	c. Locate password textbox ve
        WebElement password= driver.findElement(By.xpath("//input[@id='session_password']"));
        //	d. Locate signin button
        WebElement signIn=driver.findElement(By.xpath("//input[@name='commit']"));
        //	e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        //
        //		i. Username : testtechproed@gmail.com
        //		ii. Password : Test1234!
        id.sendKeys("testtechproed@gmail.com");
        password.sendKeys("Test1234!");
        signIn.click();
        driver.findElement(By.linkText("Sign out")).click();
    }
}
