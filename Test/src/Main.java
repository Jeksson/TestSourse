import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Жека on 15.04.2015.
 */
public class Main {

    static List<Figure> list = new ArrayList<Figure>();

    public static void main(String[] args) {
        figureAdd();

        for (Figure f : list) {
            System.out.println("Фигура: " + f.getDraw());
        }
    }

    public static List figureAdd() {
        Krug krug = new Krug();
        Kvadrat kvadrat = new Kvadrat();
        Trapeciya trapeciya = new Trapeciya();
        Treugolnic treugolnic = new Treugolnic();
        Random random = new Random();
        switch (random.nextInt(4)) {
            case 0:
                list.add(trapeciya);

            case 1:
                list.add(kvadrat);

            case 2:
                list.add(krug);

            case 3:
                list.add(treugolnic);

        }
        return list;
    }
}
