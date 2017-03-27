package com.base.functionality;

import java.util.Scanner;

/**
 * Created by bbk on 3/24/17.
 */
public class Helper {
    Scanner input= new Scanner(System.in);
    int sms=0;
    int call=0;
    int callLength=0;
    int dataUsage=0;

    public void displayLine(){
        for (int i=0;i<76;i++){
            System.out.print("=");
        }
        System.out.println("=");
    }
    public void displayInfo(){
        System.out.print("\t\t\tFEDERATION UNIVERSITY PHONE BILL COMPARISON SYSTEM");
        System.out.println("\n");
        System.out.print("Developed by Peter Vamplew, student ID 19051251 for ITECH1000 Semester 1 2017");
        System.out.println("\n");
    }
    public void displayMenu(){
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
                displayMenuForOptionOne();
                int op = input.nextInt();
                optionOneForOne(op);
            } else if (option == 2) {
                planA();
            } else if (option == 3) {
                planB();
            } else if (option == 4) {
                clearUsage();
            } else if (option == 5) {
                exit();
                System.exit(0);
            } else {
                System.out.println("Value must be between 1 and 5. Please try again:");
                option=input.nextInt();
            }
            displayMenu();
        }

    }
    private void displayMenuForOptionOne(){
        System.out.println("\t\t\tENTER USAGE DETAILS MENU");
        System.out.println("\t\t\tPlease select an option from the menu:");
        System.out.println("\t\t\t1. Phone Call");
        System.out.println("\t\t\t2. SMS");
        System.out.println("\t\t\t3. Data Usage");
        System.out.println("\t\t\t4. Return to main menu");
    }

    private void optionOneForOne(int option){
        if (option==1){
            System.out.println("\t\t\tEnter call length in seconds: ");
            int tempCallLength=input.nextInt();
            while (tempCallLength<1){
                System.out.println("Please enter positive value:");
                tempCallLength=input.nextInt();
            }
            callLength+=tempCallLength;
            call++;
            displayLine();
        }else if (option==2){
            sms=sms+1;
            System.out.println("\t\t\tTotal number of SMS so far = "+sms);
            displayLine();
        }else if (option==3){
            System.out.println("\t\t\tEnter the amount of data in MB:");
            int tempDataUsage=input.nextInt();
            while (tempDataUsage<1){
                System.out.println("Please enter positive value:");
                tempDataUsage=input.nextInt();
            }
            dataUsage+=tempDataUsage;
            displayLine();
        }else if (option==4){
            displayMenu();
            displayLine();
        }else{
            System.out.println("\t\t\tValue must be between 1 and 4. Please try again:");
            option=input.nextInt();
            optionOneForOne(option);
        }
        displayMenuForOptionOne();
        option=input.nextInt();
        optionOneForOne(option);
    }

    private void planA(){
        System.out.println("\t\t\tCost under Plan A");
        displayLine();
        System.out.print("\t\t\tNumber of calls ="+ call);
        System.out.println("\t\t\t\t\t\t$"+call*0.23);
        System.out.print("\t\t\tTotal call time (secs) ="+ callLength);
        System.out.println("\t\t\t\t$"+callLength*0.02);
        System.out.print("\t\t\tNumber of SMS ="+sms);
        System.out.println("\t\t\t\t\t\t$"+sms*0.12);
        System.out.print("\t\t\tData usage (MB) ="+dataUsage);
        System.out.println("\t\t\t\t\t\t$"+dataUsage*0.03);
        displayLine();
        float total= (float)(call*0.23+callLength*0.02+sms*0.12+dataUsage*0.03);
        System.out.println("\t\t\tTOTAL COST "+"\t\t\t\t\t\t\t\t$"+total);
        displayLine();
    }
    private void planB(){
        System.out.println("\t\t\tCost under Plan B");
        displayLine();
        System.out.print("\t\t\tNumber of calls ="+ call);
        System.out.println("\t\t\t\t\t\t$"+call*0.17);
        System.out.print("\t\t\tTotal call time (secs) ="+ callLength);
        System.out.println("\t\t\t\t$"+callLength*0.03);
        System.out.print("\t\t\tNumber of SMS ="+sms);
        System.out.println("\t\t\t\t\t\t$"+sms*0.15);
        System.out.print("\t\t\tData usage (MB) ="+dataUsage);
        System.out.println("\t\t\t\t\t\t$"+dataUsage*0.02);
        displayLine();
        float total= (float) (call*0.17+callLength*0.03+sms*0.15+dataUsage*0.02);
        System.out.println("\t\t\tTOTAL COST "+"\t\t\t\t\t\t\t\t$"+total);
        displayLine();
    }
    private void clearUsage(){
        sms=0;
        call=0;
        callLength=0;
        dataUsage=0;
        displayLine();
        System.out.println("\t\t\tALL USAGE DETAILS HAVE BEEN RESET TO 0");
        displayLine();
    }
    private void exit(){
        displayLine();
        System.out.println("Thank you for using this software. We hope you found it useful.");
        displayLine();
    }

    private void displayAsDollarsAndCents(int cents){
        System.out.print("$" + (cents/100) + "." + (cents%100));
    }
}





