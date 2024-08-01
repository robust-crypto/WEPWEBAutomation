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

for (int i = 0; i < 3; i++) {
    WebUI.click(findTestObject('Page_WEP Home DeBeers/a_My Work Requests_btn btn-primary btn-icon_973753'))

    WebUI.click(findTestObject('Object Repository/Page_WEP Home DeBeers/button_NEXT'))

    WebUI.click(findTestObject('Page_WEP Home DeBeers/div_Maintenance Request (M1)  Maintenance Request'))

    WebUI.executeJavaScript('document.getElementById(\'followOnWorkRequestID\').click()', [])

    WebUI.click(GlobalVariable.WorkRequestTypes[i])

    if ((i == 0) || (i == 2)) {
        WebUI.click(findTestObject('Page_WEP Home DeBeers/button_NEXT_1' //malfunction request
                ))

        WebUI.click(GlobalVariable.WorkRequestTypes[i //LocalDateTime fDateTime = LocalDateTime.now().plusYears(5).plusMonths(1).plusDays(1);
            ])
    } else if (i == 1) {
        WebUI.click(findTestObject('Page_WEP Home DeBeers/button_NEXT_1'))

        WebDriver driver = DriverFactory.getWebDriver()

        def bb = driver.findElement(By.xpath('//input[@id=\'malfunctionStartDateTime\']'))

        bb.clear()

        LocalDateTime fDateTime = LocalDateTime.now().plusDays(15)

        DateTimeFormatter FutureDate_formatter = DateTimeFormatter.ofPattern('yyyy/MM/dd HH:mm a')

        def FutureDateTime = fDateTime.format(FutureDate_formatter).toString()

        WebUI.delay(5)

        bb.sendKeys(FutureDateTime)

        WebUI.delay(5)

        WebUI.click(findTestObject('Page_WEP Home DeBeers/i_Malfunction start date and time_fa fa-calendar cl'))

        WebUI.click(findTestObject('Page_WEP Home DeBeers/Page_WEP  Home/td_30'))

        WebUI.click(findTestObject('Object Repository/Page_WEP Home DeBeers/button_NEXT_1'))
    }
    
    WebUI.click(findTestObject('Object Repository/Page_WEP Home DeBeers/button_DRILL DOWN DRILL'))

    WebUI.click(findTestObject('Page_WEP Home DeBeers/img_CA-GK_mr-2 border-left pl-2'))

    WebUI.click(findTestObject('Page_WEP Home DeBeers/button_NEXT-test'))

    switch (i) {
        case 0:
            WebUI.executeJavaScript('document.getElementById(\'followOnWorkRequestID\').click()', [])

            WebUI.setText(findTestObject('Object Repository/Page_WEP Home DeBeers/textarea_Description_descriptionimage'), 
                'Maintenance DBRS fo Auto')

            break
        case 1:
            WebUI.setText(findTestObject('Object Repository/Page_WEP Home DeBeers/textarea_Description_descriptionimage'), 
                'Equipment Failure DBRS fo Auto ')

            break
        case 2:
            WebUI.setText(findTestObject('Object Repository/Page_WEP Home DeBeers/textarea_Description_descriptionimage'), 
                ' Activity Report DBRS fo Auto')

            break
    }
    
    WebUI.click(findTestObject('Object Repository/Page_WEP Home DeBeers/button_NEXT_1_2'))

    WebUI.click(findTestObject('Object Repository/Page_WEP Home DeBeers/button_NEXT_1'))

    WebUI.click(findTestObject('Object Repository/Page_WEP Home DeBeers/div_Medium  Medium'))

    // WebUI.click(findTestObject('Object Repository/Page_WEP Home DeBeers/i_Required date_fa fa-calendar'))
    //def aa = WebUI.findWebElement('Object Repository/WorkRequests/input_Required date_selectedRequiredDate')
    WebDriver driver = DriverFactory.getWebDriver()

    def aa = driver.findElement(By.xpath('//input[@id=\'selectedRequiredDate\']'))

    aa.clear()

    LocalDateTime fDateTime = LocalDateTime.now().plusDays(15)

    //LocalDateTime fDateTime = LocalDateTime.now().plusYears(5).plusMonths(1).plusDays(1);
    DateTimeFormatter FutureDate_formatter = DateTimeFormatter.ofPattern('d MMMM y')

    def FutureDateTime = fDateTime.format(FutureDate_formatter).toString()

    WebUI.delay(5)

    aa.sendKeys(FutureDateTime)

    WebUI.delay(5)

    //WebUI.click(findTestObject('Object Repository/Page_WEP Home DeBeers/td_27'))
    WebUI.click(findTestObject('Page_WEP Home DeBeers/button_NEXT_1'))

    //WebUI.click(findTestObject('Object Repository/Page_WEP Home DeBeers/button_ACKNOWLEDGE'))
    WebUI.click(findTestObject('Object Repository/Page_WEP Home DeBeers/button_SUBMIT'))

    WebUI.delay(20)

    WebUI.click(findTestObject('Object Repository/Page_WEP Home DeBeers/button_FINISH'))
}

