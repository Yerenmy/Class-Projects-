package application;
/*
 * Class: CMSC203 20984
 * Instructor: Ahmed Tarek
 * Description: This code test a few cases for our main class CryptoManager.java 
 * This are my own strings tested for the correct encryptation and decryptation
 * Due: 10/09/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
 * Print your Name here: Yerenmy Zelaya
*/

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CryptoManagerTestStudent {
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testStringInBounds() {
	    assertTrue(CryptoManager.stringInBounds("VALID TEST STRING"));
	    assertFalse(CryptoManager.stringInBounds("INVALID DUE TO { OUTSIDE THE RANGE"));
	    assertFalse(CryptoManager.stringInBounds("invalid due to lowercase letters"));
	    assertFalse(CryptoManager.stringInBounds("INVALID DUE TO ESC CHAR " + ((char) 27)));
	}

	@Test
	public void testEncryptCaesar() {
		assertEquals("T@M@IHT[U@G<T<",CryptoManager.encryptCaesar("YERENMY ZELAYA", 123));
		assertEquals("UFTUJOH![FMBZB", CryptoManager.encryptCaesar("TESTING ZELAYA", 321));
		assertEquals(":,*65+G5(4,G0:G16,3", CryptoManager.encryptCaesar("SECOND NAME IS JOEL", 2023));
	}
	
	@Test
	public void testDecryptCaesar() {
		assertEquals("ASSIGNMENT#3", CryptoManager.decryptCaesar("<NNDBIH@IO^.", 123));
		assertEquals("APPLE AND ORANGES", CryptoManager.decryptCaesar("BQQMF!BOE!PSBOHFT", 321));
		assertEquals("DECEMBER", CryptoManager.decryptCaesar("EFDFNCFS", 321));
	}

	@Test
	public void testEncryptBellaso() {
		assertEquals("ZB\\N^2", CryptoManager.encryptBellaso("MANGOS", "MANGO_IS_A_FRUIT"));
		assertEquals("L-TPRGAENV!JR?@SMN)DR", CryptoManager.encryptBellaso("I AM WORKING ON JAVA ", "CMSC2023"));
		assertEquals("WP$UQP#F\\Z6DYM\"FQF", CryptoManager.encryptBellaso("MONTGOMERY COLLEGE", "JAVA")); 
		
	}

	@Test
	public void testDecryptBellaso() {
		assertEquals("MONTGOMERY COLLEGE", CryptoManager.decryptBellaso("V\"-WV\\ZZ \"4\\.O[QSJ", "IS_COMMUNITY_COLLEGE"));
		assertEquals("MERRY CHRISTMAS", CryptoManager.decryptBellaso("UJ^^((HT^X[YYM\"", "HELLO"));
		assertEquals("TRANSFER", CryptoManager.decryptBellaso(") J$XXX[", "UNIVERSITY_OF_MARYLAND")); 

	}

}
