import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/tabPRT'))

try
{
	

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/tabPRTDoc'), 20,FailureHandling.OPTIONAL))
{
		WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/tabChecklists'))
		
		
		
		WebDriver driver =DriverFactory.getWebDriver()
		WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/tabChecklists'))
		//TestObjects cklts =WebUI.findWebElements(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/OperationChecklists/lblAttchType'), 50)
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='px-0 d-flex flex-column border-bottom pb-3 bg-white']"))
		
	 
			for (WebElement1 item : elements) {
			
				WebElement1 type=item.findElement(By.xpath("//label[@class='expandable-label mb-1 attachment-type']"))
				
				
				
				if (type.getText() == "Work Instruction  " )
				{
					
					item.findElement(By.xpath("//div[@class='d-flex flex-column justify-content-start align-items-end px-0 flex-grow-1']//a[@class='aa-primary cursorPointer fontSize12 font-weight-bold mt-2']")).click()
					
					driver.findElement(By.xpath("//span[@aria-label='Close']")).click()
					WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/a_Details'))
					
					
					break
				}
				//else if  (type.getText() == "Work Execution Document (WED)  " )
				//{
					
					
					//item.findElement(By.xpath("//div[@class='d-flex flex-column justify-content-start align-items-end px-0 flex-grow-1']"))
					
				}
	
		
		
	
}
else if( WebUI.verifyElementNotPresent(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/tabPRTDoc'), 20,FailureHandling.OPTIONAL))
{
	WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/a_Details'))
}

}
catch(StepFailedException ex) {
	println(ex.message)
}
catch(StepFailedException ex)
{
	
}