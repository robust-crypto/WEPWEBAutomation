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

WebUI.click(findTestObject('Object Repository/Page_WEP  Home/a_VIEW_ALL'))

WebUI.click(findTestObject('Object Repository/Page_WEP  Work Requests/First Work Request Row'))

WebUI.click(findTestObject('Object Repository/Page_WEP  Work Requests/button_EDIT'))

WebUI.click(findTestObject('Object Repository/Page_WEP  Work Requests/div_Description'))

WebUI.setText(findTestObject('Object Repository/Page_WEP  Work Requests/uppercost4'), 
    'Automated My Submitted Editted WR')

WebUI.click(findTestObject('Object Repository/Page_WEP  Work Requests/div_Impact_multiselect__tags'))

WebUI.click(findTestObject('Object Repository/Page_WEP  Work Requests/span_High'))

WebUI.click(findTestObject('Object Repository/Page_WEP  Work Requests/div_Work Request Type_multiselect__tags'))

WebUI.click(findTestObject('Object Repository/Page_WEP  Work Requests/span_Production Request'))

WebUI.click(findTestObject('Object Repository/Page_WEP  Work Requests/WCDropDown'))

WebUI.click(findTestObject('Object Repository/Page_WEP  Work Requests/span_70010202.01.01.02 - TL 1SH Potable Wat_977e91'))

WebUI.setText(findTestObject('Object Repository/Page_WEP  Work Requests/input_Add to long description_addtolongdescription'), 
    'Automated Long Description ')

WebUI.click(findTestObject('Object Repository/Page_WEP  Work Requests/button_SAVE'))

WebUI.click(findTestObject('Object Repository/Page_WEP  Work Requests/Pending approval Tab'))

