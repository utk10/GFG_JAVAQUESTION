package Java_Searching_Programs;
import java.util.*;
public class LinearSearch {
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
        int index = linearSearch(arr, key);
        if(index != -1) {
            System.out.println("Element found at index: "+index);
        } else {
            System.out.println("Element not found");
        }  
    }
    public static int linearSearch(int[] arr, int key) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
