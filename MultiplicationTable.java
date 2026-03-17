import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String [] arg){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int prod = 1;
        
        for(int i=1;i<=10;i++){
            prod = n*i;
            System.out.println(n+" * "+10+" = "+prod);
        }
        
    }

}
