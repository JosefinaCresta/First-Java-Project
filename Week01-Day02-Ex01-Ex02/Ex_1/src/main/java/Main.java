import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // EX_1

        // input: [5, 4, 3, 2, 1]
        // output: [20, 12, 6, 2, 5]
        // Explanation 5*4, 4*3, 3*2, 2*1, 1*5

        int[] input = {5, 4, 3, 2, 1};
        int[] output = new int[input.length];

        System.out.print("Input: ");
        System.out.println(Arrays.toString(input));

        for(int i=0; i< input.length; i++){
            //System.out.println(i);
            if (i==input.length-1){
                  output[i]=input[i]*input[0];
                  //System.out.println(i);
            }else {
            output[i]=input[i]*input[i+1];}
        }
        System.out.print("Output: ");
        System.out.println(Arrays.toString(output));
    }
}
