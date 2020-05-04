import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SequenzIFTest_ {
	
	String[][] s1 = {{ "A" , "C" }, { "C", "D" }, { "B", "C" }};
	String[][] s2 = {{ "A" , "C" }, { "C", "D" }, { "B", "C" }};
	Sequenz t1;
	Sequenz t2;
	
	@BeforeEach
	void setUp() {
		t1 = new Sequenz(s1);
	}
	

	@Test
	@DisplayName("Die Reihenfolgen muss ausführbar sein und den Abhängigkeiten entsprechen")
	void test() {
		String[] seq =  {"A" , "B", "C", "D"};
		String[] seq2 = { "D" , "C", "B", "A" };
		
		assertEquals(true, t1.isWellSorted(seq));
		assertEquals(false, t1.isWellSorted(seq2));
		
		
	}

	@Test
	@DisplayName("Die Objekte sollen gleich sein wenn das gespeicherte aktualisiert wird")
    public void setSequence(String[][] x) {
        String [][] test = {{"A","B"},{"A","B"}};
        t1.setSequence(test);
        assertEquals(test,t1.getSequence());
    }
	
}
