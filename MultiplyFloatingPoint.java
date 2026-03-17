import java.util.Scanner;
public class MultiplyFloatingPoint{
    public static void main(String [] arg){
        Scanner obj = new Scanner(System.in);
        float n = obj.nextFloat();
        float m = obj.nextFloat();
        float prod = n*m;
        System.out.println(prod);
    }
}