import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class IframeTests extends TestBase {

    String url;
    String firstName;
    String lastName;
    String login;
    String password;
    String continent;

    @Test
    public void iframesTest() {
        url = "https://seleniumui.moderntester.pl/iframes.php";
        firstName = "Jan";
        lastName = "Kowalski";
        login = "jankowalski";
        password = "Test123";
        continent = "europe";

        getDriver().get(url);

        getDriver().switchTo().frame("iframe1");
        getDriver().findElement(By.id("inputFirstName3")).sendKeys(firstName);
        getDriver().findElement(By.id("inputSurname3")).sendKeys(lastName);

        getDriver().switchTo().defaultContent();

        getDriver().switchTo().frame("iframe2");
        getDriver().findElement(By.id("inputLogin")).sendKeys(login);
        getDriver().findElement(By.id("inputPassword")).sendKeys(password);
        Select continents = new Select(getDriver().findElement(By.id("inlineFormCustomSelectPref")));
        continents.selectByValue(continent);
        List<WebElement> experience = getDriver().findElements(By.xpath("//*[@name='gridRadios']"));
        int index = new Random().nextInt(experience.size());
        experience.get(index).click();
        getDriver().findElement(By.cssSelector(".btn-primary")).click();

        getDriver().switchTo().defaultContent();

        getDriver().findElement(By.xpath("//a[contains(text(),'Basic')]")).click();
    }
}
