package org.example;


import java.util.Date;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Q_6
        Date date = new Date();
        Boolean canRetire = false;
        Scanner sc = new Scanner(System.in);
        String currentAge, retireAge;

        int currYear = date.getYear() + 1900;

        System.out.print("What is your current age? ");
        currentAge = sc.nextLine();
        System.out.print("At what age would you like to retire? ");
        retireAge = sc.nextLine();

        //Convert the numbers
        canRetire = parseInt(currentAge) >= parseInt(retireAge);
        if(canRetire)
        {
            System.out.println("You are ready to retire!");
        }
        else
        {
            int yearsL = parseInt(retireAge) - parseInt(currentAge);
            System.out.println("You have " + yearsL + " years left until you can retire.");

            yearsL += currYear;
            System.out.println("It's " + currYear + ", so you can retire in " + yearsL);
        }
    }
}
