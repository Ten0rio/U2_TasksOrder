import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SequenzIFTest_ {
	
	String[][] s1 = {{ "A" , "C" }, { "C", "D" }, { "B", "C" }};
	String[][] s3 = {{ "A" , "C" }, { "B", "C" }, { "D", "C" },{"C","E"},{"E","F"}};
	
	Sequenz t1;
	Sequenz t2;
	Sequenz t3;
	
	@BeforeEach
	void setUp() {
		t1 = new Sequenz(s1);
		t2 = new Sequenz(s1);
		t3 = new Sequenz(s3);
	}
	

	@Test
	@DisplayName("Bei richtig sortierter Sequenz gibt isWellSorted 'true' aus")
	void test() {
		String[] seq =  {"A" , "B", "C", "D"};
		String[] seq2 = { "D" , "C", "B" , "A"};
		String[] seq3 = { "A" , "B", "D", "C", "E", "F"};

		assertEquals(true, t1.isWellSorted(seq));
		assertEquals(false, t1.isWellSorted(seq2));
		
		assertEquals(false, t3.isWellSorted(seq2));
		assertEquals(true, t3.isWellSorted(seq3));


		
		
	}

	@Test
	@DisplayName("setSequence soll die Sequenz zu der übergebenen Sequenz verändern")
    public void setSequence() {
        String [][] test = {{"A","B"},{"A","B"}};
        t1.setSequence(test);
        assertEquals(test,t1.getSequence());
    }
	
}
