import org.openqa.selenium.By;

public class Customer extends Common{
    public static void main(String[] args) throws InterruptedException {
        createDriver();
        loginCRM();

        driver.findElement(By.xpath(Locators.menuCustomers)).click();
        System.out.println(driver.findElement(By.xpath("//span[normalize-space()='Customers Summary']")).getText());
        Thread.sleep(2000);
        driver.findElement(By.xpath(Locators.buttonAddNewCustomer)).click();
        driver.findElement(By.xpath(Locators.inputCompany)).sendKeys("CTy Vĩnh Tường YHL 10");
        driver.findElement(By.xpath(Locators.inputVAT)).sendKeys("10");
        driver.findElement(By.xpath(Locators.inputPhoneNumber)).sendKeys("0902xxyyzz");
        driver.findElement(By.xpath(Locators.inputWebsite)).sendKeys("yhl.com");

        driver.findElement(By.xpath(Locators.dropdownGroup)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(Locators.inputSearchGroup)).sendKeys("VIP");
        Thread.sleep(2000);
        driver.findElement(By.xpath(Locators.itemVIP)).click();
        driver.findElement(By.xpath(Locators.dropdownGroup)).click(); //=> đóng dropdown
        Thread.sleep(2000);

        driver.findElement(By.xpath(Locators.dropdownCurrency)).click();
        driver.findElement(By.xpath(Locators.inputSearchCurrency)).sendKeys("VND");
        boolean status = driver.findElement(By.xpath(Locators.notFoundCurrency)).isDisplayed();
        Thread.sleep(2000);
        if (driver.findElement(By.xpath(Locators.notFoundCurrency)).isDisplayed() == true){
            driver.findElement(By.xpath(Locators.inputSearchCurrency)).clear();
            Thread.sleep(2000);
            driver.findElement(By.xpath(Locators.inputSearchCurrency)).sendKeys("USD");
            driver.findElement(By.xpath(Locators.itemUSD)).click();
        }
        Thread.sleep(2000);

        driver.findElement(By.xpath(Locators.dropdownLanguage)).click();
        driver.findElement(By.xpath(Locators.itemVietnamese)).click();
        //=> click xong tự động đóng dropdown nên kh cần click vào dropdown lần nữa

        driver.findElement(By.xpath(Locators.inputAddress)).sendKeys("HCM");
        driver.findElement(By.xpath(Locators.inputCity)).sendKeys("HCM");
        driver.findElement(By.xpath(Locators.inputState)).sendKeys("Q1");
        driver.findElement(By.xpath(Locators.inputZip)).sendKeys("123");

        Thread.sleep(2000);
        driver.findElement(By.xpath(Locators.dropdownCountry)).click();
        driver.findElement(By.xpath(Locators.inputSearchCountry)).sendKeys("Vietnam");
        Thread.sleep(2000);
        driver.findElement(By.xpath(Locators.itemVietnamCountry)).click();
        //chọn Vietnam xong tự động đóng dropdown nên kh cần click lần nữa
        driver.findElement(By.xpath(Locators.buttonSave)).click();
        Thread.sleep(2000);

        //Check alert message nếu có

        //Check item customer hiển thị tại trang Customer list
        driver.findElement(By.xpath(Locators.menuCustomers)).click();
        driver.findElement(By.xpath(Locators.inputSearchCustomer)).sendKeys("CTy Vĩnh Tường YHL 10");
        Thread.sleep(2000);
        System.out.println("isDisplay (Customer List): " + driver.findElement(By.xpath(Locators.itemCustomerFirst)).isDisplayed());
        System.out.println("Customer in List: " + driver.findElement(By.xpath(Locators.itemCustomerFirst)).getText());

        //Check data đã add đúng hết chưa
        driver.findElement(By.xpath(Locators.itemCustomerFirst)).click();
        System.out.println("Company Detail: " + driver.findElement(By.xpath(Locators.inputCompany)).getAttribute("value"));
        System.out.println("VAT: " + driver.findElement(By.xpath(Locators.inputVAT)).getAttribute("value") + "%");
        System.out.println("Phone: " + driver.findElement(By.xpath(Locators.inputPhoneNumber)).getAttribute("value"));
        System.out.println("Webside: " + driver.findElement(By.xpath(Locators.inputWebsite)).getAttribute("title"));
        System.out.println("Group: " + driver.findElement(By.xpath(Locators.dropdownGroup)).getAttribute("title"));
        System.out.println("Currency: " + driver.findElement(By.xpath(Locators.dropdownCurrency)).getAttribute("title"));
        System.out.println("Default Language: " + driver.findElement(By.xpath(Locators.dropdownLanguage)).getAttribute("title"));
        System.out.println("Address: " + driver.findElement(By.xpath(Locators.inputAddress)).getText());
        System.out.println("City: " + driver.findElement(By.xpath(Locators.inputCity)).getAttribute("value"));
        System.out.println("State: " + driver.findElement(By.xpath(Locators.inputState)).getAttribute("value"));
        System.out.println("Zip Code: " + driver.findElement(By.xpath(Locators.inputZip)).getAttribute("value"));
        System.out.println("Country: " + driver.findElement(By.xpath(Locators.dropdownCountry)).getAttribute("title"));


        //Check dạng Integration (liên kết với module khác: Customer liên kết với Project)
        //=> ktra xem sau khi save data ở trang Customer, bên Project => tại dropdown Customer có xuất hiện data đã save kh
        Thread.sleep(2000);

        closeDriver();
    }
}
