import java.util.Random;

/**
 * Created by Жека on 15.04.2015.
 */
public class Krug implements Figure {
    Random random = new Random();
    private int radius = random.nextInt(5);
    private double areaS;

    @Override
    public StringBuilder getDraw() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Круг, ")
                .append("площадь: ")
                .append(getArea())
                .append(" кв.ед., ")
                .append("Радиус: ")
                .append(getRadius())
                .append(" ед., цвет: ")
                .append(getColor());
        return stringBuilder;
    }

    @Override
    public Color getColor() {
        Color color = Color.getRandomColor();
        return color;
    }

    @Override
    public double getArea() {
        areaS = Math.PI * (radius * radius);
        return areaS;
    }

    public double getRadius() {
        return radius;
    }
}
