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

WebUI.verifyElementPresent(findTestObject('Daily Visit-events-off campus/a_event_note     Daily Visits'), 0)

WebUI.click(findTestObject('Daily Visit-events-off campus/a_event_note     Daily Visits'))

WebUI.verifyElementPresent(findTestObject('Daily Visit-events-off campus/button_Create Daily Visit'), 0)

WebUI.click(findTestObject('Daily Visit-events-off campus/button_Create Daily Visit'))

WebUI.verifyElementText(findTestObject('Daily Visit-events-off campus/create daily visiteventoff campus text/h2_Create Daily Visit'), 
    'Create Daily Visit')

WebUI.verifyElementPresent(findTestObject('Daily Visit-events-off campus/a_event     Events'), 0)

WebUI.click(findTestObject('Daily Visit-events-off campus/a_event     Events'))

WebUI.verifyElementPresent(findTestObject('Daily Visit-events-off campus/button_Create Event'), 0)

WebUI.click(findTestObject('Daily Visit-events-off campus/button_Create Event'))

WebUI.verifyElementText(findTestObject('Daily Visit-events-off campus/create daily visiteventoff campus text/h2_Create an Event'), 
    'Create an Event')

WebUI.verifyElementPresent(findTestObject('Daily Visit-events-off campus/a_location_on     Off Campus'), 0)

WebUI.click(findTestObject('Daily Visit-events-off campus/a_location_on     Off Campus'))

WebUI.verifyElementPresent(findTestObject('Daily Visit-events-off campus/button_Create Off Campus'), 0)

WebUI.click(findTestObject('Daily Visit-events-off campus/button_Create Off Campus'))

WebUI.verifyElementText(findTestObject('Daily Visit-events-off campus/create daily visiteventoff campus text/h2_Create Off Campus Visit'), 
    'Create Off Campus Visit')

