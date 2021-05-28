import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ProgressBarTests extends TestBase {

    @Test
    public void progressBarTest() {
        getDriver().get("https://seleniumui.moderntester.pl/progressbar.php");
        WebDriverWait wait = new WebDriverWait(getDriver(), 15);
        WebElement progressbar = getDriver().findElement(By.id("progressbar"));
        wait.until(ExpectedConditions.textToBePresentInElement(progressbar, "Complete!"));

        assertThat(progressbar.getText(), equalTo("Complete!"));
    }
}
