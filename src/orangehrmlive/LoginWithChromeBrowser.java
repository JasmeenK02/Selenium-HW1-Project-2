package orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * 1.Setup Chrome Browser
 * 2. Open URL
 * 3. Print the title of the page
 * 4.Print the current url
 * 5. Print the page source
 * 6. Enter the email to email  field
 * 7.Enter the password to password field
 * 8.Close the browser
 */

public class LoginWithChromeBrowser {
    public static void main(String[] args) {

        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        //Launching the Chrome Browser
        WebDriver driver = new ChromeDriver();
        //Open the URL into Browser
        driver.get(baseUrl);
        // we give Implicit wait to Driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Get the Title of the page
        String title = driver.getTitle();
        System.out.println("Page Title is :" + title);

        //Print the current URL
        System.out.println("Current URL " + driver.getCurrentUrl());

        //Print the page source
        System.out.println("Page source : " + driver.getPageSource());

        //Find the username field element
        WebElement usernamefield = driver.findElement(By.name("username"));

        //Type the username to the username field element
        usernamefield.sendKeys("jasmeen144@gmail.com");

        //find the password field and type the password
        driver.findElement(By.name("password")).sendKeys("Prime");

        // Browser close
        driver.close();
    }
}
