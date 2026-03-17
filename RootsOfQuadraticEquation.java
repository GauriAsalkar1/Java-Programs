import java.util.Scanner;
public class RootsOfQuadraticEquation {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();
    double d = b * b - 4 * a * c;

        if (d > 0) { 
            System.out.println("Roots: " + ((-b + Math.sqrt(d)) / (2 * a)) + " and " + ((-b - Math.sqrt(d)) / (2 * a)));
        }
        else if (d == 0) { 
            System.out.println("Root: " + (-b / (2 * a)));
        } 
        else { 
            System.out.println("Complex roots: " + (-b / (2 * a)) + " ± " + (Math.sqrt(-d) / (2 * a)) + "i");
        }
    
}
}
