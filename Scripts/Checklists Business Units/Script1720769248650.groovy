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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://checklists-preprod.ea.angloamerican.com/')

WebUI.setText(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/inputCapture_Checklists_Username'), 
    'samupreprod')

WebUI.click(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo EA Identity  Identity/button_Next'))

WebUI.setEncryptedText(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo EA Identity  Identity/input_Checklists_Password'), 
    'iGDxf8hSRT4=')

WebUI.click(findTestObject('Page_Anglo EA Identity  Identity/button_Login'))

WebUI.verifyElementPresent(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/Checklist_Master Data_arrow'), 
    0)

WebUI.verifyElementClickable(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/Checklist_Master Data_arrow'))

WebUI.click(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/Checklist_Master Data_arrow'))

WebUI.verifyElementPresent(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/a_Business Units'), 
    0)

WebUI.verifyElementClickable(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/a_Business Units'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/a_Business Units'))

WebUI.verifyElementPresent(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/buSitePlus'), 0)

WebUI.verifyElementClickable(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/buSitePlus'))

WebUI.click(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/buSitePlus'))

WebUI.setText(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/input_Description_Description'), 
    'Automation IM 3')

WebUI.setText(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/input_Code_Code'), 'AIM 3')

WebUI.click(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/button_Save'))

WebUI.verifyElementPresent(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/div_Business Unit updated successfully'), 
    0)

WebUI.click(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/a_Back To List'))

WebUI.setText(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/BUsearch_Active_SearchValue'), 
    'Automation IM 3')

WebUI.click(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/button_Search'))

WebUI.click(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/Btn_EditBU'))

WebUI.click(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/label_Active'))

WebUI.click(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/button_Save'))

WebUI.verifyElementPresent(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/div_Business Unit updated successfully'), 
    0)

WebUI.click(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/a_Back To List'))

WebUI.click(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/span_Active'))

WebUI.click(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/Filter_i_Inactive'))

WebUI.click(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/button_Search'))

WebUI.click(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/button_Active_btn btn-danger btn-icon btn-sm btnRemove'))

WebUI.click(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/button_OK'))

WebUI.verifyElementPresent(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/div_Business Unit removed successfully'), 
    0)

WebUI.delay(5)

WebUI.closeBrowser()

