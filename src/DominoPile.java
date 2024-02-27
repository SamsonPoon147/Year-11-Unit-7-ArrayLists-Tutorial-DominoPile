import java.lang.reflect.Array;
import java.util.ArrayList;

public class DominoPile {
    private ArrayList<Domino> pile;
    public DominoPile() {
        pile = new ArrayList<Domino>();
    }

    public void newStack6() {
        for (int i = 0; i <= 6; i++){
            for (int j = i; j <=6; j++){
                Domino d = new Domino();
                d.setTop(i);
                d.setBottom(j);
                pile.add(d);
            }
        }
    }

    public void shuffle() {
    }

    public ArrayList<Domino> getPile() {
        return pile;
    }
}

/**
    newStack6() - puts in a complete set of dominoes from 0,0 to 6,6.
    Keep in mind that there are no repeated tiles (if there is already a 0,1, there can't be a 1,0).
    You must use a nested for-loop to solve this.
        shuffle() - puts the dominos in a random order within the stack.
*/