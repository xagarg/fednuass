package com.base.functionality;

/**
 * Created by bbk on 3/24/17.
 */
public class Helper {
    public static void displayLine(){
        for (int i=0;i<76;i++){
            System.out.print("=");
        }
        System.out.println("=");
    }
    public static void displayInfo(){
        System.out.print("\t\t\tFEDERATION UNIVERSITY PHONE BILL COMPARISON SYSTEM");
        System.out.println("\n");
        System.out.print("Developed by Peter Vamplew, student ID 19051251 for ITECH1000 Semester 1 2017");
        System.out.println("\n");
    }
    public static void displayMenu(){
        System.out.println("\t\t\tMENU");
        System.out.println("\t\t\tPlease select an option from the menu:");
        System.out.println("\t\t\t1. Enter Usage Details");
        System.out.println("\t\t\t2. Display Cost Under Plan A");
        System.out.println("\t\t\t3. Display Cost Under Plan B");
        System.out.println("\t\t\t4. Clear Usage Details");
        System.out.println("\t\t\t5. Exit System");
    }

}





