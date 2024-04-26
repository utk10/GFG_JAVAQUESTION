package Java_Searching_Programs;
import java.util.*;
public class RecursiveLinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key element to be searched: ");
        int key = sc.nextInt();
        RecursiveLinearSearch obj = new RecursiveLinearSearch();
        int index = obj.reclinear(arr, 0, n-1, key);
        if(index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element not found at index: "+index);
        }
    }

    public int reclinear(int arr[],int start, int end, int key)
    {
        if(start>end)
        {
            return -1;
        }
        if(arr[start]==key)
        {
            return start;
        }
        if(arr[end]==key)
        {
            return end;
        }
        
        return reclinear(arr, start+1, end-1, key);
    }
}
