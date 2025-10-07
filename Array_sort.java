/*Given an array nums of n integers, return true if the array nums is sorted in non-decreasing order or else false.


Examples:
Input : nums = [1, 2, 3, 4, 5]

Output : true

Explanation : For all i (1 <= i <= 4) it holds nums[i] <= nums[i+1], hence it is sorted and we return true.

Input : nums = [1, 2, 1, 4, 5]

Output : false

Explanation : For i == 2 it does not hold nums[i] <= nums[i+1], hence it is not sorted and we return false.*/
import java.util.Scanner;

public class Array_sort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        boolean isSorted = true; // Assume sorted unless found otherwise

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                isSorted = false;
                break; // No need to check further
            }
        }

            if(!isSorted)
            {
                System.out.println("array is not sorted");
            }
            else{ System.out.println("array is sorted");}
           
    }
}
