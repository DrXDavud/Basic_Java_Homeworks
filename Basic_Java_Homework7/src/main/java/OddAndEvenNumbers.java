import java.util.Scanner;

public class OddAndEvenNumbers {
    public static void main(String[] args) {

        Scanner cd = new Scanner(System.in);

        System.out.print("Pls enter number: ");
        int x = cd.nextInt();

        if (x % 2 == 0)
            System.out.println(x + " is even number");
        else
            System.out.println(x + " is odd number");

        cd.close();

    }
}
