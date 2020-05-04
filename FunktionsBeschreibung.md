Protokollierung:

Erstellen des Interface mit Prototypen der Funktionen:
    
    public interface SequenzIF {
    
        Überprüfen ob die gegebene Liste den Abhängigkeiten nach entsprechend
        sortiert ist, gibt einen True oder False Wert zurück.
        boolean isWellSorted(String [] other);
        
        Speichern einer neuen oder gänderten Sequenz
        void setSequence(String[][] x);
        
        Print Funktion
        @Override
        String toString();
    
    }
    
Erstellen der Tests für die im Interface erstellten Funktionen:
    
    class SequenzIFTest_ {
    	
    	@BeforeEach
    	void setUp() {
    		t1 = new Sequenz(s1);
    	}
    	
    
    	@Test
    	@DisplayName("Die Reihenfolgen muss ausführbar sein und den Abhängigkeiten entsprechen")
    	void test() {
    		assertEquals(true, t1.isWellSorted(x);
    		assertEquals(false, t1.isWellSorted(y));
    		
    		
    	}
    
    	@Test
    	@DisplayName("Die Objekte sollen gleich sein wenn das gespeicherte aktualisiert wird")
        public void setSequence() {
            t1.setSequence(test);
            assertEquals(test,t1.getSequence());
        }
    	
    }

Erstellen der Klasse Sequenz und umsetzung der Funktionen:

    public class Sequenz implements SequenzIF {
          
    Pseudocode und erster Entwurf der isWellSorted Funktion
    @Override
    public boolean isWellSorted(String[] other) {
          for (solange liste noch nicht fertig durchgelaufen ist)
                   nimm dir den ersten Wert aus der Liste
                   vergleiche die Postion mit der gespeicherten Sequenz
                   if in einem Tupel abhängige Position (x[y][1]) dann break return false
                   else lösche alle Tupel in denen der geprüfte Wert an erster Stelle steht 
                   wiederhole so lange bis alle Werte in der Liste geprüft
               }
               return true;
            }
    }

    @Override
    public void setSequence(String[][] x) {
        Überschreibe alte Sequenz mit neuer aus dem Übergabeparamter
    }
}


Protokollierung:
1. Erster Testdurchlauf mit ausgedachten Testdaten. Beide Test fail, 
   da noch keine implementierung der genutzten Funktionen.
2. Nach umsetzen der Set Methode Test auf setSequence Erfolgreich
3. Fehler beim Test von isWellSorted --> nicht erwarteter Wert bei Test auf false 
   (Ergebnis True beim zweiten AssertEquals)
4. Beheben des Fehlers Lösung --> temporäres Array temp wurde beim mehrmaligen 
   aufruf nicht erneuert, Lösung durch Übernehmen der Elemente aus Sequence einzeln
   anstatt über die clone() Funktion.
5. Make it Better:
   Optimierung des Codesund Verbesserung der Laufzeit durch Einsparen einer 
   For Schleife in isWellSorted mittels setzen auf "deleted" in dem ersten Schleifendurchgang.