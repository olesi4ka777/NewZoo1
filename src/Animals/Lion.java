package Animals;
import java.util.ArrayList;
import java.util.Random;

public class Lion extends Mammal {
    public void eatGiraffe(Giraffe[] arr) {
        Random random = new Random();
        int i = random.nextInt(0, arr.length);
        if (arr[i].alive) {
            System.out.println("Остался в живых жираф" + +);
            arr[i].alive = false;
        } else
            System.out.println("Был очень вкусный жирафик");
        }
    }
}
//    public Lion (String name) {super(name);}
//    public ArrayList<Lion> lion = new ArrayList<>();
//        Lion l1 = new Lion(1);
//        Lion l2 = new Lion(2);

    @Override
    public void Hunting() {
    }
}
