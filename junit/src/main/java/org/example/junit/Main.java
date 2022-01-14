package org.example.junit;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        selectsort test = new selectsort();
        int[] arr = {6, 8, 3, 123, 5, 4, 1, 2, 0, 9, 7};
        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
        test.sortAsc(arr);
        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}
