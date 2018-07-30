import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import org.junit.runner.JUnitCore
import org.junit.runner.Result

import com.kazurayam.ksbackyard.codesharing.test.DownloaderTest
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

/**
 * 
 * @author kazurayam
 *
 */

// force compile Keywords
WebUI.callTestCase(findTestCase('test/Prologue'), [:],
	FailureHandling.CONTINUE_ON_FAILURE)

// run DownloaderTest
Result result = JUnitCore.runClasses(DownloaderTest.class)

// print test result
WebUI.callTestCase(findTestCase('test/Epilogue'), ['result':result],
	FailureHandling.CONTINUE_ON_FAILURE)
