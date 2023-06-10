import java.util.Scanner;

public class ScannerHomework {
    public static void main(String[] args) {

        Scanner xd = new Scanner(System.in);

        System.out.print("Welcome, pls type number: ");
        int x = xd.nextInt();
        System.out.println("Decimal = " + x + ", Binary = " + Integer.toBinaryString(x) + ", Octal = " + Integer.toOctalString(x) + ", Hex = " + Integer.toHexString(x));

        System.out.println("one more time? :)");
























    xd.close();
    }
}
