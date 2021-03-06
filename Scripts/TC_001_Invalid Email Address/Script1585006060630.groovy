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

WebUI.sendKeys(findTestObject('Access Existing Account/input_Stay Signed In_email'), 'invalidemailaddress@@wrong.com')

WebUI.sendKeys(findTestObject('Access Existing Account/input_Stay Signed In_password'), 'demo01')

WebUI.verifyElementVisible(findTestObject('Access Existing Account/div_Stay Signed In'))

WebUI.click(findTestObject('Access Existing Account/button_Sign-In'))

WebUI.verifyElementPresent(findTestObject('Access Existing Account/div_Please enter valid email and password'), 0)

WebUI.closeBrowser()
