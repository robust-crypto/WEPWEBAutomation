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

WebUI.click(findTestObject('Object Repository/Page_WEP  Home/a_VIEW_ALL 86'))

WebUI.click(findTestObject('Object Repository/Page_WEP  Work Requests/td_10 Jun 2024 0826'))

WebUI.click(findTestObject('Object Repository/Page_WEP  Work Requests/button_REJECT'))

WebUI.setText(findTestObject('Object Repository/Page_WEP  Work Requests/textarea_Reason for Cancellation_cancellati_651940'), 
    'Rejection Test ')

WebUI.click(findTestObject('Object Repository/Page_WEP  Work Requests/button_SUBMIT'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_WEP  Work Requests/span_Successfully Rejected'), 'Successfully Rejected')

WebUI.click(findTestObject('Object Repository/Page_WEP  Work Requests/button_FINISH'))

WebUI.click(findTestObject('Object Repository/Page_WEP  Work Requests/a_Home'))

