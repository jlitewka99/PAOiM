public class Prism implements Printable{

    Figure figure;
    double h;

    public Prism(Figure figure, double h) throws Exception {
        if (h<0){
            throw new Exception("H powinno byc wieksze niz 0");
        }
        this.figure = figure;
        this.h = h;
    }


    public double calculateVolume() {
            return figure.calculateArea()*h;
    }
    public double calculateArea() {
        return figure.calculatePerimeter() * h + 2 * figure.calculateArea();
    }


    @Override
    public void print() {
        System.out.print(this);
    }

    @Override
    public String toString() {
        return "Prism{" +
                "figure=" + figure +
                ", h=" + h +
                '}';
    }
}
