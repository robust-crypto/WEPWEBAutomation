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
import org.openqa.selenium.By as By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import java.util.Date
import org.openqa.selenium.WebElement as WebElement1
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as WebElement
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import org.openqa.selenium.JavascriptExecutor

WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/ConfirmWorkBTN'))

Confirmationdata("12","Partial Confirmation","aa")

verifyConfirmation()
//verify confirmation posted




def ConfirmationNumber =WebUI.getText(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/lblNoConfirmationsfeedback'))


if (ConfirmationNumber > 0)
{
	WebUI.verifyElementPresent(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/imgPartialFeedback'),10)
	//WebUI.callTestCase(findTestCase('WorkCompletedConfirmation'), [:], FailureHandling.STOP_ON_FAILURE)
	WorkCompletedConfirmation()
}

public void WorkCompletedConfirmation()
{
	
	WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/linkAddconfirmationfromfeedbacktab'))
	
	Confirmationdata("24","Work will not be Completed Automation comments","Work Completed")
	verifyConfirmation()
	
	def ConfirmationNumber2 =WebUI.getText(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/lblNoConfirmationsfeedback'))
	
	
	if (ConfirmationNumber2 > 1)
	{
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/imgWorkCompletedFeedbackTab'),10)
		Signoff()
		//WebUI.callTestCase(findTestCase('WorkCompletedConfirmation'), [:], FailureHandling.STOP_ON_FAILURE)
		
	}
	
}
public void Signoff()
{
	
	
	WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/tabSignoff'))
	WebUI.setText(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/finalSignoffCommentsTXT'),"Sign off Automation")
	WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/toggleSignOffSignature'))
	
	WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/btnSignOff'))
	verifyConfirmation()
	
	
	def ConfirmationNumber3 =WebUI.getText(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/lblNoConfirmationsfeedback'))
	
	
	if (ConfirmationNumber3 > 3)
	{
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/imageSignOffFeedbackTab'),10)
		
	}
	
	
	
}
public void Confirmationdata( def number,def Comments, def type)
{

	WebUI.setText(findTestObject( 'Object Repository/Work Orders/Work Boards/ConfirmationScreen/ActualWork'),number )
	WebUI.setText(findTestObject( 'Object Repository/Work Orders/Work Boards/ConfirmationScreen/Comments'),Comments )
	WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/DigitalSignature'))
	
	
	
	if (type=="Work Completed")
	{
		
	WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/toggleWorkCompleted'))
	WebDriver driver =DriverFactory.getWebDriver()
//	WebElement1 ele = driver.findElement(By.xpath("//input[@id='checkFullyCompleted']"))
	//IJavaScriptExecutor js = (IJavaScriptExecutor)driver
   
   // js.ExecuteScript("document.getElementById('followOnWorkRequestID').click()");
   
//	IJavaScriptExecutor executor = (IJavaScriptExecutor)driver
	
	}
	else if (type=="Reshedule Remaining")
	{
		WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/toggleResheduleRemainingWork'))
	}
	else if(type=="Work will not be Completed")
	{
		WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/toggleWorkWillNotBeCompleted'))
	}
	WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/btnConfirm'))
	
	
}
public verifyConfirmation()
{
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/btnDone'), 10)
	WebUI.verifyElementPresent(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/lblConfirmedSuccessfully'), 10)
	WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/btnDone'))
	
	
	
	WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/tabFeedback'))
	WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/accordionConfirmation'))
}

