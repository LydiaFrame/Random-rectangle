/* 
 * Program: RandomRectangle.java
 * 
 * Student: Lydia Frame
 * 
 * Purpose: Create a program that generates a random length and width,
 * that is used to calculate the area of the rectangle. Display the length, width and area 
 * using a formatted print statement with captions that are printed with double quotation marks
 */

package randomrectangle;
import java.util.Scanner;

public class RandomRectangle{
    public static void main(String[] args){

        //variables 
        int length;
        int width; 
        int area; 

        //Generate 2 random numbers integers
        length = (int)(Math.random() * 100 + 1);
        width = (int)(Math.random() * 100 + 1);

        //Calculate area
        area = length * width; 

        //Output Variables
        System.out.println("\"The length of the rectangle = " + length + "\"");
        System.out.println("\"The width of the rectangle = " + width + "\"");
        System.out.println("\"The area of the rectangle = " + area + "\"");
    }
}