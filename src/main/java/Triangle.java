public class Triangle extends Figure implements Printable{
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) throws Exception {
        if (a<=0 && b <= 0 && c <= 0){
            throw new Exception("a, b i c powinny byc wieksze od zera");
        }
        if (!(a+b > c && a+c > b && b+c > a)){
            throw new Exception("z a, b i c nie da sie zbudowac trojkata");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateArea() {
        double p = calculatePerimeter()/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
