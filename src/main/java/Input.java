import java.util.Scanner;

public class Input {
    static Scanner scanner = new Scanner(System.in);

    public static Figure getFigure() throws Exception {
        System.out.println("1 - Circle");
        System.out.println("2 - Square");
        System.out.println("3 - Triangle");
        System.out.print("Wybierz figure: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Wybrano Circle");
                System.out.print("Podaj r: ");
                double r = scanner.nextDouble();
                return new Circle(r);
            case 2:
                System.out.println("Wybrano Square");
                System.out.print("Podaj a: ");
                double a = scanner.nextDouble();
                return new Square(a);
            case 3:
                System.out.println("Wybrano Triangle");
                System.out.print("Podaj a: ");
                a = scanner.nextDouble();
                System.out.print("Podaj b: ");
                double b = scanner.nextDouble();
                System.out.print("Podaj c: ");
                double c = scanner.nextDouble();
                return new Triangle(a, b, c);
            default:
                throw new Exception("Zla figura");
        }
    }
    public static Prism getPrism(Figure figure) throws Exception {
        System.out.print("Podaj h: ");
        double h = scanner.nextDouble();
        return new Prism(figure, h);
    }
}
