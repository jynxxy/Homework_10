import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class DelayedAlertTests extends TestBase {

    @Test
    public void delayedAlertTest() {
        getDriver().get("https://seleniumui.moderntester.pl/alerts.php");

        getDriver().findElement(By.id("delayed-alert")).click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 15);
        wait.until(ExpectedConditions.alertIsPresent());
        getDriver().switchTo().alert().accept();

        assertThat(getDriver().findElement(By.id("delayed-alert-label")).getText(), equalTo("OK button pressed"));
    }
}
