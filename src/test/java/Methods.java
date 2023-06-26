import io.netty.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;
import java.util.Random;

public class Methods {
    protected static WebDriver driver;

    @BeforeClass
    public static void Connect(){
        try{
            ChromeOptions options = new ChromeOptions();
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            driver.get("https://rozetka.com.ua/ua/");
        }catch(Exception e){
            System.out.println("Resource didin't download");
        }
    }
    public static void waitUntil(String selector) throws InterruptedException {
        WebElement element = (new WebDriverWait(driver, java.time.Duration.ofSeconds(10)))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(selector)));
//        Thread.sleep(1500);
    }

    public static void ClickButton(String xp) throws InterruptedException {

        waitUntil(xp);
        WebElement element = driver.findElement(By.xpath(xp));
        element.click();
    }
    public static void WaitLoadPage(int time) throws InterruptedException {
        Thread.sleep(time);
    }
    public static void SendKeys(String xp, String  txt) throws InterruptedException {
        waitUntil(xp);
        WebElement element = driver.findElement(By.xpath(xp));
        element.click();
        element.sendKeys(txt);
    }
    public static void SendKeysWithoutEnter(String xp, String  txt) throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(xp));
        waitUntil(xp);
        element.sendKeys(txt);
    }
    public static String getTXT(String xp){
        WebElement element = driver.findElement(By.xpath(xp));
        String res = element.getText();
        System.out.println(res);
        return res;
    }
    public static String randomEmail(){
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        String dom = "@gmail.com";
        String randomEmail = generatedString+dom;
        return randomEmail;
    }
    public static String randomEmailnodap(){
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        String dom = "gmail.com";
        String randomEmail = generatedString+dom;
        return randomEmail;
    }
    public static String randomEmailNoDomain(){
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        String dom = "@gmailcom";
        String randomEmail = generatedString+dom;
        return randomEmail;
    }
 static boolean isDisplayed(String xp) {
        try {
            return driver.findElement(By.xpath(xp)).isDisplayed();
        } catch (Exception e){
            return false;
        }
    }

    public static String randomName(){
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        String randomEmail = generatedString;
        return randomEmail;
    }

    public static int RandomPhone(){
        int randomNum = (int)(Math.random() * 101);
        return randomNum;
    }
    public static void AssertForTxt(String tl, String expected) throws InterruptedException {
        waitUntil(tl);
        WebElement element = driver.findElement(By.xpath(tl));
        Assert.assertEquals(element.getText(),expected);
        System.out.println(element.getText());
    }
    @AfterClass(alwaysRun = true)
    public static void CloseBrauser(){

//        driver.quit();
    }
}
