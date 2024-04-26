package Java_Conversion_Programs;
import java.util.Scanner;
public class HexaDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        HexaDecimal obj=new HexaDecimal();
        int ans=obj.HexatoDecimal(n);
        System.out.println(ans);
    }

    public int HexatoDecimal(String n)
    {
        
        int decimal=0;
        int p=0;
        for(int i=n.length()-1;i>=0;i--)
        {
            char ch=n.charAt(i);
            if(ch>='0'&&ch<='9')
            {
                decimal+=((int)ch-48)*(int)Math.pow(16, p);
                p++;
            }
            else if(ch>='A'&&ch<='F')
            {
                decimal+=((int)ch-55)*(int)Math.pow(16, p);
                p++;
            }
        }

        return decimal;
    }
}
