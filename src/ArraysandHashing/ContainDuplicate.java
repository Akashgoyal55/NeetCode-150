package ArraysandHashing;
import java.util.*;

public class ContainDuplicate {
    // Function to check for duplicates
    public boolean containsDuplicate(int[] nums) {
        // HashSet to store unique elements
        HashSet<Integer> hashset = new HashSet<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Check if the current element exists in the HashSet
            if (hashset.contains(nums[i])) {
                return true; // Duplicate found
            }
            // Add the current element to the HashSet
            hashset.add(nums[i]);
        }
        return false; // No duplicates found
    }

    // Main method to test the function
    public static void main(String[] args) {
        ContainDuplicate solution = new ContainDuplicate();

        // Example 1
        int[] nums1 = {1, 2, 3, 1};
        System.out.println("Example 1: " + solution.containsDuplicate(nums1)); // Output: true

        // Example 2
        int[] nums2 = {1, 2, 3, 4};
        System.out.println("Example 2: " + solution.containsDuplicate(nums2)); // Output: false

        // Example 3
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println("Example 3: " + solution.containsDuplicate(nums3)); // Output: true
    }
}
