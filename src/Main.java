import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Point a = new Point(sc.nextDouble(), sc.nextDouble());
        Point b = new Point(sc.nextDouble(), sc.nextDouble());
        if (closerToZero(a, b) == 1) System.out.println("Первая точка ближе");
        else if (closerToZero(a, b) == 2) System.out.println("Вторая точка ближе");
        else System.out.println("Точки на равных расстояниях");
    }
    public static int closerToZero(Point a, Point b) {
        if (a.distZero() < b.distZero()) return 1;
        else if (b.distZero() < a.distZero()) return 2;
        return 0;
    }
}

