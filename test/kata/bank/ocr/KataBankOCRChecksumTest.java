package kata.bank.ocr;

import static org.junit.Assert.*;

import org.junit.Test;

public class KataBankOCRChecksumTest {

	// GIVEN I have a valid checksum
	// WHEN I process that checksum
	// THEN it is returned as valid
	@Test
	public void testValidChecksums() {
		
		assertTrue(KataBankOCR.validateChecksum("000000051"));
		assertTrue(KataBankOCR.validateChecksum("457508000"));
	}

	// GIVEN I have an invalid checksum with valid characters
	// WHEN I process that checksum
	// THEN it is returned as invalid
	@Test
	public void testInvalidChecksums() {
		
		assertFalse(KataBankOCR.validateChecksum("457346456"));
		assertFalse(KataBankOCR.validateChecksum("664372455"));
	}

	// GIVEN I have an invalid checksum with invalid characters
	// WHEN I process that checksum
	// THEN it is returned as invalid
	@Test
	public void testInvalidChecksumInputs() {
		
		assertFalse(KataBankOCR.validateChecksum("4575?8000"));
		assertFalse(KataBankOCR.validateChecksum("2account3"));
		assertFalse(KataBankOCR.validateChecksum("         "));
	}
	
	// GIVEN I have a null invalid checksum
	// WHEN I process that checksum
	// THEN it is returned as invalid
	@Test
	public void testNullChecksum() {
		
		assertFalse(KataBankOCR.validateChecksum(null));
	}
	
	// GIVEN I have an empty checksum
	// WHEN I process that checksum
	// THEN it is returned as invalid
	@Test
	public void testEmptyChecksum() {
		
		assertFalse(KataBankOCR.validateChecksum(new String()));
	}
	
	// GIVEN I have a checksum with an invalid length
	// WHEN I process that checksum
	// THEN it is returned as invalid
	@Test
	public void testChecksumLength() {
		
		assertFalse(KataBankOCR.validateChecksum("00051"));
		assertFalse(KataBankOCR.validateChecksum("457567508000"));
	}
	

}
