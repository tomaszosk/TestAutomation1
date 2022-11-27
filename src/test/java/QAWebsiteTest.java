import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class QAWebsiteTest extends Setup {

    @Test
    public void testOne() {
        // znajdz przycisk idExample
        WebElement buttonUsingId = driver.findElement(By.id("idExample"));

        // nacisnij przycisk idExample
        buttonUsingId.click();

        WebElement textSuccess = driver.findElement(By.className("entry-title"));

        Assertions.assertTrue(textSuccess.isDisplayed());
        Assertions.assertEquals("Button success", textSuccess.getText());
    }


    @Test
    public void testTwo() throws InterruptedException {
        WebElement nameTextField = driver.findElement(By.id("et_pb_contact_name_0"));
        nameTextField.sendKeys("TestName");

        WebElement emailTextField = driver.findElement(By.id("et_pb_contact_email_0"));
        emailTextField.sendKeys("test@automation.com");
        Thread.sleep(5000);

        WebElement buttonEmailMe = driver.findElement(By.name("et_builder_submit_button"));
        buttonEmailMe.click();

        Thread.sleep(5000);
        WebElement thanksText = driver.findElement(By.xpath("//*[@id='et_pb_contact_form_0']//p"));
        Assertions.assertEquals("Thanks for contacting us", thanksText.getText());
    }
}
