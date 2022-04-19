import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // EX_2

        // input: [1, 2, 3, 4, 5]
        // output: [5, 4, 3, 2, 1]

        int[] input = {1, 2, 3, 4, 5};
        int[] output = new int[input.length];

        System.out.print("Input: ");
        System.out.println(Arrays.toString(input));

        for(int i=input.length-1; i>=0; i--){
            output[(input.length-1)-i]=input[i];
        }
        System.out.print("Output: ");
        System.out.println(Arrays.toString(output));
    }
}