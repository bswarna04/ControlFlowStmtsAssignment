package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*int x=15;
    if(x<10){
        System.out.println("Less than 10");    //if Statement
    }
    }*/

      /*  int x = 15;
        if (x < 10) {
            System.out.println("Less than 10");
        } else {                                                   //if else
            System.out.println("Greater than 10");

        }*/

    /*    int x = 50;
        if (x < 10) {
            System.out.println("Less than 10");
        } else if(x>10 && x<20) {
                                                                       //if else if
            System.out.println("Between 10 and 20");

        }else{
            System.out.println("Greater than or equal to 20");
        }  */
       /*  int x=15;
        if(x<10 || x>20) {

            System.out.println("Out of range");          //in range or out of range

        }else if(x>10 && x<20) {

            System.out.println("In range");
        }*/
       /* Scanner s = new Scanner(System.in);
        System.out.println("Enter score:");
        int score = s.nextInt();
        if (score >= 90 && score <= 100) {
            System.out.println("Grade A");

        }else if (score >= 80 && score <= 89) {              //Finding Grades
            System.out.println("Grade B");

        }else if (score >= 70 && score <= 79) {
            System.out.println("Grade C");

        }else if (score >= 60 && score <= 69) {
            System.out.println("Grade D");

        }else
        {
            System.out.println("Grade F");
        } */

        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int day = s.nextInt();

        System.out.println(getDayName(day));
    }
                                                                       // Get the name for the Week
        public static String getDayName(int day) {
        String Name = "";
        switch (day) {
            case 1: Name = "Monday"; break;
            case 2: Name = "Tuesday"; break;
            case 3: Name = "Wednesday"; break;
            case 4: Name = "Thursday"; break;
            case 5: Name = "Friday"; break;
            case 6: Name = "Saturday"; break;
            case 7: Name = "Sunday"; break;
            default:Name = "Out of range";
        }

        return Name;

    }
}