import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Login/login page/a_settings     Settings'))

WebUI.click(findTestObject('Add location/button_Add Location'))

WebUI.sendKeys(findTestObject('Add location/Name'), findTestData('login data/login data').getValue(2, 4))

WebUI.sendKeys(findTestObject('Add location/Address 1'), findTestData('login data/login data').getValue(2, 5))

WebUI.sendKeys(findTestObject('Add location/Address 2'), findTestData('login data/login data').getValue(2, 6))

WebUI.sendKeys(findTestObject('Add location/City'), findTestData('login data/login data').getValue(2, 7))

WebUI.click(findTestObject('Add location/state drop down'))

WebUI.click(findTestObject('Add location/state select option'))

WebUI.click(findTestObject('Add location/country-select-drop down'))

WebUI.click(findTestObject('Add location/country slect option'))

WebUI.sendKeys(findTestObject('Add location/Zipcode'), findTestData('login data/login data').getValue(2, 8))

WebUI.click(findTestObject('Add location/time zone drop down'))

WebUI.click(findTestObject('Add location/li_AmericaMonterrey'))

WebUI.click(findTestObject('Add location/button_Next'))

WebUI.sendKeys(findTestObject('Add location/meet instructions'), findTestData('login data/login data').getValue(2, 9))

WebUI.sendKeys(findTestObject('Add location/park instructions'), findTestData('login data/login data').getValue(2, 10))

WebUI.click(findTestObject('Add location/button_Create'))

