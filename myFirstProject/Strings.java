import java.util.*;
public class Strings {
    public static void main(String[] args) {
        // concatenation
        String firstName = "sonal";
        String lastName = "mittal";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        // to finad the length
        System.out.println(fullName.length());

        // charAt = to find the charracter
        for(int i=0 ; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }

        // compare 
        String name1 = "sonal";
        String name2 = "sonal";

        // s1 > s2 : +ve value
        // s1 == s2 : 0
        // s1 < s2 : -ve value

        if(name1.compareTo(name2) == 0){
            System.out.println("string are equal");
        }else{
            System.out.println("not equal");
        }

        // String sentence = "my name is sonal";
        // String name = sentence.substring(7);
        // System.out.println(name);
    }
}
