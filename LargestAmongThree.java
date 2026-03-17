import java.util.Scanner;

public class LargestAmongThree {
    public static void main(String [] arg){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int m = obj.nextInt();
        int p = obj.nextInt();

        if(n>m && n>p){
            System.out.println("Largest NUmber is : "+n);
        }
        else if(m>n && m>p){
            System.out.println("Largest NUmber is : "+m);
        }
        else
            System.out.println("Largest NUmber is : "+p);
        
    }     
}
