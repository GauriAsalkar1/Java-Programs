import java.util.Scanner;
public class FindASCII{
    public static void main(String [] arg){
        Scanner obj = new Scanner(System.in);
        char ch = obj.next().charAt(0);
        int ascii = ch;
        System.out.println(ascii);
    }
}