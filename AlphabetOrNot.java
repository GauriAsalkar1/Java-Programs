import java.util.Scanner;

public class AlphabetOrNot {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if((ch >='A' && ch<= 'Z') || (ch>='a' && ch<='z'))
            System.out.println("It is a character");
        else
            System.out.println("NOt a character");

}}

