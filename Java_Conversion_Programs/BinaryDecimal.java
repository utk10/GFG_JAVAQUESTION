package Java_Conversion_Programs;
import java.util.*;
public class BinaryDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        BinaryDecimal obj=new BinaryDecimal();
        int ans=obj.BinarytoDecimal(n);
        System.out.println(ans);
    }

    public int BinarytoDecimal(int n)
    {
        int decimal=0;
        int p=0;
        while(n!=0)
        {
            int temp=n%10;
            decimal+=temp*(int)Math.pow(2, p);
            p++;
            n=n/10;
        }

        return decimal;
    }
}
