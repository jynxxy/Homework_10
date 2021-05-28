# Homework_10


1. Delayed alert https://seleniumui.moderntester.pl/alerts.php  
**Test steps:**  
Click on 'Delayed alert' button  
Wait for an alert to appear (using explicit wait)  
Click 'OK' button on alert  
Check that "OK button pressed" text has been shown  

2. Progressbar - https://seleniumui.moderntester.pl/progressbar.php  
Wait until the text in progress bar will be "Complete!" using explicit wait with method:
ExpectedConditions.textToBePresentInElement()
 
3. Iframes - https://seleniumui.moderntester.pl/iframes.php  
**Test steps:**  
Switch to the first iframe and fill form  
Switch to the second iframe and fill form  
Switch to the main frame and click on 'Basic' button in the main menu
