import java.util.Arrays;

public class Sequenz implements SequenzIF {

    String[][] sequenz;

    public Sequenz(String[][] other) {
        this.sequenz = other;
    }

    @Override
    public boolean isWellSorted(String[] other) {

        String[][] temp = this.sequenz.clone();

        for (int i = 0; i < other.length; i++) {
            for (int t = 0; t < temp.length; t++) {
                if (other[i] == temp[t][1]) {
                    return false;
                }
            }
            for (int t = 0; t < temp.length; t++) {
                if ((other[i] == temp[t][0]) && (temp[t][0] != "deleted")) {
                    temp[t][0] = "deleted";
                    temp[t][1] = "deleted";
                }
            }
        }
        return true;
    }

    @Override
    public void setSequence(String[][] x) {
        this.sequenz = x;
    }

    @Override
    public String[][] getSequence() {
        return this.sequenz;
    }

    @Override
    public String toString() {
        /*
        String restr = "";
        for(int i=0; i<this.sequenz.length; i++){
            restr += this.sequenz[i][0];
            restr += this.sequenz[i][1];
        }
        return restr;

         */
        return "nichts";
    }
}
