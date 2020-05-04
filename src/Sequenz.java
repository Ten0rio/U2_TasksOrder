public class Sequenz implements SequenzIF {

   String [][] sequenz;

   public Sequenz (String[][] other){

       this.sequenz = other;

   }

    @Override
    public boolean isWellSorted(String[] other) {
       return false;
    }

    @Override
    public void setSequence(String[][] x) {

    }
}
