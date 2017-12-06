package greetingsUtil;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreetingsUtilTest {
	static GreetingsUtil gu;
	String actual;
	String expected;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		gu = new GreetingsUtil();
	}

	@BeforeEach
	void setUp() throws Exception {
		
	}

	@Test
	void test() {
		expected = "You already said that";
        actual = gu.Hello();
		assertTrue("Expected: " + expected + " Actual: "+actual, actual.equals(expected));
		//fail("Not yet implemented");
		
		expected = "bye";
        actual = gu.GoodBye();
		assertTrue("Expected: " + expected + " Actual: "+actual, actual.equals(expected));
		
	}

}
