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

WebUI.click(findTestObject('Page_WEP  Work Requests/td'))

while (WebUI.verifyElementText(findTestObject('Object Repository/Page_WEP  Work Requests/b_Outstanding'), 'Outstanding') != 
true) {
    int i = 1

    WebUI.click(findTestObject('Object Repository/Page_WEP  Work Requests/img'))

    WebUI.click(findTestObject('Object Repository/Work Requests/td'), GlobalVariable.WRrow[i])

    i++
}

WebUI.click(findTestObject('Page_WEP  Work Requests/button_EDIT'))

WebUI.click(findTestObject('Object Repository/Page_WEP  Work Requests/div_Description'))

WebUI.setText(findTestObject('Page_WEP  Work Requests/input_Upper cost limit_mb-0 w-100 form-cont_8248c2'), 'Automated Pending Approval WR Editted ')

WebUI.click(findTestObject('Page_WEP  Work Requests/div_Impact_multiselect__tags'))

WebUI.click(findTestObject('Page_WEP  Work Requests/span_High'))

WebUI.click(findTestObject('Page_WEP  Work Requests/div_Work Request Type_multiselect__tags'))

WebUI.click(findTestObject('Object Repository/Page_WEP  Work Requests/span_Operations Request'))

WebUI.click(findTestObject('Page_WEP  Work Requests/div_Functional Location_multiselect__tags'))

WebUI.click(findTestObject('Object Repository/Page_WEP  Work Requests/span_70010202.01.02.03 - TL 1SH Compressed _5115a5'))

WebUI.click(findTestObject('Object Repository/Page_WEP  Work Requests/div_Breakdown No'))

WebUI.setText(findTestObject('Object Repository/Page_WEP  Work Requests/input_Add to long description_addtolongdescription'), 
    'Long Description to text ')

WebUI.click(findTestObject('Page_WEP  Work Requests/button_SAVE'))

WebUI.verifyElementText(findTestObject('Page_WEP  Work Requests/div_The item was saved successfully'), 'The item was saved successfully')

WebUI.click(findTestObject('Page_WEP  Work Requests/img'))

WebUI.click(findTestObject('Page_WEP  Work Requests/a_Home'))

