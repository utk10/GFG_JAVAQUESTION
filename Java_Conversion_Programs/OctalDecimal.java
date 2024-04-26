package Java_Conversion_Programs;
import java.util.Scanner;
public class OctalDecimal {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        OctalDecimal obj=new OctalDecimal();
        int ans=obj.OctaltoDecimal(n);
        System.out.println(ans);
    }

public int OctaltoDecimal(int n)
{
    int decimal=0;
    int p=0;
    while(n!=0)
    {
        int temp=n%10;
        decimal+=temp*(int)Math.pow(8,p);
        n=n/10;
        p++;
    }

    return decimal;
}

}
