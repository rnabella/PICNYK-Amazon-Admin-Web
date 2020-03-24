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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://admin-stag-amazon.picnyk.com/')

WebUI.click(findTestObject('Access Existing Account/div_Access Existing Account'))

WebUI.sendKeys(findTestObject('Access Existing Account/input_Stay Signed In_email'), 'devanshi@gravitycentral.ca')

WebUI.sendKeys(findTestObject('Access Existing Account/input_Stay Signed In_password'), '1234')

WebUI.verifyElementVisible(findTestObject('Access Existing Account/div_Stay Signed In'))

WebUI.click(findTestObject('Access Existing Account/button_Sign-In'))

WebUI.verifyElementVisible(findTestObject('Timesheets/span_Enable Timesheet Changes_slider round'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Timesheets/span_Enable Timesheet Changes_slider round'))

WebUI.click(findTestObject('Timesheets/span_Enable Timesheet Changes_slider round'))

WebUI.closeBrowser()

