package uistore;
import org.openqa.selenium.By;

public  class Locator{
    public static By otherBrands=By.xpath("//span[text()='Other Brands']");
    public static By simba=By.xpath("//span[text()='Simba']");
    public static By batman=By.xpath("//input[@id='Search-In-Modal-Single']");
    public static By search=By.xpath("(//button[@class='button search__button field__button focus-inset'])[1]");
  //  public static By justice=By.xpath("//label[text()='Justice League']");
    public static By shopeage=By.xpath("//span[text()='Shop by Age']");
    public static By age=By.xpath("//span[text()='8 to 10 years']");
    public static By prodLink=By.xpath("(//a[@class='card-title link-underline card-title-ellipsis'])[1]");
    public static By addToCart=By.xpath("//button[@id='product-add-to-cart']");
	public static By justice=By.xpath("//label[text()='Justice League']");
}
