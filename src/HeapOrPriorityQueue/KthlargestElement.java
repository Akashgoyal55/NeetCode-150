package HeapOrPriorityQueue;
import java.util.*;
/*
* Whenever an array and a integer k is given in the question
* And the question ask to find the kth smallest or kth the largest element in the array
* In that case always use Heap/Priority Queue to get the smallest and largest element efficiently
* For the smallest element use maxHeap and for the largest use minHeap
 */

import java.util.PriorityQueue;


import java.util.PriorityQueue;

public class KthlargestElement {

    public static void main(String[] args) {
        KthlargestElement solution = new KthlargestElement(); // Create an instance of the class

        // Example input array
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;

        // Call the method to find the kth largest element
        int result = solution.findKthLargest(nums, k);

        // Print the result
        System.out.println("The " + k + "th largest element is: " + result);
    }

    public int findKthLargest(int[] nums, int k) {
        // Create a min-heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); //create a empty heap

        // Iterate through the array
        for(int i = 0; i < nums.length; i++) {
            minHeap.add(nums[i]); // Add the element to the heap
            if (minHeap.size() > k) { // If the heap size exceeds k, remove the smallest element
                minHeap.poll(); //element remove
            }
        }

        // The root of the heap is the kth largest element
        return minHeap.peek();
    }
}

