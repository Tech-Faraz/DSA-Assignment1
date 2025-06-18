import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        // Original array
        int[] arr = {10, 20, 30, 40, 50};

        // Print original array
        System.out.print("Original Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Create a stack of Integer
        Stack<Integer> stack = new Stack<>();

        // Push all elements of array into stack
        for (int num : arr) {
            stack.push(num);
        }

        // Pop elements from stack back into array (this reverses it)
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }

        // Print reversed array
        System.out.print("\nReversed Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
