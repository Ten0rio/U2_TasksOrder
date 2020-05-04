import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SequenzIFTest_ {
	
	String[][] s1 = {{ "A" , "C" }, { "C", "D" }, { "B", "C" }};
	Sequenz t1;
	
	@BeforeEach
	void setUp() {
		t1 = new Sequenz(s1);
	}
	

	@Test
	void test() {
		String[] seq =  {"A" , "B", "C", "D"};
		boolean a = t1.isWellSorted(seq);
		assertEquals(true, a);
		
		
	}

}
