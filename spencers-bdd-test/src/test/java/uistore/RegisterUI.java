package uistore;

import org.openqa.selenium.By;

public class RegisterUI {
    public static By  user = By.xpath("//div[@class='loginBlock loginheaderblock common_click active']");
    public static By  login1 = By.xpath("(//span[text()='Log In'])[1]");
    public static By  username = By.xpath("//input[@id='email']");

    public static By  password = By.xpath("(//input[@id='pass'])[1]");
    public static By  mainLogin = By.xpath("(//span[text()='Login'])[1]");
    // public static By  user = By.xpath("//div[@class='loginBlock loginheaderblock common_click active']");

}
