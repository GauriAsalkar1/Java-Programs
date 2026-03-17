import java.util.Scanner;

public class FibonacciSeries {

    public static int fibo(int n){
        if(n == 0) return 0;   
        if(n == 1) return 1;   

        return fibo(n - 1) + fibo(n - 2);  
    }
        
    public static void main(String[] arg){
        Scanner obj = new Scanner(System.in);

        int n = obj.nextInt();

        for(int i = 0; i < n; i++){
            System.out.print(fibo(i) + " ");
        }

        
    }
}