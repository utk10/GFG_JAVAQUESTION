package Java_Conversion_Programs;
import java.util.*;
public class DoubleString {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        String ans=Double.toString(n);
        System.out.println(
            "Type of num : "
            + ((Object)n).getClass().getSimpleName());
 
        // Converted element to string
        System.out.println(
            "Type of str : "
            + ((Object)ans).getClass().getSimpleName());
    }
}
