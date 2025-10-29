import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Project extends Common {
    public static void main(String[] args) throws InterruptedException {
        createDriver();
        loginCRM();

        driver.findElement(By.xpath(Locators.menuProjects)).click();
        System.out.println(driver.findElement(By.xpath("//span[normalize-space()='Projects Summary']")).getText());

        Thread.sleep(1000);
        driver.findElement(By.xpath(Locators.buttonAddNewProject)).click();
        System.out.println(driver.findElement(By.xpath(Locators.titleAddNewProject)).getText());
        driver.findElement(By.xpath(Locators.inputProjectName)).sendKeys("Xây nhà cùng Vĩnh Tường YHL");

        Thread.sleep(1000);
        driver.findElement(By.xpath(Locators.dropdownCustomer)).click();
        driver.findElement(By.xpath(Locators.inputSearchCustomerProject)).sendKeys("CTy Vĩnh Tường YHL 10");
        driver.findElement(By.xpath(Locators.itemYHL)).click();

        Thread.sleep(1000);
        boolean checkbox = driver.findElement(By.xpath(Locators.checkboxCalculateProgress)).isSelected();
        boolean scroll = driver.findElement(By.xpath(Locators.scrollProgress)).isEnabled();
        System.out.println("Checkbox Calculate Progress: " + checkbox);
        System.out.println("Scroll Progress: " + scroll);
//        if (checkbox == true) {
//            driver.findElement(By.xpath(Locators.checkboxCalculateProgress)).click();
//            Thread.sleep(1000); //=> nên chèn thgian vào để chạy code tốt hơn
//            boolean scroll2 = driver.findElement(By.xpath(Locators.scrollProgress)).isEnabled();
//            System.out.println("Scroll Progress (when click checkbox one more time): " + scroll2);
//            => scroll2 đáng lẽ phải trả về false (?)
//        }

        Thread.sleep(1000);
        driver.findElement(By.xpath(Locators.dropdowmBillingType)).click();
        driver.findElement(By.xpath(Locators.itemTaskHours)).click();

        driver.findElement(By.xpath(Locators.dropdownStatus)).click();
        driver.findElement(By.xpath(Locators.itemInProgress)).click();

        Thread.sleep(1000);
        //driver.findElement(By.xpath(Locators.inputRatePerHour)).sendKeys("2"); trên Chrome kh có field này
        driver.findElement(By.xpath(Locators.inputEstimatedHours)).sendKeys("20");
        driver.findElement(By.xpath(Locators.dropdownMember)).click();
        driver.findElement(By.xpath(Locators.buttonSelectAll)).click();
        driver.findElement(By.xpath(Locators.dropdownMember)).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath(Locators.inputStartDate)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(Locators.item20251027)).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath(Locators.inputDealine)).sendKeys("31-10-2025");
        driver.findElement(By.xpath(Locators.inputDealine)).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath(Locators.inputTag)).sendKeys("VinhTuongYHL");
        driver.findElement(By.xpath(Locators.inputTag)).sendKeys(",");
        driver.findElement(By.xpath(Locators.inputTag)).sendKeys("ThachCao");

        Thread.sleep(2000);
        // Switch vào iframe Description
        driver.switchTo().frame("description_ifr");
        // Sau đó mới sendKeys được
        driver.findElement(By.id("tinymce")).sendKeys("Giá cả hợp lý, Chất liệu hợp thời");
        // Quay lại main page
        driver.switchTo().defaultContent();

        Thread.sleep(1000);
        boolean checkboxSendProject = driver.findElement(By.xpath(Locators.checkboxSendProjectCreateEmail)).isSelected();
        System.out.println("checkboxSendProject (before): " + checkboxSendProject);
        if (checkboxSendProject == false) {
            driver.findElement(By.xpath(Locators.checkboxSendProjectCreateEmail)).click();
            boolean checkboxSendProject2 = driver.findElement(By.xpath(Locators.checkboxSendProjectCreateEmail)).isSelected();
            System.out.println("checkboxSendProject (after): " + checkboxSendProject2);
        }

        driver.findElement(By.xpath(Locators.buttonSaveProject)).click();
        Thread.sleep(1000);

        System.out.println(driver.findElement(By.xpath(Locators.buttonProjectName)).getText());
        System.out.println(driver.findElement(By.xpath(Locators.tabOverview)).getText());
        System.out.println(driver.findElement(By.xpath(Locators.progressBarOfProject)).getText());
        System.out.println("---");

        Thread.sleep(1000);
        List<WebElement> overview = driver.findElements(By.xpath("//dl[contains(@class, 'tw-grid')]//div[contains(@class, 'project-overview-')]"));
        for(int i=0; i<overview.size(); i++){
            System.out.println(overview.get(i).getText());
            System.out.println("---");
        }

        Thread.sleep(1000);
        System.out.println(driver.findElement(By.xpath(Locators.progressBarOfOpenTask)).getText());
        System.out.println(driver.findElement(By.xpath(Locators.progressBarOfDateLeft)).getText());
        driver.findElement(By.xpath(Locators.dropdownMenuProjectLoggedTime)).click();
        driver.findElement(By.xpath(Locators.itemThisMonth)).click();

        Thread.sleep(1000);
        closeDriver();
    }
}
