package Java_Conversion_Programs;
import java.util.*;
public class BinaryOctal {
    public int BinarytoOctal(int binary) {
        int decimal = 0;
        int n = 0;
        while (true) {
            if (binary == 0) {
                break;
            } else {
                int temp = binary % 10;
                decimal += temp * (int) Math.pow(2, n);
                binary = binary / 10;
                n++;
            }
        }

        int octal = 0;
        int p = 0;
        
        while (decimal != 0) {
            octal += decimal % 8 * (int) Math.pow(10, p);
            decimal = decimal / 8;
            p++;
        }
        return octal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryOctal obj = new BinaryOctal();
        int binary = sc.nextInt();
        System.out.println("Binary to Octal Conversion: " + obj.BinarytoOctal(binary));
    }
}
