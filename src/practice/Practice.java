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
        // Sound travels 1,100 feet per second through air
        double distance;
        
        distance = 7.2 * 1100;
        
        System.out.println("The lightning is " + distance + " feet away.");
        
        // Printing out format
        System.out.println("First line\nSecond Line");
        System.out.println("A\tB\tC");
        System.out.println("D\tE\tF");
        
        // Dynamic initialization
        double radius = 4, height = 5;
        double volume = 3.1416 * radius * radius * height;
        System.out.println("Volume is " + volume);
    }
    }    

