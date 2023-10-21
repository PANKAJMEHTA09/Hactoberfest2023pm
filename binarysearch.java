package Searching;
import java.util.*;

public class binarysearch {
    public static boolean FoundKey(int array[],int key) {
        int low = 0;
        int high = array.length-1;
        while (low <= high) {
            int mid = (low + high)/2;
            if (array[mid]==key) {
                return true;
            } else if (array[mid]<key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        boolean ans = FoundKey(array, k);
        System.out.println(ans);

    }

}
