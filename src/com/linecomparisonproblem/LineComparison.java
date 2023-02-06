package com.linecomparisonproblem;
import java.util.Scanner;
/*Program to find length of a line between two cartesian coordinates*/
public class LineComparison {
    /*Using a method to calculate the length of a line*/
    public double lengthCalculate(double x1,double y1, double x2, double y2){
        double length = Math.pow((x2-x1),2) + Math.pow((y2-y1),2);
        return Math.sqrt(length);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LineComparison length = new LineComparison();
        double x1, y1, x2, y2, x3, y3, x4, y4;
        System.out.println("Considering the first line");
        System.out.println("Enter x and y coordinates of the first point: ");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        System.out.println("Enter x and y coordinates of the second point: ");
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        System.out.println("Considering the second line");
        System.out.println("Enter x and y coordinates of the third point: ");
        x3 = input.nextDouble();
        y3 = input.nextDouble();
        System.out.println("Enter x and y coordinates of the fourth point: ");
        x4 = input.nextDouble();
        y4 = input.nextDouble();
        /*Storing the line length in two different variables */
        Double firstLine = length.lengthCalculate(x1,y1,x2,y2);
        Double secondLine = length.lengthCalculate(x3,y3,x4,y4);
        /*Using equals method to check equality of two lengths*/
        if(firstLine.equals(secondLine)){
            System.out.println("The lines are equal");
        }
        else{
            System.out.println("The lines are not equal");
        }
        /*Using compareTo method to compare length of two lines*/
        int compare = firstLine.compareTo(secondLine);
        if(compare > 0){
            System.out.println("The first line is greater than the second line.");
        }
        else if(compare < 0){
            System.out.println("The second line is greater than the first line.");
        }
        else {
            System.out.println("Both the lines are equal");
        }
    }
}
