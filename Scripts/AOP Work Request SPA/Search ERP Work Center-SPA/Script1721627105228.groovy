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

WebUI.click(findTestObject('Object Repository/Work Requests/Page_WEP  Home/a_SEARCH ERP'))

WebUI.click(findTestObject('Page_WEP  Work Requests/WCDropDown'))

WebUI.click(findTestObject('Object Repository/Work Requests/Page_WEP  Work Requests/Tumela Lower SM WC item'))

WebUI.click(findTestObject('Object Repository/Work Requests/Page_WEP  Work Requests/mostRecentRadio'))

WebUI.click(findTestObject('Object Repository/Work Requests/Page_WEP  Work Requests/Search Button'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Work Requests/Page_WEP  Work Requests/returnedWorkRequests'), 
    0)

WebUI.click(findTestObject('Page_WEP  Work Requests/Home Navigation'))

