import java.util.*;

public class StringsBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Sonal");
        System.out.println(sb);

        // char at 0 index
        System.out.println(sb.charAt(0));

        // set char at index
        sb.setCharAt(0, 'M');
        System.out.println(sb);

        // inserting a char
        sb.insert(2, 'A');
        System.out.println(sb);

        // deleting a char or sub string
        sb.delete(2, 3); // ye last wale index ko nahi leta h it means iski range 2,2 tak hi rahegi
        System.out.println(sb);

        sb.delete(2, 4); // ye last wale index ko nahi leta h it means iski range 2,3 tak hi rahegi
        System.out.println(sb);

        // last me append kar sakte h
        sb.append('a');
        sb.append('b');
        System.out.println(sb);

        System.out.println(sb.length());

        // reverse a string
        StringBuilder sb1 = new StringBuilder("garima");
        for(int i=0; i<sb1.length()/2; i++){
            int front = i;
            int back = sb1.length()-1-i;

            char frontChar = sb1.charAt(front);
            char backChar = sb1.charAt(back);

            sb1.setCharAt(front, backChar);
            sb1.setCharAt(back, frontChar);
        }
        System.out.println(sb1);
        // System.out.println(sb);
    }    
}
