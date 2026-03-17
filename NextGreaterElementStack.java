public class NextGreaterElementStack {
    
    public static void main(String[] args) {

        int[] arr = {4, 5, 2, 10, 8};
        int n = arr.length;

        int[] ans = new int[n];
        int[] st = new int[n];   
        int top = -1;

        for (int i = n - 1; i >= 0; i--) {

     
            while (top != -1 && st[top] <= arr[i]) {
                top--;
            }

            
            if (top == -1) ans[i] = -1;
            else ans[i] = st[top];

            
            top++;
            st[top] = arr[i];
        }

    
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}

