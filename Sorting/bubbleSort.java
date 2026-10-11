package Sorting;

public class bubbleSort {

    public static void main(String args[]){
        int[] nums = {5,3,8,4,2};
        bubbleSorting(nums);
    }

    public static void bubbleSorting(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            boolean swapped = false; // to check if the arr is already sorted.
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;

                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}

// Notes:

/*
What is Bubble Sort?
Bubble Sort repeatedly compares two adjacent elements and swaps them if they are in the wrong order.
*/

/*
Why - i?
 After Pass 1:

[3, 5, 4, 2, 8]
             ↑
                8 is already sorted
So, after each pass the last element will be sorted and
reduces the number of elements we need to check.
*/

/*
1. Pattern: adjacent comparison + swap
2. Key observation: largest element moves to the end after each pass
3. Complexity: O(n²), but optimized best case can be O(n)
4. Space: O(1)
 */


