package uistore;

import org.openqa.selenium.By;

public class ChocolateUI {
    public static By search = By.xpath("//div[@class='search_bar_label']");
    public static By searchBar = By.xpath("//input[@id='search']");
    public static By Go = By.xpath("//span[text()='Go']");
    public static By showMore = By.xpath("(//button[@class='am-show-more -active'])[1]");
    public static By dairy = By.xpath("(//span[text()='Dairy & Ice Creams'])[2]");
    public static By addButton = By.xpath("(//button[@title='Add to Cart'])[1]");
    public static By cartIcon = By.xpath("//a[@class='action showcart common_click']");


   
}
