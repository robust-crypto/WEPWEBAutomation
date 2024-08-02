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

WebUI.click(findTestObject('Object Repository/Page_WEP  Home/Pending Approval View ALL'))

WebUI.click(findTestObject('Object Repository/Page_WEP  Work Requests/First Work Request Row'))

WebUI.click(findTestObject('Object Repository/Page_WEP  Work Requests/button_APPROVE'))

WebUI.setText(findTestObject('Object Repository/Page_WEP  Work Requests/input_Upper cost limit_uppercost (1)'), '10000')

WebUI.setText(findTestObject('Object Repository/Page_WEP  Work Requests/textarea_Comments_comments (1)'), 'Automated Approval Test')

WebUI.click(findTestObject('Work Requests/Page_WEP  Work Requests/SUBMIT Button'))

WebUI.click(findTestObject('Work Requests/Page_WEP  Work Requests/Page_WEP  Work Requests/FINISH'))

WebUI.click(findTestObject('Object Repository/Page_WEP  Work Requests/Home Navigation'))

