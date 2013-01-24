package kata.bank.ocr;

import static org.junit.Assert.*;

import org.junit.Test;

public class KataBankOCRDigitTest {

	// GIVEN I have a valid OCR file with data
	// WHEN I process the file to be converted  
	// THEN I should get standard characters returned 
	@Test
	public void testValidOCRFile() {

		assertTrue(!KataBankOCR.loadAccountNumbers(KataBankOCR.FILE).isEmpty());
	}

	// GIVEN I have an invalid OCR file that does not exist
	// WHEN I process the file to be converted  
	// THEN I should not get any values returned 
	@Test
	public void testInalidOCRFile() {

		assertFalse(!KataBankOCR.loadAccountNumbers("resources/noFileHere").isEmpty());
	}

	// GIVEN I have a valid OCR file with invalid data
	// WHEN I process the file to be converted  
	// THEN I should not get any values returned
	@Test
	public void testInvalidOCRDataFromFile() {

		assertFalse(!KataBankOCR.loadAccountNumbers("resources/ocr.invalid.output").isEmpty());
	}

	// GIVEN I have a valid OCR file with no data
	// WHEN I process the file to be converted  
	// THEN I should not get any values returned
	@Test
	public void testEmptyOCRDataFromFile() {

		assertFalse(!KataBankOCR.loadAccountNumbers("resources/ocr.empty.output").isEmpty());
	}

	// GIVEN I have an invalid OCR Digit to be converted
	// WHEN I process the Digit to be converted  
	// THEN I should get a '?' Character returned
	@Test
	public void testInvalidOCRCharacters() {
		Digit digit = new Digit();
		String ocrDigit= 
				"   " +
				"|_|" +
				"| |";
		assertTrue(digit.toSingleChar(ocrDigit).equals('?'));
	}

	// GIVEN I have an empty OCR Digit to be converted
	// WHEN I process the Digit to be converted  
	// THEN I should get a '?' Character returned
	@Test
	public void testEmptyOCRCharacter() {
		Digit digit = new Digit();
		String ocrDigit= new String();
		assertTrue(digit.toSingleChar(ocrDigit).equals('?'));
	}

	// GIVEN I have a null OCR Digit to be converted
	// WHEN I process the Digit to be converted  
	// THEN I should get a '?' Character returned
	@Test
	public void testNullOCRCharacter() {
		Digit digit = new Digit();
		String ocrDigit= null;
		assertTrue(digit.toSingleChar(ocrDigit).equals('?'));
	}

	// GIVEN I have a valid 1 OCR Digit to be converted
	// WHEN I process the Digit to be converted  
	// THEN I should get a '1' Character returned
	@Test
	public void testChar1() {
		Digit digit = new Digit();
		String ocrDigit= 
				"   " +
				"  |" +
				"  |";
		assertTrue(digit.toSingleChar(ocrDigit).equals('1'));
	}

	// GIVEN I have a valid 2 OCR Digit to be converted
	// WHEN I process the Digit to be converted  
	// THEN I should get a '2' Character returned
	@Test
	public void testChar2() {
		Digit digit = new Digit();
		String ocrDigit= 
				" _ " +
				" _|" +
				"|_ ";
		assertTrue(digit.toSingleChar(ocrDigit).equals('2'));
	}

	// GIVEN I have a valid 3 OCR Digit to be converted
	// WHEN I process the Digit to be converted  
	// THEN I should get a '3' Character returned
	@Test
	public void testChar3() {
		Digit digit = new Digit();
		String ocrDigit= 
				" _ " +
				" _|" +
				" _|";
		assertTrue(digit.toSingleChar(ocrDigit).equals('3'));
	}

	// GIVEN I have a valid 4 OCR Digit to be converted
	// WHEN I process the Digit to be converted  
	// THEN I should get a '4' Character returned
	@Test
	public void testChar4() {
		Digit digit = new Digit();
		String ocrDigit= 
				"   " +
				"|_|" +
				"  |";
		assertTrue(digit.toSingleChar(ocrDigit).equals('4'));
	}

	// GIVEN I have a valid 5 OCR Digit to be converted
	// WHEN I process the Digit to be converted  
	// THEN I should get a '5' Character returned
	@Test
	public void testChar5() {
		Digit digit = new Digit();
		String ocrDigit= 
				" _ " +
				"|_ " +
				" _|";
		assertTrue(digit.toSingleChar(ocrDigit).equals('5'));
	}

	// GIVEN I have a valid 6 OCR Digit to be converted
	// WHEN I process the Digit to be converted  
	// THEN I should get a '6' Character returned
	@Test
	public void testChar6() {
		Digit digit = new Digit();
		String ocrDigit= 
				" _ " +
				"|_ " +
				"|_|";
		assertTrue(digit.toSingleChar(ocrDigit).equals('6'));
	}

	// GIVEN I have a valid 7 OCR Digit to be converted
	// WHEN I process the Digit to be converted  
	// THEN I should get a '7' Character returned
	@Test
	public void testChar7() {
		Digit digit = new Digit();
		String ocrDigit= 
				" _ " +
				"  |" +
				"  |";
		assertTrue(digit.toSingleChar(ocrDigit).equals('7'));
	}

	// GIVEN I have a valid 8 OCR Digit to be converted
	// WHEN I process the Digit to be converted  
	// THEN I should get a '8' Character returned
	@Test
	public void testChar8() {
		Digit digit = new Digit();
		String ocrDigit= 
				" _ " +
				"|_|" +
				"|_|";
		assertTrue(digit.toSingleChar(ocrDigit).equals('8'));
	}

	// GIVEN I have a valid 9 OCR Digit to be converted
	// WHEN I process the Digit to be converted  
	// THEN I should get a '9' Character returned
	@Test
	public void testChar9() {
		Digit digit = new Digit();
		String ocrDigit= 
				" _ " +
				"|_|" +
				" _|";
		assertTrue(digit.toSingleChar(ocrDigit).equals('9'));
	}

	// GIVEN I have a valid 0 OCR Digit to be converted
	// WHEN I process the Digit to be converted  
	// THEN I should get a '0' Character returned
	@Test
	public void testChar0() {
		Digit digit = new Digit();
		String ocrDigit= 
				" _ " +
				"| |" +
				"|_|";
		assertTrue(digit.toSingleChar(ocrDigit).equals('0'));
	}
	

}
