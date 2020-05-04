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
    




Erstellen der Klasse Sequenz und umsetzung der Funktionen:

    public class Sequenz implements SequenzIF {
        Speichern der Sequenz
        String [][] sequenz;
        
    Konstruktor
    public Sequenz (String[][] other){
       this.sequenz = other;
    }
    
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
