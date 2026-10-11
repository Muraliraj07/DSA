package Sorting;

import java.util.Arrays;

public class insertionSort {

    public static void main (String[] args){
        int[] arr = {5,3,8,4,2};
        insertionSortEx(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSortEx(int[] arr){
        for(int i=1; i<arr.length; i++){
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}

// Notes
/*
What is Insertion Sort?
Keep the left side sorted, and take one element from the unsorted side and insert it into the correct position.

key → compare backward → shift → insert

Complexity: O(n²), for sorted O(n)
Space: O(1)
 */
