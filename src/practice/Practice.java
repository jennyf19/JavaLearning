/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author ferri
 */
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Print table of gallons to liters conversions
        double gallons, liters;
        int counter;
        
        counter = 0;
        for (gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854;
            System.out.println(gallons + " gallons is " + liters + " liters.");
            
            counter++;
            
            // Every 10th line, print a blank line
            if(counter==10)
            {
                System.out.println();
                counter = 0; // reset the line counter
            }
        }
    }    
}
