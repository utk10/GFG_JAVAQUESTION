package Java_Conversion_Programs;
import java.util.*;
public class DecimalBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        DecimalBinary obj=new DecimalBinary();
        int ans=obj.DecimaltoBinary(n);
        System.out.println(ans);

    }

    public int DecimaltoBinary(int n)
    {
        int binary=0;
        int p=0;
        while(n!=0)
        {
            int temp=n%2;
            binary+=temp*(int)Math.pow(10, p);
            p++;
            n=n/2;
        }

        return binary;
    }
}
