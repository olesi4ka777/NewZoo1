import Animals.Cats;
import Animals.Lion;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<Cats> cats = new ArrayList(3);
    private ArrayList<Lion> lions = new ArrayList(2);
    private ArrayList<Giraffes> Giraffes = new ArrayList(5);

    public Zoo(String name) {
    }
public String printCats (){
        StringBuilder sb = new StringBuilder();
        for (Cats c: cats) {
            sb.append(c).append("\n");
        }
        return sb.toString();
}
    public static void main(String[] args) {
        Zoo z = new Zoo("Crazy");
        z.cats.add(c1);
        z.cats.add(c2);
        z.cats.add(c3);
        System.out.println(z.cats.get(0));
        System.out.println(z.printCats());
    }
}