public class Square extends Figure implements Printable{
    private double a;

    public Square(double a) throws Exception {
        if (a<=0){
            throw new Exception("a powinno byc wieksze od zera");
        }
        this.a = a;
    }

    @Override
    public double calculateArea() {
        return a * a;
    }

    @Override
    public double calculatePerimeter() {
        return 4*a;
    }

    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                '}';
    }
}
