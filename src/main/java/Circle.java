public class Circle extends Figure implements Printable{
    private double r;

    public Circle(double r) throws Exception {
        if (r<=0){
            throw new Exception("r powinno byc wieksze od zera");
        }
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return Math.PI*r*r;
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*r;
    }

    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }
}
