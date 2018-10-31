/*
 * Aedrianne Malawis
 * Assignment Marks
 * October 26, 2018
 */

package assignmentmarks;

import java.util.Scanner;

/**
 *
 * @author aemal4075
 */
public class AssignmentMarks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyedInput = new Scanner (System.in);
        
        int [ ] marks = new int [5];
        int total1 = 0;
        int total2 = 0; 
        int [ ] overall = new int [5];
        double average; 
        
        
        System.out.println("Enter your latest 5 assignment marks:");
        
        for (int i = 0; i <= 4; i = i + 1)
        {
           marks[i] = keyedInput.nextInt();
        }
        

        for (int i = 0; i <= 4; i = i + 1)
        {
             total1 = total1 + marks[i];
        }
        
        System.out.println("The sum of those numbers is:");
        System.out.println(total1);
        
        System.out.println("Please enter the 5 over all marks (ex. 5/10 Overall is 10):");
        for (int i = 0; i <= 4; i = i + 1)
        {
           overall[i] = keyedInput.nextInt();
        }
        

        for (int i = 0; i <= 4; i = i + 1)
        {
             total2 = total2 + overall[i];
        }
        
        average = total1/total2;
        
        average = average * 100;
        average = Math.round(average);
        
        System.out.println("The average mark is:");
        System.out.println(average);
    }
    
}
