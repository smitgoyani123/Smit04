import java.util.Scanner;
/*Given an array of integers nums, return the second-largest element in the array. If the second-largest element does not exist, return -1.


Examples:
Input: nums = [8, 8, 7, 6, 5]

Output: 7

Explanation: The largest value in nums is 8, the second largest is 7

Input: nums = [10, 10, 10, 10, 10]

Output: -1

Explanation: The only value in nums is 10, so there is no second largest value, thus -1 is returned*/
public class SecondLargestElement  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        if (n < 2) {
            System.out.println(-1);
            return;
        }

        int largest, secondLargest;

        if (nums[0] > nums[1]) {
            largest = nums[0];
            secondLargest = nums[1];
        } else if (nums[0] < nums[1]) {
            largest = nums[1];
            secondLargest = nums[0];
        } else { 
            largest = nums[0];
            secondLargest = -1; 
        }

        for (int i = 2; i < n; i++) {
            if (nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
            } else if (nums[i] > secondLargest && nums[i] < largest) {
                secondLargest = nums[i];
            }
        }

        System.out.println("secondLargest element: "+secondLargest);
    }
}

