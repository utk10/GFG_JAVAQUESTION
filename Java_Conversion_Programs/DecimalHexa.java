package Java_Conversion_Programs;
import java.util.*;
public class DecimalHexa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        DecimalHexa obj=new DecimalHexa();
        String ans=obj.DecimaltoHexa(n);
        System.out.println(ans);
    }
    public String DecimaltoHexa(int n)
    {
        String hexa="";
        while(n!=0)
        {
            int temp=n%16;
            if(temp<10)
            {
                hexa=temp+hexa;
            }
            else
            {
                hexa=(char)(temp+55)+hexa;
            }

            n=n/16;
        }

        return hexa;
    }
}
