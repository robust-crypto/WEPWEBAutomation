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

WebUI.navigateToUrl('https://identity-preprod.ea.angloamerican.com/Account/Login?AppCode=Checklist-PreProd&ReturnUrl=https://checklists-preprod.ea.angloamerican.com/Account/LoginRedirect')

WebUI.setText(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/inputCapture_Checklists_Username'), 
    'samupreprod')

WebUI.click(findTestObject('Page_Anglo EA Identity  Identity/button_Next'))

WebUI.setEncryptedText(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo EA Identity  Identity/input_Checklists_Password'), 
    'iGDxf8hSRT4=')

WebUI.click(findTestObject('Page_Anglo EA Identity  Identity/button_Login'))

WebUI.click(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/Checklist_Master Data_arrow'))

WebUI.click(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/a_Business Units Sites'))

WebUI.click(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/Btn_AddSite'))

WebUI.setText(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/input_Description_Description'), 
    'Automation BU 1')

WebUI.setText(findTestObject('Object Repository/Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/input_Code_SiteCode'), 
    'ABU 1')

WebUI.click(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/b'))

WebUI.click(findTestObject('Object Repository/Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/li_Automation IM'))

WebUI.click(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/div_Language culture                                            Spanish - ChileEnglish - South AfricaPortuguese - BrazilSpanish - Chile'))

WebUI.click(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/span_English - South Africa'))

WebUI.click(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/li_English - South Africa (1)'))

WebUI.click(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/button_Save_Site'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/div_Business Unit Site updated successfully'), 
    0)

WebUI.click(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/a_Back To List_Sites'))

WebUI.setText(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/BUsearch_Active_SearchValue'), 
    'Automation BU 1')

WebUI.click(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/button_Search'))

WebUI.click(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/Btn_EditBU'))

WebUI.click(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/input_Site_IsActive'))

WebUI.click(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/button_Save'))

WebUI.verifyElementPresent(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/div_Business Unit Site updated successfully'), 
    0)

WebUI.click(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/a_Back To List_Sites'))

WebUI.click(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/span_Active'))

WebUI.click(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/Filter_i_Inactive'))

WebUI.setText(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/BUsearch_Active_SearchValue'), 
    'Automation BU 1')

WebUI.click(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/button_Search'))

WebUI.click(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/button_Active_btn btn-danger btn-icon btn-sm btnRemove'))

WebUI.click(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/button_OK'))

WebUI.verifyElementPresent(findTestObject('Page_Anglo ChecklistPreprod/Page_Anglo Checklists  Checklist/div_Business Unit Site removed successfully'), 
    0)

WebUI.delay(5)

WebUI.closeBrowser()

