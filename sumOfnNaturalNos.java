import java.util.Scanner;
public class sumOfnNaturalNos {
    

    public static void main(String [] arg){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}

