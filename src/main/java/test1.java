import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test1 {
 public static void main(String [] args ){

     System.setProperty("webdriver.gecko.driver","C:\\Users\\ionela.raluca\\IdeaProjects\\MvP\\drivers\\geckodriver\\geckodriver.exe");

     WebDriver driver =new FirefoxDriver();
     driver.manage().deleteAllCookies();

     driver.get("http://www.amazon.com/");

     JavascriptExecutor js = (JavascriptExecutor)driver;

     WebElement SearchBox = driver.findElement(By.id("twotabsearchtextbox"));
     SearchBox.sendKeys("Bose ");


     WebElement SearchIcon = driver.findElement(By.className("nav-input"));
     SearchIcon.click();

 }

}
