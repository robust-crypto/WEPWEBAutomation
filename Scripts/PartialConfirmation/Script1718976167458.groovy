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
import java.util.Date as Date
import com.kms.katalon.core.exception.StepFailedException 
import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import org.openqa.selenium.WebElement as WebElement1
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as WebElement
import java.time.LocalDateTime as LocalDateTime
import java.time.format.DateTimeFormatter as DateTimeFormatter
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor

StartWork()
//Start A ckl 



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

///Save a Checklist






WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/ConfirmWorkBTN'))
Confirmationdata('12', 'Partial Confirmation Comments Automation', 'Partial Confirmation')//Partial 

//verify confirmation posted
verifyConfirmation()

def ConfirmationNumber = WebUI.getText(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/lblNoConfirmationsfeedback'))
WebUI.verifyEqual(ConfirmationNumber, 1)

    WebUI.verifyElementPresent(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/imgPartialFeedback'), 
        10)

    //WebUI.callTestCase(findTestCase('WorkCompletedConfirmation'), [:], FailureHandling.STOP_ON_FAILURE)
    WorkCompletedConfirmation()
//WebUI.callTestCase(findTestCase('WorkCompletedConfirmation'), [:], FailureHandling.STOP_ON_FAILURE)
//WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/CloseWOPop-up'))




void WorkCompletedConfirmation() {
    WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/linkAddconfirmationfromfeedbacktab'))

    Confirmationdata('24', 'Work will not be Completed Automation comments', 'Work will not be Completed')
	RaiseFollowONwrAOP()
    verifyConfirmation()

    def ConfirmationNumber2 = WebUI.getText(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/lblNoConfirmationsfeedback'))

	
	WebUI.verifyEqual(ConfirmationNumber2, 2)
	
           WebUI.verifyElementPresent(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/imgWorkCompletedFeedbackTab'), 
            10)
		   

        Signoff()
    
}

void Signoff() {
    WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/tabSignoff'))

    WebUI.setText(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/finalSignoffCommentsTXT'), 
        'Sign off Automation')

    WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/toggleSignOffSignature'))

    WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/btnSignOff'))

    verifyConfirmation()

    def ConfirmationNumber3 = WebUI.getText(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/lblNoConfirmationsfeedback'))
	WebUI.verifyEqual(ConfirmationNumber3, 3)

        WebUI.verifyElementPresent(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/imageSignOffFeedbackTab'), 
            10)
		verifyFollowOn()
		WebUI.click(findTestObject('Object Repository/ConfirmationScreen/CloseWOPop-up'))
}

void Confirmationdata(def number, def Comments, def type) {
    WebDriver driver = DriverFactory.getWebDriver()

    if (type == 'Work Completed') {
		
		
        WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/toggleWorkCompleted'))
		
		//WebUI.executeJavaScript('arguments[0].click();',checkFullyCompleted [])
    } else if (type == 'Reshedule Remaining') {
        WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/toggleResheduleRemainingWork'))
    } else if (type == 'Work will not be Completed') {
        WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/toggleWorkWillNotBeCompleted'))
		SetStartDate(2)
        SetEndDate(1)

    } else if (type == 'Partial Confirmation') {
		SetStartDate(3)
		SetEndDate(3)
		
       
    }
    
    WebUI.setText(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/ActualWork'), number)

    WebUI.setText(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/Comments'), Comments)

    WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/DigitalSignature'))

    WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/btnConfirm'))
}
public void SetEndDate(def s) {
	
	WebUI.clearText(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/WorkEndDate'))
	WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/WorkEndDate'))
	LocalDateTime fDateTime = LocalDateTime.now().minusDays(s)
	
		DateTimeFormatter Date_formatter = DateTimeFormatter.ofPattern('yyyy-MM-dd')
	
		def Enddate = fDateTime.format(Date_formatter).toString()
	
		WebUI.clearText(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/WorkEndDate'))
	WebUI.setText(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/WorkEndDate'), Enddate)
	
}

public void SetStartDate(def days) {
    LocalDateTime fDateTime = LocalDateTime.now().minusDays(days)

    DateTimeFormatter Date_formatter = DateTimeFormatter.ofPattern('yyyy-MM-dd')

    def PastDate = fDateTime.format(Date_formatter).toString()

   

   // def aa = driver.findElement(By.xpath(Locator))
	WebUI.clearText(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/WorkStartDate'))
	WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/WorkStartDate'))
		
      

        WebUI.setText(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/WorkStartDate'), PastDate)
    
}

def verifyConfirmation() {
   WebUI.verifyElementPresent(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/btnDone'), 10)

   WebUI.verifyElementPresent(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/lblConfirmedSuccessfully'), 
        10)

  WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/btnDone'))
	
	
    WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/tabFeedback'))

    WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/accordionConfirmation'))
}

void StartWork() {
    WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/OperationElements/StartWorkButton'))

    WebUI.verifyElementPresent(findTestObject('Object Repository/Work Orders/Work Boards/OperationElements/ContinueToStartWork'), 
        2)

    WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/OperationElements/StartWorkYes'))


}

void RaiseFollowONwrAOP ()
{
	

	WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/btnFollowON'))
	WebUI.setText(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/FollowonWR/WRDescription'),"Description M2 Follow on Automation")
	WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/FollowonWR/radioHighImpact'))
	WebUI.setText(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/FollowonWR/txtDetailedDescription'),"M2 Follow on Automation")
	WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/FollowonWR/SelectWRTypes'))
	WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/FollowonWR/WRTypeM2'))
	//WebUI.selectOptionByLabel(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/FollowonWR/SelectWRTypes'), "M2 - Malfunction",false)
	WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/FollowonWR/btnSubmitFollowOn'))
	WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/FollowonWR/btnAcknowledge'))
	//
	//verifyFollowOn()
}



 void verifyFollowOn()
{
	
	//WebUI.verifyElementPresent(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/btnDone'), 50)
	
		//WebUI.verifyElementPresent(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/FollowonWR/successfullyRaisedFollowoN'),
			//10)
		
		//WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/btnDone'))
		
		
	
		//WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/tabFeedback'))
	
		WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/accordianWRs'))
		//findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/FollowonWR/WrNumberFeedbackTab')
		
		def NumberOfWRsRaised = WebUI.getText(findTestObject('Object Repository/Work Orders/Work Boards/ConfirmationScreen/FollowonWR/WrNumberFeedbackTab'))
		
		WebUI.verifyEqual(NumberOfWRsRaised, 1)
		
		
	
}

