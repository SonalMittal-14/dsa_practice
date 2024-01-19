import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // input
        for(int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        int index = -1;  // Initialize index to -1, indicating x not found

        // search for x
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == x){
                index = i;  // Update index if x is found
                break;      // Exit the loop once x is found
            }
        }

        // check if x was found or not
        if (index != -1) {
            System.out.println("x found at index: " + index);
        } else {
            System.out.println("x not found in the array");
        }
    }
}
