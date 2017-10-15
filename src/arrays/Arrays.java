/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

public class Arrays {
    
    public static void main(String[] args) {
        int nums[] = {99, -10, 10123, 18, -9788, 5623, 463, -9, 287, 49};
        
        int min, max;
        
        min = max = nums[0];
        
        for (int i = 1; i < 10; i++) {
            if(nums[i] < min) min = nums[i];
            if(nums[i] > max) max = nums[i];            
        }
        System.out.println("Min and max: " + min + " " + max);
        
        // Bubble sort
        int a, b, t;
        int size;
        
        size = 10; // number of elements to sort
        
        // display original array
        System.out.println("Original array is: ");
        for (int i = 0; i < size; i++) {
            System.out.println(" " + nums[i]);      
        }
        System.out.println();      
        
        // Bubble sort time
        for (a = 1; a < size; a++) {
            for (b = size - 1; b >= a; b--) {
                if(nums[b-1] > nums[b])
                {
                    //if out of order, exchange elements
                    t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                }
            }
            }
        // display sorted array
            System.out.println("Sorted array is: ");
            for (int i = 0; i < size; i++) {
                System.out.print(" " + nums[i]);
                System.out.println();
        }
    }
}

