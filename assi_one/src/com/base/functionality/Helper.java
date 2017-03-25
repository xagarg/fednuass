package com.base.functionality;

import java.util.Scanner;

/**
 * Created by bbk on 3/24/17.
 */
public class Helper {
    static Scanner input= new Scanner(System.in);
    static Details details= new Details();
    static int sms=0;
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
        int option =input.nextInt();
        while (option!=5){
            if(option == 1) {
                Helper.displayMenuForOptionOne();
                int op = Helper.input.nextInt();
                Helper.optionOneForOne(op);
            } else if (option == 2) {

            } else if (option == 3) {

            } else if (option == 4) {

            } else if (option == 5) {
                System.exit(0);
            } else {

            }
            displayMenu();
        }

    }
    public static void displayMenuForOptionOne(){
        System.out.println("\t\t\tENTER USAGE DETAILS MENU");
        System.out.println("\t\t\tPlease select an option from the menu:");
        System.out.println("\t\t\t1. Phone Call");
        System.out.println("\t\t\t2. SMS");
        System.out.println("\t\t\t3. Data Usage");
        System.out.println("\t\t\t4. Return to main menu");
    }

    public static void optionOneForOne(int option){
        if (option==1){
            System.out.println("Enter call length in seconds: ");
            details.setPhoneCallLength(input.nextFloat());
        }else if (option==2){
            sms=sms+1;
            System.out.println("Total number of SMS so far = "+sms);
        }else if (option==3){
            System.out.println("Enter the amount of data in MB:");
            details.setDataUsage(input.nextInt());
        }
    }

    public static void planA(){
        System.out.println("Cost under Plan A");
        displayLine();
        System.out.println("Number of calls ="+ details.getPhoneCallLength());
    }
}





