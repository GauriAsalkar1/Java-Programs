import java.util.Scanner;
public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        s= s.replace(" ","");
        System.out.println(s);
    }
    
}
