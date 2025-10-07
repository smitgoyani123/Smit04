/*Given two sorted arrays nums1 and nums2, return an array that contains the union of these two arrays. The elements in the union must be in ascending order.



The union of two arrays is an array where all values are distinct and are present in either the first array, the second array, or both.


Examples:
Input: nums1 = [1, 2, 3, 4, 5], nums2 = [1, 2, 7]

Output: [1, 2, 3, 4, 5, 7]

Explanation: The elements 1, 2 are common to both, 3, 4, 5 are from nums1 and 7 is from nums2

Input: nums1 = [3, 4, 6, 7, 9, 9], nums2 = [1, 5, 7, 8, 8]

Output: [1, 3, 4, 5, 6, 7, 8, 9]

Explanation: The element 7 is common to both, 3, 4, 6, 9 are from nums1 and 1, 5, 8 is from nums2*/
import java.util.Scanner;

public class UnionOfArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for first array
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] nums1 = new int[n1];
        System.out.println("Enter elements of first sorted array:");
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

       
        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] nums2 = new int[n2];
        System.out.println("Enter elements of second sorted array:");
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }

       
        int i = 0, j = 0;
        System.out.println("\nUnion of arrays:");
        int lastPrinted = Integer.MIN_VALUE; 

        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                if (nums1[i] != lastPrinted) {
                    System.out.print(nums1[i] + " ");
                    lastPrinted = nums1[i];
                }
                i++;
            } else if (nums1[i] > nums2[j]) {
                if (nums2[j] != lastPrinted) {
                    System.out.print(nums2[j] + " ");
                    lastPrinted = nums2[j];
                }
                j++;
            } else { 
                if (nums1[i] != lastPrinted) {
                    System.out.print(nums1[i] + " ");
                    lastPrinted = nums1[i];
                }
                i++;
                j++;
            }
        }

        
        while (i < n1) {
            if (nums1[i] != lastPrinted) {
                System.out.print(nums1[i] + " ");
                lastPrinted = nums1[i];
            }
            i++;
        }
        while (j < n2) {
            if (nums2[j] != lastPrinted) {
                System.out.print(nums2[j] + " ");
                lastPrinted = nums2[j];
            }
            j++;
        }
    }
}
