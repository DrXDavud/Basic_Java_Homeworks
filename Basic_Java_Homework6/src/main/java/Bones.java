import java.util.Random;

public class Bones {
    public static void main(String[] args) {

        Random r = new Random();
        int n = r.nextInt(0,28800);
        double  s = n / 60 / 60.0;

        String hours = String.format("%.1f", s);
        System.out.println(n + " seconds left");
        System.out.println(hours + " hours left");







    }
}
