/**
 * Created by Жека on 15.04.2015.
 */
public enum Color {
    Red,
    Yellow,
    Blue,
    Violet,
    Orange,
    Green,
    Indigo,
    Black;

    public static Color getRandomColor() {
        return values()[(int) (Math.random() * values().length)];
    }

}
