import java.util.Scanner;

public class PositveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n> 0){
            System.out.println("Number is postive");
        }
        else if(n<0)           
            System.out.println("Number is negative");
        else
            System.out.println("Number is zero");
        

        

    }

}
