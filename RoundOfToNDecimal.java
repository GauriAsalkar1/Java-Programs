import java.util.Scanner;
public class RoundOfToNDecimal {
    

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        float num = obj.nextFloat();
        System.out.print("Enter decimal places: ");
        int n = obj.nextInt();

        double factor = Math.pow(10, n);

        double result = Math.round(num * factor) / factor;

        System.out.println("Rounded value: " + result);




    }
}
