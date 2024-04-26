package Java_Conversion_Programs;
import java.util.*;
public class BooleanString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean a=sc.nextBoolean();
        String s=Boolean.toString(a);
        System.out.println(s);     
    }

}
