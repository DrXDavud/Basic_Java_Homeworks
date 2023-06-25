import java.util.Scanner;

public class Skin {
    public static void main(String[] args) {
        //double l = 28;
        //double s = 24;
        Scanner cd = new Scanner(System.in);

        System.out.print("diameter for larger pizza = ");
        double l = cd.nextDouble();

        System.out.print("diameter for smallest pizza = ");
        double s = cd.nextDouble();
        Bones bn = new Bones(l,s);


        cd.close();


    }
}
