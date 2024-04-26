package Java_Searching_Programs;
import java.util.*;
public class BinarySearch {
    
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
        BinarySearch obj = new BinarySearch();
        int index = obj.binarysearch(arr, key);
        if(index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element not found at index: "+index);
        }
    }

    public int binarysearch(int arr[],int key)
    {
        int start=0;
        int end=arr.length-1;

        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==key)
            {
                return mid;
            }
            else if(arr[mid]<key)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }

        return -1;
    }
}
