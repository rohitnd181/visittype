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

WebUI.click(findTestObject('Daily Visit-events-off campus/a_event     Events'))

WebUI.click(findTestObject('Create Visit type/Visit Types option'))

WebUI.click(findTestObject('Create Visit type/button_Create Visit Type'))

WebUI.verifyElementPresent(findTestObject('Create Visit type/SELECT DAILY VISIT'), 0)

WebUI.verifyElementPresent(findTestObject('Create Visit type/EVENT SELECT'), 0)

WebUI.verifyElementPresent(findTestObject('Create Visit type/OFF_CAMPUS_SELECT'), 0)

WebUI.click(findTestObject('Create Visit type/SELECT DAILY VISIT'))

WebUI.click(findTestObject('Create Visit type/button_Get Started'))

WebUI.verifyElementPresent(findTestObject('Create Visit type/span_Visit Type Name'), 0)

Random x = new Random()

y = x.nextInt(1000)

def visit = 'visit' + y

WebUI.sendKeys(findTestObject('Create Visit type/input_ember2784'), visit)

WebUI.verifyElementPresent(findTestObject('Create Visit type/span_Name Available'), 0)

WebUI.verifyElementPresent(findTestObject('Create Visit type/span_Registrant Type'), 0)

WebUI.click(findTestObject('Create Visit type/label_Individuals'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Create Visit type/span_Registration Method'), 0)

WebUI.verifyElementPresent(findTestObject('Create Visit type/span_Registration Method'), 0)

WebUI.scrollToElement(findTestObject('Create Visit type/label_Request'), 0)

WebUI.click(findTestObject('Create Visit type/label_Request'))

WebUI.scrollToElement(findTestObject('Create Visit type/span_Check In Method'), 0)

WebUI.verifyElementPresent(findTestObject('Create Visit type/span_Check In Method'), 0)

WebUI.scrollToElement(findTestObject('Create Visit type/label_Automated Text Message'), 0)

WebUI.click(findTestObject('Create Visit type/label_Automated Text Message'))

WebUI.scrollToElement(findTestObject('Create Visit type/span_Ways to Meet'), 0)

WebUI.verifyElementPresent(findTestObject('Create Visit type/span_Ways to Meet'), 0)

WebUI.click(findTestObject('Create Visit type/label_In Person'))

WebUI.click(findTestObject('Create Visit type/Next button'))

WebUI.verifyElementPresent(findTestObject('Create Visit type/span_Photo                   i'), 0)

WebUI.click(findTestObject('Create Visit type/button_Add Later'))

WebUI.verifyElementPresent(findTestObject('Create Visit type/span_Description'), 0)

WebUI.sendKeys(findTestObject('Create Visit type/description while creating'), findTestData('Create Visit type').getValue(
        2, 7))

WebUI.scrollToElement(findTestObject('Create Visit type/span_Close Registration On'), 0)

WebUI.verifyElementPresent(findTestObject('Create Visit type/span_Close Registration On'), 0)

WebUI.click(findTestObject('Create Visit type/label_Close Day of Visit'))

WebUI.click(findTestObject('Create Visit type/a_Next'))

WebUI.verifyElementText(findTestObject('Create Visit type/check visit type name'), visit)

WebUI.verifyElementText(findTestObject('Create Visit type/check Registrent Type'), findTestData('Create Visit type').getValue(
        2, 2))

WebUI.verifyElementText(findTestObject('Create Visit type/Check Registration method', [('variable') : '']), findTestData(
        'Create Visit type').getValue(2, 3))

WebUI.verifyElementText(findTestObject('Create Visit type/Check Check in method'), findTestData('Create Visit type').getValue(
        2, 4))

WebUI.verifyElementText(findTestObject('Create Visit type/Check photo'), findTestData('Create Visit type').getValue(2, 6))

WebUI.verifyElementText(findTestObject('Create Visit type/Check Description'), findTestData('Create Visit type').getValue(
        2, 7))

WebUI.verifyElementText(findTestObject('Create Visit type/Check Close Registration'), findTestData('Create Visit type').getValue(
        2, 8))

WebUI.click(findTestObject('Create Visit type/a_Create'))

WebUI.waitForElementPresent(findTestObject('Create Visit type/Add later window'), 0)

WebUI.click(findTestObject('Create Visit type/Add Later after created'))

WebUI.verifyElementPresent(findTestObject('details for created visit type/Search visit types'), 0)

CustomKeywords.'visit_type.Visit_name.VisitName'(visit)

WebUI.click(findTestObject('details for created visit type/a_Details'))

WebUI.click(findTestObject('details for created visit type/Edit Visit Type Name'))

WebUI.clearText(findTestObject('details for created visit type/edit input field for visit type name'))

Random b = new Random()

a = b.nextInt(10000)

def edit_visit = 'edit_visit' + a

WebUI.sendKeys(findTestObject('details for created visit type/edit input field for visit type name'), edit_visit)

WebUI.click(findTestObject('details for created visit type/button_Save'))

WebUI.waitForElementPresent(findTestObject('details for created visit type/radio buttonAutomatically send an email'), 0)

WebUI.waitForElementPresent(findTestObject('details for created visit type/span_No automated communicatio'), 0)

WebUI.click(findTestObject('details for created visit type/span_No automated communicatio'))

WebUI.click(findTestObject('details for created visit type/button_Continue'))

WebUI.waitForElementPresent(findTestObject('details for created visit type/alert message'), 0)

WebUI.click(findTestObject('details for created visit type/text visit type'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('details for created visit type/Edit Registrant Type'))

WebUI.click(findTestObject('Create Visit type/label_Groups'))

WebUI.click(findTestObject('details for created visit type/button_Save'))

WebUI.waitForElementPresent(findTestObject('details for created visit type/alert message'), 0)

WebUI.click(findTestObject('details for created visit type/text visit type'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('details for created visit type/Edit Registration Method'))

WebUI.click(findTestObject('Create Visit type/b_Instant Book'))

WebUI.click(findTestObject('details for created visit type/button_Save'))

WebUI.waitForElementPresent(findTestObject('details for created visit type/alert message'), 0)

WebUI.click(findTestObject('details for created visit type/text visit type'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('details for created visit type/Edit Check In Method'))

WebUI.click(findTestObject('Create Visit type/label_Keyword Check In'))

WebUI.click(findTestObject('details for created visit type/button_Save'))

WebUI.waitForElementPresent(findTestObject('details for created visit type/alert message'), 0)

WebUI.click(findTestObject('details for created visit type/text visit type'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('details for created visit type/Edit Ways to Meet'), 0)

WebUI.click(findTestObject('details for created visit type/Edit Ways to Meet'))

WebUI.click(findTestObject('Create Visit type/label_Online'))

WebUI.sendKeys(findTestObject('details for created visit type/text for Online meet'), '123')

WebUI.click(findTestObject('details for created visit type/button_Save'))

WebUI.waitForElementPresent(findTestObject('details for created visit type/alert message'), 0)

WebUI.click(findTestObject('details for created visit type/text visit type'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('details for created visit type/Edit photo'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('details for created visit type/photo Add Now'))

WebUI.uploadFile(findTestObject('details for created visit type/UploadZoneForVisitTypePhoto'), 'C:\\Users\\abcd\\Katalon Studio\\Testing Read Only Account\\cute-cat-picture_1122-449.jpg')

WebUI.waitForElementVisible(findTestObject('details for created visit type/photo Apply'), 0)

WebUI.click(findTestObject('details for created visit type/photo Apply'))

WebUI.scrollToElement(findTestObject('details for created visit type/button_Save'), 0)

WebUI.click(findTestObject('details for created visit type/button_Save'))

WebUI.waitForElementPresent(findTestObject('details for created visit type/alert message'), 0)

WebUI.click(findTestObject('details for created visit type/alert message'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('details for created visit type/Edit button for description'), 0)

WebUI.click(findTestObject('details for created visit type/Edit button for description'))

WebUI.clearText(findTestObject('details for created visit type/Edit Description'))

WebUI.sendKeys(findTestObject('details for created visit type/Edit Description'), 'edited description')

WebUI.click(findTestObject('details for created visit type/button_Save'))

WebUI.waitForElementVisible(findTestObject('details for created visit type/radio buttonAutomatically send an email'), 0)

WebUI.click(findTestObject('details for created visit type/radio buttonAutomatically send an email'))

WebUI.click(findTestObject('details for created visit type/button_Continue'))

WebUI.waitForElementPresent(findTestObject('details for created visit type/alert message'), 0)

WebUI.click(findTestObject('details for created visit type/text visit type'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('details for created visit type/Edit Close Registration On'), 0)

WebUI.click(findTestObject('details for created visit type/Edit Close Registration On'))

WebUI.sendKeys(findTestObject('details for created visit type/days number before close registration'), '2')

WebUI.click(findTestObject('details for created visit type/button_Save'))

WebUI.waitForElementPresent(findTestObject('details for created visit type/alert message'), 0)

WebUI.click(findTestObject('details for created visit type/text visit type'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('details for created visit type/Compare visit type name'), edit_visit)

WebUI.verifyElementText(findTestObject('details for created visit type/Compare Registrant Type'), findTestData('Create Visit type').getValue(
        3, 2))

WebUI.verifyElementText(findTestObject('details for created visit type/Compare Registration Method'), findTestData('Create Visit type').getValue(
        3, 3))

WebUI.verifyElementText(findTestObject('details for created visit type/Compare Check In Method'), findTestData('Create Visit type').getValue(
        3, 4))

WebUI.verifyElementText(findTestObject('details for created visit type/Compare Ways to Meet'), findTestData('Create Visit type').getValue(
        3, 5))

WebUI.verifyElementPresent(findTestObject('details for created visit type/Compare photo'), 0)

WebUI.verifyElementText(findTestObject('details for created visit type/Compare Description'), findTestData('Create Visit type').getValue(
        3, 7))

WebUI.verifyElementText(findTestObject('details for created visit type/Compare Close Registration On'), findTestData('Create Visit type').getValue(
        3, 8))

WebUI.click(findTestObject('details for created visit type/button_Delete Visit Type'))

WebUI.waitForElementVisible(findTestObject('details for created visit type/FirstCheckboxInDeleteVisitTypeModal'), 0)

WebUI.click(findTestObject('details for created visit type/FirstCheckboxInDeleteVisitTypeModal'))

WebUI.click(findTestObject('details for created visit type/SecondCheckBoxInDeleteVisitTypeModal'))

WebUI.click(findTestObject('details for created visit type/ThierdCheckBoxInDeleteVisitTypeModal'))

WebUI.sendKeys(findTestObject('details for created visit type/VisitTypeNameTextBoxInDeleteVisitTypeModal'), edit_visit)

WebUI.click(findTestObject('details for created visit type/DeleteVisitTypeInDeleteVisitTypeModal'))

WebUI.waitForElementPresent(findTestObject('details for created visit type/alert message'), 0)

WebUI.click(findTestObject('details for created visit type/alert message'))

