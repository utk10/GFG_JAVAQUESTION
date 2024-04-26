package Java_Conversion_Programs;
import java.util.*;
public class StringDouble {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        double ans=Double.parseDouble(s);
        System.out.println(
            "Type of num : "
            + ((Object)ans).getClass().getSimpleName());
 
        // Converted element to string
        System.out.println(
            "Type of str : "
            + ((Object)s).getClass().getSimpleName());
    }
}
