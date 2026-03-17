import java.util.Scanner;
public class QuotientRemainder{
    public static void main(String [] arg){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int m = obj.nextInt();
        int Q = n/m;
        int R = n%m;
        System.out.println("Quotient is:"+Q);
        System.out.println("Remainder is:"+R);

        
    }
}