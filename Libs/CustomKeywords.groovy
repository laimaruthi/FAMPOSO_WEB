
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import java.util.List

import java.util.HashMap

import java.util.ArrayList

import com.kms.katalon.core.model.FailureHandling

import java.lang.Object

import org.openqa.selenium.By

import com.kms.katalon.core.testobject.TestObject

import org.apache.poi.ss.usermodel.Workbook

import org.apache.poi.ss.usermodel.Sheet

import org.apache.poi.ss.usermodel.Cell

import org.apache.poi.ss.usermodel.Row

import java.util.Map

import org.openqa.selenium.WebElement


def static "mfa.readMFA.GetMFAToken"(
    	String secret	) {
    (new mfa.readMFA()).GetMFAToken(
        	secret)
}

def static "com.kms.katalon.keyword.testsuite.RerunKeyword.createFile"(
    	String fullPathWithoutExtension	
     , 	String template	
     , 	String extension	) {
    (new com.kms.katalon.keyword.testsuite.RerunKeyword()).createFile(
        	fullPathWithoutExtension
         , 	template
         , 	extension)
}

def static "com.kms.katalon.keyword.testsuite.RerunKeyword.removeTCPassedAndReplaceFailedRows"(
    	String oldTSTemplate	
     , 	java.util.List<String> listFailTestCases	
     , 	java.util.HashMap<String, java.util.List<java.lang.Integer>> listFailedRowsBelongToTC	) {
    (new com.kms.katalon.keyword.testsuite.RerunKeyword()).removeTCPassedAndReplaceFailedRows(
        	oldTSTemplate
         , 	listFailTestCases
         , 	listFailedRowsBelongToTC)
}

def static "com.kms.katalon.keyword.testsuite.RerunKeyword.deleteTestSuite"(
    	String testSuiteName	) {
    (new com.kms.katalon.keyword.testsuite.RerunKeyword()).deleteTestSuite(
        	testSuiteName)
}

def static "com.kms.katalon.keyword.testsuite.RerunKeyword.getExecutedBrowser"() {
    (new com.kms.katalon.keyword.testsuite.RerunKeyword()).getExecutedBrowser()
}

def static "com.kms.katalon.keyword.testsuite.RerunKeyword.getProjectFileName"() {
    (new com.kms.katalon.keyword.testsuite.RerunKeyword()).getProjectFileName()
}

def static "com.kms.katalon.keyword.testsuite.RerunKeyword.replaceTSTemplateWithListNewTC"(
    	String oldTSTemplate	
     , 	String newTCList	) {
    (new com.kms.katalon.keyword.testsuite.RerunKeyword()).replaceTSTemplateWithListNewTC(
        	oldTSTemplate
         , 	newTCList)
}

def static "com.kms.katalon.keyword.testsuite.RerunKeyword.createConsoleModeFile"(
    	String relativeTestSuitePath	) {
    (new com.kms.katalon.keyword.testsuite.RerunKeyword()).createConsoleModeFile(
        	relativeTestSuitePath)
}

def static "com.kms.katalon.keyword.testsuite.RerunKeyword.getListExecutedRows"(
    	String testCaseId	
     , 	String iterationType	
     , 	String iterationValue	
     , 	int dataTotalRows	) {
    (new com.kms.katalon.keyword.testsuite.RerunKeyword()).getListExecutedRows(
        	testCaseId
         , 	iterationType
         , 	iterationValue
         , 	dataTotalRows)
}

def static "com.kms.katalon.keyword.testsuite.RerunKeyword.isStringBelongToList"(
    	String text	
     , 	java.util.ArrayList<String> list	) {
    (new com.kms.katalon.keyword.testsuite.RerunKeyword()).isStringBelongToList(
        	text
         , 	list)
}

def static "com.kms.katalon.keyword.testsuite.RerunKeyword.createNameForNewSuite"(
    	String oldTestSuitePath	) {
    (new com.kms.katalon.keyword.testsuite.RerunKeyword()).createNameForNewSuite(
        	oldTestSuitePath)
}

def static "com.kms.katalon.keyword.testsuite.RerunKeyword.replaceFailedRowsForBindingData"(
    	java.util.HashMap<String, java.util.List<java.lang.Integer>> listFailedRowsBelongToTC	
     , 	String testCaseTemp	) {
    (new com.kms.katalon.keyword.testsuite.RerunKeyword()).replaceFailedRowsForBindingData(
        	listFailedRowsBelongToTC
         , 	testCaseTemp)
}

def static "kms.turing.katalon.plugins.assertj.DateTimeAssert.equals"(
    	String verifiedDate	
     , 	String compare2Date	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.DateTimeAssert()).equals(
        	verifiedDate
         , 	compare2Date
         , 	description)
}

def static "kms.turing.katalon.plugins.assertj.DateTimeAssert.equals"(
    	String verifiedDate	
     , 	String compare2Date	
     , 	String format	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.DateTimeAssert()).equals(
        	verifiedDate
         , 	compare2Date
         , 	format
         , 	description)
}

def static "kms.turing.katalon.plugins.assertj.DateTimeAssert.equals"(
    	String verifiedDate	
     , 	String compare2Date	
     , 	String format	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.DateTimeAssert()).equals(
        	verifiedDate
         , 	compare2Date
         , 	format
         , 	description
         , 	flowControl)
}

def static "kms.turing.katalon.plugins.assertj.DateTimeAssert.isAfter"(
    	String verifiedDate	
     , 	String compare2Date	
     , 	String format	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.DateTimeAssert()).isAfter(
        	verifiedDate
         , 	compare2Date
         , 	format
         , 	description)
}

def static "kms.turing.katalon.plugins.assertj.DateTimeAssert.isAfter"(
    	String verifiedDate	
     , 	String compare2Date	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.DateTimeAssert()).isAfter(
        	verifiedDate
         , 	compare2Date
         , 	description)
}

def static "kms.turing.katalon.plugins.assertj.DateTimeAssert.isAfter"(
    	String verifiedDate	
     , 	String compare2Date	
     , 	String format	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.DateTimeAssert()).isAfter(
        	verifiedDate
         , 	compare2Date
         , 	format
         , 	description
         , 	flowControl)
}

def static "kms.turing.katalon.plugins.assertj.DateTimeAssert.isBefore"(
    	String verifiedDate	
     , 	String compare2Date	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.DateTimeAssert()).isBefore(
        	verifiedDate
         , 	compare2Date
         , 	description)
}

def static "kms.turing.katalon.plugins.assertj.DateTimeAssert.isBefore"(
    	String verifiedDate	
     , 	String compare2Date	
     , 	String format	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.DateTimeAssert()).isBefore(
        	verifiedDate
         , 	compare2Date
         , 	format
         , 	description)
}

def static "kms.turing.katalon.plugins.assertj.DateTimeAssert.isBefore"(
    	String verifiedDate	
     , 	String compare2Date	
     , 	String format	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.DateTimeAssert()).isBefore(
        	verifiedDate
         , 	compare2Date
         , 	format
         , 	description
         , 	flowControl)
}

def static "kms.turing.katalon.plugins.assertj.DateTimeAssert.matchesDateTimeFormat"(
    	String dateInString	
     , 	String datetimeFormat	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.DateTimeAssert()).matchesDateTimeFormat(
        	dateInString
         , 	datetimeFormat
         , 	description
         , 	flowControl)
}

def static "kms.turing.katalon.plugins.assertj.DateTimeAssert.matchesDateTimeFormat"(
    	String dateInString	
     , 	String datetimeFormat	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.DateTimeAssert()).matchesDateTimeFormat(
        	dateInString
         , 	datetimeFormat
         , 	description)
}

def static "com.kms.katalon.keyword.pdf.PDF.getTextFromPage"(
    	String file	
     , 	int startPage	) {
    (new com.kms.katalon.keyword.pdf.PDF()).getTextFromPage(
        	file
         , 	startPage)
}

def static "com.kms.katalon.keyword.pdf.PDF.getAllText"(
    	String file	) {
    (new com.kms.katalon.keyword.pdf.PDF()).getAllText(
        	file)
}

def static "com.kms.katalon.keyword.pdf.PDF.savePageAsImage"(
    	String file	
     , 	int startPage	) {
    (new com.kms.katalon.keyword.pdf.PDF()).savePageAsImage(
        	file
         , 	startPage)
}

def static "com.kms.katalon.keyword.pdf.PDF.compareByPixel"(
    	String file1	
     , 	String file2	
     , 	int startPage	
     , 	int endPage	
     , 	boolean highlightImageDifferences	
     , 	boolean showAllDifferences	) {
    (new com.kms.katalon.keyword.pdf.PDF()).compareByPixel(
        	file1
         , 	file2
         , 	startPage
         , 	endPage
         , 	highlightImageDifferences
         , 	showAllDifferences)
}

def static "com.kms.katalon.keyword.pdf.PDF.compareFromPage"(
    	String file1	
     , 	String file2	
     , 	int startPage	
     , 	Object excludePattern	) {
    (new com.kms.katalon.keyword.pdf.PDF()).compareFromPage(
        	file1
         , 	file2
         , 	startPage
         , 	excludePattern)
}

def static "com.kms.katalon.keyword.pdf.PDF.extractAllImages"(
    	String file	) {
    (new com.kms.katalon.keyword.pdf.PDF()).extractAllImages(
        	file)
}

def static "com.kms.katalon.keyword.pdf.PDF.getPageNumber"(
    	String file	) {
    (new com.kms.katalon.keyword.pdf.PDF()).getPageNumber(
        	file)
}

def static "com.kms.katalon.keyword.pdf.PDF.compareAllPages"(
    	String file1	
     , 	String file2	
     , 	Object excludePattern	) {
    (new com.kms.katalon.keyword.pdf.PDF()).compareAllPages(
        	file1
         , 	file2
         , 	excludePattern)
}

def static "com.kms.katalon.keyword.pdf.PDF.getTextInPageRange"(
    	String file	
     , 	int startPage	
     , 	int endPage	) {
    (new com.kms.katalon.keyword.pdf.PDF()).getTextInPageRange(
        	file
         , 	startPage
         , 	endPage)
}

def static "com.kms.katalon.keyword.pdf.PDF.saveAllPagesAsImages"(
    	String file	) {
    (new com.kms.katalon.keyword.pdf.PDF()).saveAllPagesAsImages(
        	file)
}

def static "com.kms.katalon.keyword.pdf.PDF.savePageRangeAsImages"(
    	String file	
     , 	int startPage	
     , 	int endPage	) {
    (new com.kms.katalon.keyword.pdf.PDF()).savePageRangeAsImages(
        	file
         , 	startPage
         , 	endPage)
}

def static "com.kms.katalon.keyword.pdf.PDF.compareInPageRange"(
    	String file1	
     , 	String file2	
     , 	int startPage	
     , 	int endPage	
     , 	Object excludePattern	) {
    (new com.kms.katalon.keyword.pdf.PDF()).compareInPageRange(
        	file1
         , 	file2
         , 	startPage
         , 	endPage
         , 	excludePattern)
}

def static "com.kms.katalon.keyword.pdf.PDF.extractImagesInPageRange"(
    	String file	
     , 	int startPage	
     , 	int endPage	) {
    (new com.kms.katalon.keyword.pdf.PDF()).extractImagesInPageRange(
        	file
         , 	startPage
         , 	endPage)
}

def static "com.kms.katalon.keyword.pdf.PDF.extractImagesFromPage"(
    	String file	
     , 	int startPage	) {
    (new com.kms.katalon.keyword.pdf.PDF()).extractImagesFromPage(
        	file
         , 	startPage)
}

def static "kms.turing.katalon.plugins.assertj.StringAssert.equals"(
    	String actual	
     , 	String expected	
     , 	boolean caseSensitive	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).equals(
        	actual
         , 	expected
         , 	caseSensitive
         , 	description
         , 	flowControl)
}

def static "kms.turing.katalon.plugins.assertj.StringAssert.equals"(
    	String actual	
     , 	String expected	
     , 	boolean caseSensitive	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).equals(
        	actual
         , 	expected
         , 	caseSensitive
         , 	description)
}

def static "kms.turing.katalon.plugins.assertj.StringAssert.equals"(
    	String actual	
     , 	String expected	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).equals(
        	actual
         , 	expected
         , 	description)
}

def static "kms.turing.katalon.plugins.assertj.StringAssert.startsWith"(
    	String text	
     , 	String prefix	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).startsWith(
        	text
         , 	prefix
         , 	description)
}

def static "kms.turing.katalon.plugins.assertj.StringAssert.startsWith"(
    	String text	
     , 	String prefix	
     , 	boolean caseSensitive	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).startsWith(
        	text
         , 	prefix
         , 	caseSensitive
         , 	description
         , 	flowControl)
}

def static "kms.turing.katalon.plugins.assertj.StringAssert.startsWith"(
    	String text	
     , 	String prefix	
     , 	boolean caseSensitive	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).startsWith(
        	text
         , 	prefix
         , 	caseSensitive
         , 	description)
}

def static "kms.turing.katalon.plugins.assertj.StringAssert.endsWith"(
    	String text	
     , 	String suffix	
     , 	boolean caseSensitive	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).endsWith(
        	text
         , 	suffix
         , 	caseSensitive
         , 	description)
}

def static "kms.turing.katalon.plugins.assertj.StringAssert.endsWith"(
    	String text	
     , 	String suffix	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).endsWith(
        	text
         , 	suffix
         , 	description)
}

def static "kms.turing.katalon.plugins.assertj.StringAssert.endsWith"(
    	String text	
     , 	String suffix	
     , 	boolean caseSensitive	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).endsWith(
        	text
         , 	suffix
         , 	caseSensitive
         , 	description
         , 	flowControl)
}

def static "kms.turing.katalon.plugins.assertj.StringAssert.matches"(
    	String text	
     , 	String pattern	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).matches(
        	text
         , 	pattern
         , 	description
         , 	flowControl)
}

def static "kms.turing.katalon.plugins.assertj.StringAssert.matches"(
    	String text	
     , 	String pattern	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).matches(
        	text
         , 	pattern
         , 	description)
}

def static "kms.turing.katalon.plugins.assertj.StringAssert.contains"(
    	String text	
     , 	String subText	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).contains(
        	text
         , 	subText
         , 	description)
}

def static "kms.turing.katalon.plugins.assertj.StringAssert.contains"(
    	String text	
     , 	String subText	
     , 	boolean caseSensitive	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).contains(
        	text
         , 	subText
         , 	caseSensitive
         , 	description
         , 	flowControl)
}

def static "kms.turing.katalon.plugins.assertj.StringAssert.contains"(
    	String text	
     , 	String subText	
     , 	boolean caseSensitive	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).contains(
        	text
         , 	subText
         , 	caseSensitive
         , 	description)
}

def static "kms.turing.katalon.plugins.assertj.StringAssert.notEqual"(
    	String actual	
     , 	String expected	
     , 	boolean caseSensitive	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).notEqual(
        	actual
         , 	expected
         , 	caseSensitive
         , 	description
         , 	flowControl)
}

def static "kms.turing.katalon.plugins.assertj.StringAssert.notEqual"(
    	String actual	
     , 	String expected	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).notEqual(
        	actual
         , 	expected
         , 	description)
}

def static "kms.turing.katalon.plugins.assertj.StringAssert.notEqual"(
    	String actual	
     , 	String expected	
     , 	boolean caseSensitive	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).notEqual(
        	actual
         , 	expected
         , 	caseSensitive
         , 	description)
}

def static "kms.turing.katalon.plugins.assertj.StringAssert.notContain"(
    	String text	
     , 	String subText	
     , 	boolean caseSensitive	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).notContain(
        	text
         , 	subText
         , 	caseSensitive
         , 	description)
}

def static "kms.turing.katalon.plugins.assertj.StringAssert.notContain"(
    	String text	
     , 	String subText	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).notContain(
        	text
         , 	subText
         , 	description)
}

def static "kms.turing.katalon.plugins.assertj.StringAssert.notContain"(
    	String text	
     , 	String subText	
     , 	boolean caseSensitive	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).notContain(
        	text
         , 	subText
         , 	caseSensitive
         , 	description
         , 	flowControl)
}

def static "kms.turing.katalon.plugins.assertj.BooleanAssert.isTrue"(
    	boolean expression	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.BooleanAssert()).isTrue(
        	expression
         , 	description
         , 	flowControl)
}

def static "kms.turing.katalon.plugins.assertj.BooleanAssert.isTrue"(
    	boolean expression	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.BooleanAssert()).isTrue(
        	expression
         , 	description)
}

def static "kms.turing.katalon.plugins.assertj.BooleanAssert.isFalse"(
    	boolean expression	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.BooleanAssert()).isFalse(
        	expression
         , 	description)
}

def static "kms.turing.katalon.plugins.assertj.BooleanAssert.isFalse"(
    	boolean expression	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.BooleanAssert()).isFalse(
        	expression
         , 	description
         , 	flowControl)
}

def static "com.katalon.plugin.keyword.waitforangular.WaitForAngularKeywords.findWebElementBy"(
    	By by	) {
    (new com.katalon.plugin.keyword.waitforangular.WaitForAngularKeywords()).findWebElementBy(
        	by)
}

def static "com.katalon.plugin.keyword.waitforangular.WaitForAngularKeywords.initNgDriver"() {
    (new com.katalon.plugin.keyword.waitforangular.WaitForAngularKeywords()).initNgDriver()
}

def static "com.katalon.plugin.keyword.waitforangular.WaitForAngularKeywords.waitForAngularLoad"() {
    (new com.katalon.plugin.keyword.waitforangular.WaitForAngularKeywords()).waitForAngularLoad()
}

def static "com.kms.katalon.keyword.select2.Select2.selectOptionByLabel"(
    	TestObject to	
     , 	String option	) {
    (new com.kms.katalon.keyword.select2.Select2()).selectOptionByLabel(
        	to
         , 	option)
}

def static "com.kms.katalon.keyword.select2.Select2.removeOptions"(
    	TestObject to	
     , 	java.util.List<String> options	) {
    (new com.kms.katalon.keyword.select2.Select2()).removeOptions(
        	to
         , 	options)
}

def static "com.kms.katalon.keyword.select2.Select2.getAllOptionsLabel"(
    	TestObject to	) {
    (new com.kms.katalon.keyword.select2.Select2()).getAllOptionsLabel(
        	to)
}

def static "com.kms.katalon.keyword.select2.Select2.getSelectedOptionsLabel"(
    	TestObject to	) {
    (new com.kms.katalon.keyword.select2.Select2()).getSelectedOptionsLabel(
        	to)
}

def static "com.kms.katalon.keyword.select2.Select2.selectManyOptionsByLabel"(
    	TestObject to	
     , 	java.util.List<String> options	) {
    (new com.kms.katalon.keyword.select2.Select2()).selectManyOptionsByLabel(
        	to
         , 	options)
}

def static "com.kms.katalon.keyword.select2.Select2.getSelectedOptionsList"(
    	TestObject to	) {
    (new com.kms.katalon.keyword.select2.Select2()).getSelectedOptionsList(
        	to)
}

def static "kms.turing.katalon.plugins.assertj.GenericAssert.isNull"(
    	Object object	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.GenericAssert()).isNull(
        	object
         , 	description)
}

def static "kms.turing.katalon.plugins.assertj.GenericAssert.isNull"(
    	Object object	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.GenericAssert()).isNull(
        	object
         , 	description
         , 	flowControl)
}

def static "kms.turing.katalon.plugins.assertj.GenericAssert.isNotNull"(
    	Object object	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.GenericAssert()).isNotNull(
        	object
         , 	description)
}

def static "kms.turing.katalon.plugins.assertj.GenericAssert.isNotNull"(
    	Object object	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.GenericAssert()).isNotNull(
        	object
         , 	description
         , 	flowControl)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getSheetNames"(
    	Workbook workbook	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getSheetNames(
        	workbook)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.createWorkbook"(
    	String filePath	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).createWorkbook(
        	filePath)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.createExcelSheet"(
    	Workbook workbook	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).createExcelSheet(
        	workbook)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.createExcelSheet"(
    	Workbook workbook	
     , 	String sheetName	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).createExcelSheet(
        	workbook
         , 	sheetName)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getWorkbook"(
    	String filePath	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getWorkbook(
        	filePath)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.createExcelFile"(
    	String filePath	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).createExcelFile(
        	filePath)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.saveWorkbook"(
    	String filePath	
     , 	Workbook workbook	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).saveWorkbook(
        	filePath
         , 	workbook)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellByAddress"(
    	Sheet sheet	
     , 	String cellAddress	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellByAddress(
        	sheet
         , 	cellAddress)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellByIndex"(
    	Sheet sheet	
     , 	int rowIdx	
     , 	int colIdx	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellByIndex(
        	sheet
         , 	rowIdx
         , 	colIdx)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheet"(
    	String filePath	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getExcelSheet(
        	filePath)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheet"(
    	String filePath	
     , 	int sheetIndex	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getExcelSheet(
        	filePath
         , 	sheetIndex)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheet"(
    	Workbook wbs	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getExcelSheet(
        	wbs)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheet"(
    	Workbook wbs	
     , 	String sheetName	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getExcelSheet(
        	wbs
         , 	sheetName)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.locateCell"(
    	Sheet sheet	
     , 	Object cellContent	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).locateCell(
        	sheet
         , 	cellContent)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellValue"(
    	Cell cell	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellValue(
        	cell)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getTableContent"(
    	Sheet sheet	
     , 	int startRow	
     , 	int endRow	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getTableContent(
        	sheet
         , 	startRow
         , 	endRow)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getDataRows"(
    	Sheet sheet	
     , 	java.util.List<java.lang.Integer> rowIndexs	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getDataRows(
        	sheet
         , 	rowIndexs)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoExcels"(
    	Workbook workbook1	
     , 	Workbook workbook2	
     , 	boolean isValueOnly	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoExcels(
        	workbook1
         , 	workbook2
         , 	isValueOnly)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoExcels"(
    	Workbook workbook1	
     , 	Workbook workbook2	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoExcels(
        	workbook1
         , 	workbook2)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoSheets"(
    	Sheet sheet1	
     , 	Sheet sheet2	
     , 	boolean isValueOnly	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoSheets(
        	sheet1
         , 	sheet2
         , 	isValueOnly)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoSheets"(
    	Sheet sheet1	
     , 	Sheet sheet2	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoSheets(
        	sheet1
         , 	sheet2)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoRows"(
    	Row row1	
     , 	Row row2	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoRows(
        	row1
         , 	row2)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoRows"(
    	Row row1	
     , 	Row row2	
     , 	boolean isValueOnly	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoRows(
        	row1
         , 	row2
         , 	isValueOnly)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoCells"(
    	Cell cell1	
     , 	Cell cell2	
     , 	boolean isValueOnly	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoCells(
        	cell1
         , 	cell2
         , 	isValueOnly)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoCells"(
    	Cell cell1	
     , 	Cell cell2	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoCells(
        	cell1
         , 	cell2)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getMapOfKeyValueRows"(
    	Sheet sheet	
     , 	int keyRowIdx	
     , 	int valueRowIdx	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getMapOfKeyValueRows(
        	sheet
         , 	keyRowIdx
         , 	valueRowIdx)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellValueByRangeAddress"(
    	Sheet sheet	
     , 	String topLeftAddress	
     , 	String rightBottomAddress	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellValueByRangeAddress(
        	sheet
         , 	topLeftAddress
         , 	rightBottomAddress)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellValueByAddress"(
    	Sheet sheet	
     , 	String cellAddress	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellValueByAddress(
        	sheet
         , 	cellAddress)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellIndexByAddress"(
    	Sheet sheet	
     , 	String cellAddress	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellIndexByAddress(
        	sheet
         , 	cellAddress)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getRowIndexByCellContent"(
    	Sheet sheet	
     , 	String cellContent	
     , 	int columnIdxForCell	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getRowIndexByCellContent(
        	sheet
         , 	cellContent
         , 	columnIdxForCell)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellValuesByRangeIndexes"(
    	Sheet sheet	
     , 	int rowInd1	
     , 	int colInd1	
     , 	int rowInd2	
     , 	int colInd2	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellValuesByRangeIndexes(
        	sheet
         , 	rowInd1
         , 	colInd1
         , 	rowInd2
         , 	colInd2)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellValueByIndex"(
    	Sheet sheet	
     , 	int rowIdx	
     , 	int colIdx	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellValueByIndex(
        	sheet
         , 	rowIdx
         , 	colIdx)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.setValueToCellByIndex"(
    	Sheet sheet	
     , 	int rowIndex	
     , 	int colIndex	
     , 	Object value	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).setValueToCellByIndex(
        	sheet
         , 	rowIndex
         , 	colIndex
         , 	value)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.createExcelSheets"(
    	Workbook workbook	
     , 	java.util.List<String> sheetNames	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).createExcelSheets(
        	workbook
         , 	sheetNames)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.setValueToCellByAddress"(
    	Sheet sheet	
     , 	String cellAddress	
     , 	Object value	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).setValueToCellByAddress(
        	sheet
         , 	cellAddress
         , 	value)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.setValueToCellByAddresses"(
    	Sheet sheet	
     , 	Map content	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).setValueToCellByAddresses(
        	sheet
         , 	content)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheetByName"(
    	String filePath	
     , 	String sheetName	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getExcelSheetByName(
        	filePath
         , 	sheetName)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getColumnsByIndex"(
    	Sheet sheet	
     , 	java.util.List<java.lang.Integer> columnIndexes	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getColumnsByIndex(
        	sheet
         , 	columnIndexes)
}

def static "com.kms.katalon.keyword.uploadfile.UploadFile.uploadFile"(
    	TestObject object	
     , 	String file	) {
    (new com.kms.katalon.keyword.uploadfile.UploadFile()).uploadFile(
        	object
         , 	file)
}

def static "com.kms.katalon.keyword.uploadfile.UploadFile.uploadFileUsingRobot"(
    	TestObject object	
     , 	String file	) {
    (new com.kms.katalon.keyword.uploadfile.UploadFile()).uploadFileUsingRobot(
        	object
         , 	file)
}

def static "kms.turing.katalon.plugins.assertj.NumberAssert.equals"(
    	Object actual	
     , 	Object expected	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).equals(
        	actual
         , 	expected
         , 	description)
}

def static "kms.turing.katalon.plugins.assertj.NumberAssert.equals"(
    	Object actual	
     , 	Object expected	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).equals(
        	actual
         , 	expected
         , 	description
         , 	flowControl)
}

def static "kms.turing.katalon.plugins.assertj.NumberAssert.isNegative"(
    	Object value	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).isNegative(
        	value
         , 	description)
}

def static "kms.turing.katalon.plugins.assertj.NumberAssert.isNegative"(
    	Object value	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).isNegative(
        	value
         , 	description
         , 	flowControl)
}

def static "kms.turing.katalon.plugins.assertj.NumberAssert.isZero"(
    	Object value	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).isZero(
        	value
         , 	description
         , 	flowControl)
}

def static "kms.turing.katalon.plugins.assertj.NumberAssert.isZero"(
    	Object value	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).isZero(
        	value
         , 	description)
}

def static "kms.turing.katalon.plugins.assertj.NumberAssert.lessThan"(
    	Object x	
     , 	Object y	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).lessThan(
        	x
         , 	y
         , 	description
         , 	flowControl)
}

def static "kms.turing.katalon.plugins.assertj.NumberAssert.lessThan"(
    	Object x	
     , 	Object y	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).lessThan(
        	x
         , 	y
         , 	description)
}

def static "kms.turing.katalon.plugins.assertj.NumberAssert.greaterThan"(
    	Object x	
     , 	Object y	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).greaterThan(
        	x
         , 	y
         , 	description)
}

def static "kms.turing.katalon.plugins.assertj.NumberAssert.greaterThan"(
    	Object x	
     , 	Object y	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).greaterThan(
        	x
         , 	y
         , 	description
         , 	flowControl)
}

def static "kms.turing.katalon.plugins.assertj.NumberAssert.notEqual"(
    	Object actual	
     , 	Object expected	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).notEqual(
        	actual
         , 	expected
         , 	description)
}

def static "kms.turing.katalon.plugins.assertj.NumberAssert.notEqual"(
    	Object actual	
     , 	Object expected	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).notEqual(
        	actual
         , 	expected
         , 	description
         , 	flowControl)
}

def static "kms.turing.katalon.plugins.assertj.NumberAssert.isPositive"(
    	Object value	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).isPositive(
        	value
         , 	description)
}

def static "kms.turing.katalon.plugins.assertj.NumberAssert.isPositive"(
    	Object value	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).isPositive(
        	value
         , 	description
         , 	flowControl)
}

def static "kms.turing.katalon.plugins.assertj.NumberAssert.lessThanOrEqual"(
    	Object x	
     , 	Object y	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).lessThanOrEqual(
        	x
         , 	y
         , 	description)
}

def static "kms.turing.katalon.plugins.assertj.NumberAssert.lessThanOrEqual"(
    	Object x	
     , 	Object y	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).lessThanOrEqual(
        	x
         , 	y
         , 	description
         , 	flowControl)
}

def static "kms.turing.katalon.plugins.assertj.NumberAssert.greaterThanOrEqual"(
    	Object x	
     , 	Object y	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).greaterThanOrEqual(
        	x
         , 	y
         , 	description)
}

def static "kms.turing.katalon.plugins.assertj.NumberAssert.greaterThanOrEqual"(
    	Object x	
     , 	Object y	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).greaterThanOrEqual(
        	x
         , 	y
         , 	description
         , 	flowControl)
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getDayOfWeek"(
    	String date	
     , 	String dateFormat	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getDayOfWeek(
        	date
         , 	dateFormat)
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getDuration"(
    	String startTime	
     , 	String endTime	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getDuration(
        	startTime
         , 	endTime)
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.addDays"(
    	String stringDate	
     , 	String dateFormat	
     , 	int amount	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).addDays(
        	stringDate
         , 	dateFormat
         , 	amount)
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.formatStringDate"(
    	String value	
     , 	String currentFormat	
     , 	String newFormat	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).formatStringDate(
        	value
         , 	currentFormat
         , 	newFormat)
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getCurrentMonth"() {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getCurrentMonth()
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getCurrentDate"() {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getCurrentDate()
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getCurrentYear"() {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getCurrentYear()
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getFutureTime"(
    	int hrs	
     , 	int minute	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getFutureTime(
        	hrs
         , 	minute)
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getPastTime"(
    	int hrs	
     , 	int minute	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getPastTime(
        	hrs
         , 	minute)
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getDefaultTimeZone"() {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getDefaultTimeZone()
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.convertString2Date"(
    	String value	
     , 	String dateTimeFormat	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).convertString2Date(
        	value
         , 	dateTimeFormat)
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getCurrentDateTime"(
    	String timeZoneId	
     , 	String dateTimeFormat	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getCurrentDateTime(
        	timeZoneId
         , 	dateTimeFormat)
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getFutureDateTime"(
    	int noOfDays	
     , 	String timeZoneId	
     , 	String dateTimeFormat	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getFutureDateTime(
        	noOfDays
         , 	timeZoneId
         , 	dateTimeFormat)
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.setDefaultTimeZone"(
    	String timeZoneId	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).setDefaultTimeZone(
        	timeZoneId)
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getPreviousDateTime"(
    	int noOfDays	
     , 	String timeZoneId	
     , 	String dateTimeFormat	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getPreviousDateTime(
        	noOfDays
         , 	timeZoneId
         , 	dateTimeFormat)
}

def static "com.kms.katalon.keyword.select2.Utils.findContainer"(
    	TestObject to	) {
    (new com.kms.katalon.keyword.select2.Utils()).findContainer(
        	to)
}

def static "com.kms.katalon.keyword.select2.Utils.selectResult"(
    	String option	
     , 	String subContainerOpenClass	) {
    (new com.kms.katalon.keyword.select2.Utils()).selectResult(
        	option
         , 	subContainerOpenClass)
}

def static "com.kms.katalon.keyword.select2.Utils.enterText"(
    	String option	) {
    (new com.kms.katalon.keyword.select2.Utils()).enterText(
        	option)
}

def static "com.kms.katalon.keyword.select2.Utils.clickOnSelect2"(
    	TestObject to	) {
    (new com.kms.katalon.keyword.select2.Utils()).clickOnSelect2(
        	to)
}

def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.verifyOptionSelectedByName"(
    	TestObject dropdownObject	
     , 	String expectedName	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).verifyOptionSelectedByName(
        	dropdownObject
         , 	expectedName)
}

def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.verifyOptionItemsStatus"(
    	TestObject dropdownObject	
     , 	String listItemNames	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).verifyOptionItemsStatus(
        	dropdownObject
         , 	listItemNames)
}

def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.verifyOptionItemsStatus"(
    	TestObject dropdownObject	
     , 	String listItemNames	
     , 	boolean expectedStatus	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).verifyOptionItemsStatus(
        	dropdownObject
         , 	listItemNames
         , 	expectedStatus)
}

def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.selectOptionByIndex"(
    	TestObject dropdownObject	
     , 	Object range	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).selectOptionByIndex(
        	dropdownObject
         , 	range)
}

def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.selectOptionByIndex"(
    	TestObject dropdownObject	
     , 	Object range	
     , 	boolean isSelect	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).selectOptionByIndex(
        	dropdownObject
         , 	range
         , 	isSelect)
}

def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.selectAllOption"(
    	TestObject dropdownObject	
     , 	boolean isSelect	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).selectAllOption(
        	dropdownObject
         , 	isSelect)
}

def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.selectAllOption"(
    	TestObject dropdownObject	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).selectAllOption(
        	dropdownObject)
}

def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.selectSubOptionByName"(
    	TestObject dropdownObject	
     , 	String optionGroupName	
     , 	String listItemNames	
     , 	boolean isSelect	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).selectSubOptionByName(
        	dropdownObject
         , 	optionGroupName
         , 	listItemNames
         , 	isSelect)
}

def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.selectSubOptionByName"(
    	TestObject dropdownObject	
     , 	String optionGroupName	
     , 	String listItemNames	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).selectSubOptionByName(
        	dropdownObject
         , 	optionGroupName
         , 	listItemNames)
}

def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.selectOptionByName"(
    	TestObject dropdownObject	
     , 	String listItemNames	
     , 	boolean isSelect	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).selectOptionByName(
        	dropdownObject
         , 	listItemNames
         , 	isSelect)
}

def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.selectOptionByName"(
    	TestObject dropdownObject	
     , 	String listItemNames	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).selectOptionByName(
        	dropdownObject
         , 	listItemNames)
}

def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.selectSubOptionByIndex"(
    	TestObject dropdownObject	
     , 	String optionGroupName	
     , 	Object range	
     , 	boolean isSelect	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).selectSubOptionByIndex(
        	dropdownObject
         , 	optionGroupName
         , 	range
         , 	isSelect)
}

def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.selectSubOptionByIndex"(
    	TestObject dropdownObject	
     , 	String optionGroupName	
     , 	Object range	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).selectSubOptionByIndex(
        	dropdownObject
         , 	optionGroupName
         , 	range)
}

def static "com.kms.katalon.keyword.draganddrop.DragAndDropKeywords.dragAndDropBy"(
    	TestObject sourceObject	
     , 	TestObject destinationObject	
     , 	int xOffset	
     , 	int yOffset	) {
    (new com.kms.katalon.keyword.draganddrop.DragAndDropKeywords()).dragAndDropBy(
        	sourceObject
         , 	destinationObject
         , 	xOffset
         , 	yOffset)
}

def static "com.kms.katalon.keyword.draganddrop.DragAndDropKeywords.dragAndDropHtml5"(
    	TestObject sourceObject	
     , 	TestObject destinationObject	) {
    (new com.kms.katalon.keyword.draganddrop.DragAndDropKeywords()).dragAndDropHtml5(
        	sourceObject
         , 	destinationObject)
}

def static "com.kms.katalon.keyword.draganddrop.DragAndDropKeywords.dragAndDrop"(
    	TestObject sourceObject	
     , 	TestObject destinationObject	) {
    (new com.kms.katalon.keyword.draganddrop.DragAndDropKeywords()).dragAndDrop(
        	sourceObject
         , 	destinationObject)
}

def static "com.kms.katalon.keyword.draganddrop.DragAndDropKeywords.dragAndDropJquery"(
    	TestObject sourceObject	
     , 	TestObject destinationObject	) {
    (new com.kms.katalon.keyword.draganddrop.DragAndDropKeywords()).dragAndDropJquery(
        	sourceObject
         , 	destinationObject)
}

def static "kms.turing.katalon.plugins.assertj.ListAssert.contains"(
    	java.util.List<Object> list	
     , 	java.util.List<Object> subList	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.ListAssert()).contains(
        	list
         , 	subList
         , 	description)
}

def static "kms.turing.katalon.plugins.assertj.ListAssert.contains"(
    	java.util.List<Object> list	
     , 	java.util.List<Object> subList	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.ListAssert()).contains(
        	list
         , 	subList
         , 	description
         , 	flowControl)
}

def static "kms.turing.katalon.plugins.assertj.ListAssert.equalsWithOrder"(
    	java.util.List<Object> actual	
     , 	java.util.List<Object> expected	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.ListAssert()).equalsWithOrder(
        	actual
         , 	expected
         , 	description)
}

def static "kms.turing.katalon.plugins.assertj.ListAssert.equalsWithOrder"(
    	java.util.List<Object> actual	
     , 	java.util.List<Object> expected	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.ListAssert()).equalsWithOrder(
        	actual
         , 	expected
         , 	description
         , 	flowControl)
}

def static "kms.turing.katalon.plugins.assertj.ListAssert.equalsIgnoreOrder"(
    	java.util.List<Object> actual	
     , 	java.util.List<Object> expected	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.ListAssert()).equalsIgnoreOrder(
        	actual
         , 	expected
         , 	description)
}

def static "kms.turing.katalon.plugins.assertj.ListAssert.equalsIgnoreOrder"(
    	java.util.List<Object> actual	
     , 	java.util.List<Object> expected	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.ListAssert()).equalsIgnoreOrder(
        	actual
         , 	expected
         , 	description
         , 	flowControl)
}

def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.getAttribute"(
    	WebElement element	
     , 	String attribute	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).getAttribute(
        	element
         , 	attribute)
}

def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.isDisabled"(
    	WebElement element	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).isDisabled(
        	element)
}

def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.selectRadio"(
    	WebElement parentElement	
     , 	String label	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).selectRadio(
        	parentElement
         , 	label)
}

def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.selectRadio"(
    	String label	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).selectRadio(
        	label)
}

def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.selectDropdown"(
    	WebElement parentElement	
     , 	String label	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).selectDropdown(
        	parentElement
         , 	label)
}

def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.selectDropdown"(
    	String label	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).selectDropdown(
        	label)
}

def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.isChecked"(
    	WebElement element	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).isChecked(
        	element)
}

def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.findElement"(
    	String cssSelector	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).findElement(
        	cssSelector)
}

def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.getParentElement"(
    	WebElement element	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).getParentElement(
        	element)
}

def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.isVisible"(
    	WebElement element	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).isVisible(
        	element)
}

def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.findElements"(
    	String cssSelector	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).findElements(
        	cssSelector)
}

def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.setExplicitWait"(
    	int seconds	
     , 	int pollingTime	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).setExplicitWait(
        	seconds
         , 	pollingTime)
}

def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.getShadowElement"(
    	WebElement parent	
     , 	String selector	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).getShadowElement(
        	parent
         , 	selector)
}

def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.getChildElements"(
    	WebElement parent	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).getChildElements(
        	parent)
}

def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.selectCheckbox"(
    	String label	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).selectCheckbox(
        	label)
}

def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.selectCheckbox"(
    	WebElement parentElement	
     , 	String label	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).selectCheckbox(
        	parentElement
         , 	label)
}

def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.setImplicitWait"(
    	int seconds	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).setImplicitWait(
        	seconds)
}

def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.getSiblingElements"(
    	WebElement element	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).getSiblingElements(
        	element)
}

def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.getSiblingElement"(
    	WebElement element	
     , 	String selector	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).getSiblingElement(
        	element
         , 	selector)
}

def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.getNextSiblingElement"(
    	WebElement element	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).getNextSiblingElement(
        	element)
}

def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.getPreviousSiblingElement"(
    	WebElement element	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).getPreviousSiblingElement(
        	element)
}

def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.findElementInsideParent"(
    	WebElement parent	
     , 	String cssSelector	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).findElementInsideParent(
        	parent
         , 	cssSelector)
}

def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.getAllShadowElement"(
    	WebElement parent	
     , 	String selector	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).getAllShadowElement(
        	parent
         , 	selector)
}

def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.findElementsInsideParent"(
    	WebElement parent	
     , 	String cssSelector	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).findElementsInsideParent(
        	parent
         , 	cssSelector)
}

def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.scrollTo"(
    	WebElement element	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).scrollTo(
        	element)
}
