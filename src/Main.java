import Animals.Cat;
import Animals.Giraffe;
import Animals.Lion;

public class Main {
    public static void main(String[] args) {
        System.out.println("В нашем зоопарке не очень весело");
    }

    public static <Cats> void addCats() {
     Cats[] cat = new Cats[3];
        Cats[1] = new Cats(1, "Kuzya");
        Cats[2] = new Cats(2, "Tomas);
        Cats[3] = new Cats(3, "Simba");
    }

    public static <Lions> void addLions() {
        addLions();Lion[] lion = new Lion[3];
        Lion[1] = lion1;
        Lion[2] = lion2;
        Lion[3] = lion3;
    }

    public static <Giraffes> void addGiraffes() {
        Giraffes[] gir = new Giraffes[5];
        Giraffe[1] = gir1;
        Giraffe[2] = gir2;
        Giraffe[3] = gir3;
        Giraffe[4] = gir4;
        Giraffe[5] = gir5;
    }
}