/**
 * PyramidNumberPattern
 */
public class PyramidNumberPattern {

    public static void main(String[] args) {
        int n=5;
        int x=0;

        for(int i=0;i<n;i++)
        {
            x=i;

            for(int j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print(++x);
            }
            x--;
            for(int l=0;l<i;l++)
            {
                System.out.print(x--);
            }
            for(int m=0;m<n-i;m++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}