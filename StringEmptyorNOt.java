import java.util.Scanner;
public class StringEmptyorNOt {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);      
        
        String s = obj.nextLine();
        if(s==null || s.trim().isEmpty())
            System.out.println("String is empty");
        else
            System.out.println("String is not empty");
    
}}
