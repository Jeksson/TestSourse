import java.util.Random;

/**
 * Created by Жека on 15.04.2015.
 */
public class Treugolnic implements Figure {
    Random random = new Random();
    private int katetA = random.nextInt(5);
    private int katetB = random.nextInt(5);
    private double gipotenuzaC = Math.sqrt((katetA * katetA) + (katetB * katetB));
    private double areaTreug;

    public double getGipotenuzaC() {
        return gipotenuzaC;
    }

    @Override
    public Color getColor() {
        Color color = Color.getRandomColor();
        return color;
    }

    @Override
    public double getArea() {
        areaTreug = (katetA * katetB) / 2;
        return areaTreug;
    }

    @Override
    public StringBuilder getDraw() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Треугольник, ")
                .append("площадь: ")
                .append(getArea())
                .append(" кв.ед., ")
                .append("длина стороны А: ")
                .append(katetA)
                .append(" ед., длина стороны B: ")
                .append(katetB)
                .append(" ед.,длина гипотенузы: ")
                .append(getGipotenuzaC())
                .append(" ед., цвет: ")
                .append(getColor());
        return stringBuilder;
    }
}
