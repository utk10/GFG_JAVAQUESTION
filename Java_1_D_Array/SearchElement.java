package Java_1_D_Array;
import java.util.*;
public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key element to be searched: ");
        int key = sc.nextInt();

        for(int i=0;i<n;i++)
        {
            if(arr[i]==key)
            {
                System.out.println("Element found at index: "+i);
                return;
            }
        }
    }

     
}
