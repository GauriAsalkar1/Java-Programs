 public class AdjacentDuplicateCharacter {

    static int top = -1;
    static int n = 6;
    static char[] stack = new char[6];

    // POP
    static void pop() {
        if (top == -1) {
            System.out.println("underflow");
        } else {
            top--;
        }
    }

    // PUSH
    static void push(char ele) {
        if (top == n - 1) {
            System.out.println("overflow");
        } else {
            top++;
            stack[top] = ele;
        }
    }

    // DISPLAY
    static void display() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {

        push('a');
        push('c');
        push('a');
        push('b');
        push('b');
        push('a');

        display();
        System.out.println();

        int i = n - 1;
        int j = n - 2;

        while (j >= 0) {
            if (stack[i] == stack[j]) {
                pop();
                pop();
            } else {
                i--;
            }
            j--;
        }

        display();
    }
}


