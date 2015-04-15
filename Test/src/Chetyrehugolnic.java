import java.util.Random;

/**
 * Created by Жека on 15.04.2015.
 */
public abstract class Chetyrehugolnic implements Figure {
    Random random = new Random();

    int storonaA = random.nextInt(10);
    int storonaB = random.nextInt(10);
    int visota = random.nextInt(10);


    public abstract StringBuilder getDraw();// прорисовка фигуры

    public abstract Color getColor();//цвет фигуры

    public abstract double getArea();// площадь фигуры


}
