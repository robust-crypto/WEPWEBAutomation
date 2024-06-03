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

WebUI.click(findTestObject('Object Repository/Page_WEP  Home/a_VIEW_ALL'))

WebUI.click(findTestObject('Object Repository/Page_WEP  Work Requests/td'))

WebUI.click(findTestObject('Object Repository/Page_WEP  Work Requests/button_Notification_close aa-primary'))

WebUI.click(findTestObject('Object Repository/Page_WEP  Work Requests/td_1'))

WebUI.click(findTestObject('Object Repository/Page_WEP  Work Requests/button_EDIT'))

WebUI.click(findTestObject('Object Repository/Page_WEP  Work Requests/div_EDIT_am-component-loader'))

WebUI.setText(findTestObject('Object Repository/Page_WEP  Work Requests/input_Description_w-100 form-control round _01bf87'), 
    'Editted Work Request')

WebUI.click(findTestObject('Object Repository/Page_WEP  Work Requests/div_EDIT_am-component-loader'))

WebUI.click(findTestObject('Object Repository/Page_WEP  Work Requests/span_High'))

WebUI.click(findTestObject('Object Repository/Page_WEP  Work Requests/div_EDIT_am-component-loader'))

WebUI.click(findTestObject('Object Repository/Page_WEP  Work Requests/span_Operations Request'))

WebUI.click(findTestObject('Object Repository/Page_WEP  Work Requests/div_EDIT_am-component-loader'))

WebUI.click(findTestObject('Object Repository/Page_WEP  Work Requests/span_AA - SENIOR ASSET MANAGER'))

WebUI.click(findTestObject('Object Repository/Page_WEP  Work Requests/button_SAVE'))

WebUI.delay(10)

WebUI.verifyElementText(findTestObject('Object Repository/Page_WEP  Work Requests/div_The item was saved successfully'), 
    'The item was saved successfully')

WebUI.setText(findTestObject('Object Repository/Page_WEP  Work Requests/workRequestObject'), wrNumber)

WebUI.click(findTestObject('Object Repository/Page_WEP  Work Requests/xBTN'))

WebUI.closeBrowser()

