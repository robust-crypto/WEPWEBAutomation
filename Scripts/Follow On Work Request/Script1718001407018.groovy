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
import java.util.Date as Date
import java.time.LocalDateTime as LocalDateTime
import java.time.format.DateTimeFormatter as DateTimeFormatter

WebDriver driver = DriverFactory.getWebDriver()

for (int i = 0; i < 2; i++) {
    WebUI.click(findTestObject('Work Requests/a_My Work Requests_btn btn-primary btn-icon_973753'))

    WebUI.click(findTestObject('Work Requests/button_NEXT'))

	WebUI.click(GlobalVariable.followOnWRtypes[0])

    if (i == 0) {
        WebUI.executeJavaScript('document.getElementById(\'followOnWorkRequestID\').click()', [], FailureHandling.STOP_ON_FAILURE)

        WebUI.click(findTestObject('Object Repository/Page_WEP  Home/input_Related Work Order Number_form-contro_6630d0'))

        WebUI.setText(findTestObject('Work Requests/Page_WEP  Home/input_Related Work Order Number_form-control search rounded-0 w-50'), 
            '4009738230')

        WebUI.delay(10)

        WebUI.click(findTestObject('Work Requests/button_NEXT_1'))

        WebUI.click(GlobalVariable.followOnWRtypes[i])
    } else if (i == 1) {
        WebUI.executeJavaScript('document.getElementById(\'followOnWorkRequestID\').click()', [], FailureHandling.STOP_ON_FAILURE)

        WebUI.click(findTestObject('Object Repository/Page_WEP  Home/input_Related Work Order Number_form-contro_6630d0'))

        WebUI.setText(findTestObject('Work Requests/Page_WEP  Home/input_Related Work Order Number_form-control search rounded-0 w-50'), 
            '4009738230')

        WebUI.delay(10)

        WebUI.click(findTestObject('Work Requests/button_NEXT_1'))

        def aa = driver.findElement(By.xpath('//input[@id=\'malfunctionStartDateTime\']'))

        aa.clear()

        LocalDateTime mDateTime = LocalDateTime.now().minusDays(2)

        DateTimeFormatter mFutureDate_formatter = DateTimeFormatter.ofPattern('yyyy/MM/dd HH:mm a')

        def mFutureDateTime = mDateTime.format(mFutureDate_formatter).toString()

        aa.sendKeys(mFutureDateTime)

        WebUI.delay(10)

        WebUI.click(findTestObject('Work Requests/button_NEXT_1'))
    }
    
    WebUI.click(findTestObject('Work Requests/button_DRILL DOWN DRILL'))

    WebUI.click(findTestObject('Work Requests/img_Tumela Lower 1 Shaft UG_mr-2 border-left pl-2'))

    WebUI.click(findTestObject('Work Requests/button_NEXT_1'))

    switch (i) {
        case 0:
            WebUI.setText(findTestObject('Work Requests//textarea_Description_descriptionimage'), 'Automated Maintenance Request Follow On')

            break
        case 1:
            WebUI.setText(findTestObject('Work Requests//textarea_Description_descriptionimage'), 'Automated Malfunction Request Follow On')

            break
    }
    
    WebUI.click(findTestObject('Work Requests/button_NEXT_1_2'))

    WebUI.click(findTestObject('Work Requests/button_NEXT_1'))

    WebUI.click(findTestObject('Work Requests/div_Medium  Medium'))

    def bb = driver.findElement(By.xpath('//input[@id=\'selectedRequiredDate\']'))

    bb.clear()

    WebUI.delay(3)

    LocalDateTime fDateTime = LocalDateTime.now().plusDays(15)

    //LocalDateTime fDateTime = LocalDateTime.now().plusYears(5).plusMonths(1).plusDays(1);
    DateTimeFormatter fFutureDate_formatter = DateTimeFormatter.ofPattern('d MMMM y')

    def fFutureDateTime = fDateTime.format(fFutureDate_formatter).toString()

    bb.sendKeys(fFutureDateTime)

    WebUI.delay(3)

    WebUI.click(findTestObject('Work Requests/button_NEXT_1'))

    WebUI.click(findTestObject('Work Requests/button_SUBMIT'))

    WebUI.delay(20)

    WebUI.click(findTestObject('Work Requests/button_FINISH'))
}

