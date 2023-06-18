public class Box {

    public double width;
    public double height;
    public double length;

    public Box(double w, double h, double l) {
        width = w;
        height = h;
        length = l;

        System.out.println("resul V = " + w * l * h + " cm^3");
    }
    public static void main(String[] args) {
        Box box1 = new Box(5,6,10);
    }


}
