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
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as WebElement
import org.openqa.selenium.By as By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import java.util.Date
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
for (int i = 0; i < 4; i++) {
    WebUI.click(findTestObject('Object Repository/Page_WEP  Home/a_My Work Requests_btn btn-primary btn-icon_973753'))

    WebUI.click(findTestObject('Object Repository/Page_WEP  Home/button_NEXT'))

    WebUI.click(GlobalVariable.WRtypes[i])

    if (i == 0) {
        WebUI.click(findTestObject('Page_WEP  Home/button_NEXT_1' //malfunction request
                ))

        WebUI.click(GlobalVariable.WRtypes[i])
    } else if (i == 1) {
        WebUI.click(findTestObject('Page_WEP  Home/button_NEXT_1'))

        WebUI.click(findTestObject('Page_WEP  Home/i_Malfunction start date and time_fa fa-calendar'))

        WebUI.click(findTestObject('Page_WEP  Home/Page_WEP  Home/td_30'))

        WebUI.click(findTestObject('Object Repository/Page_WEP  Home/button_NEXT_1'))
    }
    
    WebUI.click(findTestObject('Object Repository/Page_WEP  Home/button_DRILL DOWN DRILL'))

    WebUI.click(findTestObject('Object Repository/Page_WEP  Home/img_Tumela Lower 1 Shaft UG_mr-2 border-left pl-2'))

    WebUI.click(findTestObject('Object Repository/Page_WEP  Home/button_NEXT_1'))

	switch(i) {
		case 0:
		WebUI.setText(findTestObject('Object Repository/Page_WEP  Home/textarea_Description_descriptionimage'), 'Maintenance Request')
		break;
		case 1:
		WebUI.setText(findTestObject('Object Repository/Page_WEP  Home/textarea_Description_descriptionimage'), 'Malfunction ')
		break;
		case 2:
		WebUI.setText(findTestObject('Object Repository/Page_WEP  Home/textarea_Description_descriptionimage'), 'Operation Request')
		break;
		case 3:
		WebUI.setText(findTestObject('Object Repository/Page_WEP  Home/textarea_Description_descriptionimage'), 'Production Request')
		break;
	}
    

    WebUI.click(findTestObject('Object Repository/Page_WEP  Home/button_NEXT_1_2'))

    WebUI.click(findTestObject('Object Repository/Page_WEP  Home/button_NEXT_1'))

    WebUI.click(findTestObject('Object Repository/Page_WEP  Home/div_Medium  Medium'))

   // WebUI.click(findTestObject('Object Repository/Page_WEP  Home/i_Required date_fa fa-calendar'))
	//def aa = WebUI.findWebElement('Object Repository/WorkRequests/input_Required date_selectedRequiredDate')
	WebDriver driver =DriverFactory.getWebDriver()
	 
	def aa= driver.findElement(By.xpath("//input[@id='selectedRequiredDate']"))
	
   aa.clear()
   LocalDateTime fDateTime = LocalDateTime.now().plusDays(15);
   //LocalDateTime fDateTime = LocalDateTime.now().plusYears(5).plusMonths(1).plusDays(1);
   DateTimeFormatter FutureDate_formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy")
   def FutureDateTime = fDateTime.format(FutureDate_formatter).toString()
	
   aa.sendKeys(FutureDateTime)
   
    //WebUI.click(findTestObject('Object Repository/Page_WEP  Home/td_27'))

    WebUI.click(findTestObject('Page_WEP  Home/button_NEXT_1'))

	
   
   
    //WebUI.click(findTestObject('Object Repository/Page_WEP  Home/button_ACKNOWLEDGE'))

    WebUI.click(findTestObject('Object Repository/Page_WEP  Home/button_SUBMIT'))

    WebUI.delay(20)

    WebUI.click(findTestObject('Object Repository/Page_WEP  Home/button_FINISH'))
}

