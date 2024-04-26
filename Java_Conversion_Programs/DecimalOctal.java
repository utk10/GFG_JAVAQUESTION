package Java_Conversion_Programs;
import java.util.Scanner;
public class DecimalOctal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        DecimalOctal obj=new DecimalOctal();
        int ans=obj.DecimaltoOctal(n);
        System.out.println(ans);
    }

    public int DecimaltoOctal(int n)
{
    int Octal=0;
    int p=0;
    while(n!=0)
    {
        int temp=n%8;
        Octal+=temp*(int)Math.pow(10,p);
        n=n/8;
        p++;
    }

    return Octal;
}
}
