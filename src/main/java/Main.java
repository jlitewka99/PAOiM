public class Main {
    public static void main(String[] args) {


        Figure figure;
        Prism prism;

        while (true){
            try {
                figure = Input.getFigure();
                prism = Input.getPrism(figure);
                System.out.println(figure);
                System.out.println("Area = " + prism.calculateArea() + " volume = " + prism.calculateVolume());
                return;

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
