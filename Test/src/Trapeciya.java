/**
 * Created by Жека on 15.04.2015.
 */
public class Trapeciya extends Chetyrehugolnic {

    private double areaTrapec;

    public int getStoronaB() {
        return super.storonaB;
    }

    public int getStoronaA() {
        return super.storonaA;
    }

    @Override
    public StringBuilder getDraw() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Трапеция, ")
                .append("площадь: ")
                .append(getArea())
                .append(" кв.ед.,")
                .append(" длина стороны А: ")
                .append(storonaA)
                .append(" ед., длина стороны B: ")
                .append(storonaB)
                .append(" ед., высота: ")
                .append(visota)
                .append("ед., цвет: ")
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
        areaTrapec = ((storonaA + storonaB) * visota) / 2;  //площадь
        return areaTrapec;
    }
}
