import java.util.Scanner;

public class FactorialProgram {
    public static void main(String [] arg){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println(fact);
    }
}


