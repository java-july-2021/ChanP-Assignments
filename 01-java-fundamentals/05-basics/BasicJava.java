import java.util.Arrays;
import java.util.ArrayList;

public class BasicJava {
    public static void main(String[] args) {
        
        // print 1-255
        for (int i = 0; i <= 255; i++) {
            System.out.println(i);
        }

        // print odd numbers between 1-255
        for(int i = 0; i <= 255; i++) {
			if(i % 2 == 1)
			System.out.println(i);
        }

        // print sum
        int sum = 0;
        for(int i = 0; i <= 255; i++) {
            sum += i;
            System.out.println(String.format("New number: %d Sum: %d", i, sum));
        }

        // iterating through an array
        int[] myArray = {1,3,5,7,9,13,-22};
        int i, x;
        for(i = 0; i < myArray.length; i++) {
            x = myArray[i];
            System.out.println(x);
        }
    }

    // find max
    public static int maxArrayValue(int[] nums) {
		int currMax = Integer.MIN_VALUE;
		for(int val : nums) {
			if(val > currMax)
				currMax = val;
		}
		return currMax;
    }
}
