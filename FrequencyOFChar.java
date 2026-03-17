import java.util.Scanner;
public class FrequencyOFChar {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s = obj.next();
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int count = 0;

            if(s.indexOf(ch)!=i){
                continue;
            }
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==ch)
                    count++;
            }
            System.out.println(ch+" = "+count);
        }
        
        
    }
}
