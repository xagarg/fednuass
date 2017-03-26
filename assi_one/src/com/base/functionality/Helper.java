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
                System.exit(0);
            } else {

            }
            displayMenu();
        }

    }
    public void displayMenuForOptionOne(){
        System.out.println("\t\t\tENTER USAGE DETAILS MENU");
        System.out.println("\t\t\tPlease select an option from the menu:");
        System.out.println("\t\t\t1. Phone Call");
        System.out.println("\t\t\t2. SMS");
        System.out.println("\t\t\t3. Data Usage");
        System.out.println("\t\t\t4. Return to main menu");
    }

    public void optionOneForOne(int option){
        if (option==1){
            System.out.println("Enter call length in seconds: ");
            callLength=callLength+input.nextInt();
            call++;
        }else if (option==2){
            sms=sms+1;
            System.out.println("Total number of SMS so far = "+sms);
        }else if (option==3){
            System.out.println("Enter the amount of data in MB:");
            dataUsage=dataUsage+input.nextInt();
        }else if (option==4){
            displayMenu();
        }
    }

    public void planA(){
        System.out.println("Cost under Plan A");
        displayLine();
        System.out.print("Number of calls ="+ call);
        System.out.println("$"+call*0.23);
        System.out.print("Total call time (secs) ="+ callLength);
        System.out.println("$"+callLength*0.02);
        System.out.print("Number of SMS ="+sms);
        System.out.println("$"+sms*0.12);
        System.out.print("Data usage (MB) ="+dataUsage);
        System.out.println("$"+dataUsage*0.03);
        displayLine();
        System.out.println("TOTAL COST "+(call*0.23+callLength*0.02+sms*0.12+dataUsage*0.03));
    }

    public void planB(){
        System.out.println("Cost under Plan B");
        displayLine();
        System.out.print("Number of calls ="+ call);
        System.out.println("$"+call*0.17);
        System.out.print("Total call time (secs) ="+ callLength);
        System.out.println("$"+callLength*0.03);
        System.out.print("Number of SMS ="+sms);
        System.out.println("$"+sms*0.15);
        System.out.print("Data usage (MB) ="+dataUsage);
        System.out.println("$"+dataUsage*0.02);
        displayLine();
        System.out.println("TOTAL COST "+(call*0.17+callLength*0.03+sms*0.15+dataUsage*0.02));
    }
    public void clearUsage(){
        sms=0;
        call=0;
        callLength=0;
        dataUsage=0;
    }
}





