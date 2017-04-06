package com.advanced.functionality;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.GregorianCalendar;

/**
 * Created by bbk on 3/24/17.
 */
public class Helper {

    Scanner input= new Scanner(System.in);

    int sms=0;
    int call=0;
    int callLength=0;
    int dataUsage=0;
    Date date=null;

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
        boolean optionIns=true;
        System.out.println("\t\t\tMENU");
        System.out.println("\t\t\tPlease select an option from the menu:");
        System.out.println("\t\t\t1. Enter Usage Details");
        System.out.println("\t\t\t2. Display Cost Under Plan A");
        System.out.println("\t\t\t3. Display Cost Under Plan B");
        System.out.println("\t\t\t4. Display Cost Under Plan C");
        System.out.println("\t\t\t5. Clear Usage Details");
        System.out.println("\t\t\t6. Exit System");
        int option =input.nextInt();
        if (option>6 || option<1){
            System.out.println("Value must be between 1 and 6. Please try again:");
            option=input.nextInt();
        }
        while (optionIns){
            if(option == 1) {
                displayMenuForOptionOne();
                int op = input.nextInt();
                optionOneForOne(op);
            } else if (option == 2) {
                planA();
            } else if (option == 3) {
                planB();
            } else if (option == 4) {
                planC();
            } else if (option == 5) {
                clearUsage();
            } else if (option == 6) {
                exit();
            } else {
                System.out.println("Value must be between 1 and 6. Please try again:");
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

            System.out.println("\t\t\tEnter call date day");
            int day=input.nextInt();
            System.out.println("\t\t\tEnter call date month");
            int month=input.nextInt()-1;
            System.out.println("\t\t\tEnter call date year");
            int year=input.nextInt();

            GregorianCalendar gregorianCalendar= new GregorianCalendar();
            gregorianCalendar.set(year,month,day);

            int dayOfWeek= gregorianCalendar.get(GregorianCalendar.DAY_OF_WEEK);

            System.out.println("+++++++++++\t"+dayOfWeek);
            System.out.println(gregorianCalendar.getTime());

            if (dayOfWeek!=1 && dayOfWeek!=7){
                System.out.println("\t\t\tEnter call length in seconds: ");
                int tempCallLength=input.nextInt();

                while (tempCallLength<1){

                    System.out.println("Value must be positive. Please try again:");
                    tempCallLength=input.nextInt();

                }
                callLength+=tempCallLength;
            }
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
                System.out.println("Value must be positive. Please try again:");
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
        System.out.print("\t\t\tNumber of calls ="+ call+"\t\t\t\t\t\t");
        displayAsDollarsAndCents(call*23);
        System.out.println(" ");
        System.out.print("\t\t\tTotal call time (secs) ="+ callLength+"\t\t\t\t");
        displayAsDollarsAndCents(callLength*2);
        System.out.println(" ");
        System.out.print("\t\t\tNumber of SMS ="+sms+"\t\t\t\t\t\t");
        displayAsDollarsAndCents(sms*12);
        System.out.println(" ");
        System.out.print("\t\t\tData usage (MB) ="+dataUsage+"\t\t\t\t\t\t");
        displayAsDollarsAndCents(dataUsage*3);
        System.out.println(" ");
        displayLine();
        int total=call*23+callLength*2+sms*12+dataUsage*3;
        System.out.print("\t\t\tTOTAL COST "+"\t\t\t\t\t\t\t\t");
        displayAsDollarsAndCents(total);
        System.out.println(" ");
        displayLine();
    }

    private void planB(){
        System.out.println("\t\t\tCost under Plan B");
        displayLine();
        System.out.print("\t\t\tNumber of calls ="+ call+"\t\t\t\t\t\t");
        displayAsDollarsAndCents(call*17);
        System.out.println(" ");
        System.out.print("\t\t\tTotal call time (secs) ="+ callLength+"\t\t\t\t");
        displayAsDollarsAndCents(callLength*3);
        System.out.println(" ");
        System.out.print("\t\t\tNumber of SMS ="+sms+"\t\t\t\t\t\t");
        displayAsDollarsAndCents(sms*15);
        System.out.println(" ");
        System.out.print("\t\t\tData usage (MB) ="+dataUsage+"\t\t\t\t\t\t");
        displayAsDollarsAndCents(dataUsage*2);
        System.out.println(" ");
        displayLine();
        int total=call*17+callLength*3+sms*15+dataUsage*2;
        System.out.print("\t\t\tTOTAL COST "+"\t\t\t\t\t\t\t\t");
        displayAsDollarsAndCents(total);
        System.out.println(" ");
        displayLine();
    }

    private void planC(){
        System.out.println("\t\t\tCost under Plan C");
        displayLine();
        System.out.print("\t\t\tNumber of calls ="+ call+"\t\t\t\t\t\t");
        displayAsDollarsAndCents(call*11);
        System.out.println(" ");
        System.out.print("\t\t\tTotal call time (secs) ="+callLength+"\t\t\t\t");
        displayAsDollarsAndCents(callLength*3);
        System.out.println(" ");
        System.out.print("\t\t\tNumber of SMS ="+sms+"\t\t\t\t\t\t");
        displayAsDollarsAndCents(sms*9);
        System.out.println(" ");
        System.out.print("\t\t\tData usage (MB) ="+dataUsage+"\t\t\t\t\t\t");
        if(dataUsage<=100){
            displayAsDollarsAndCents(dataUsage*2);
            System.out.println(" ");
        }else {
            displayAsDollarsAndCents(100*2+(dataUsage-100)*10);
            System.out.println(" ");
        }
        displayLine();
        int total=call*17+callLength*3+sms*15+dataUsage*2;
        System.out.print("\t\t\tTOTAL COST "+"\t\t\t\t\t\t\t\t");
        displayAsDollarsAndCents(total);
        System.out.println(" ");
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
        System.exit(0);
    }

    private void displayAsDollarsAndCents(int cents){
        System.out.print("$" + (cents/100) + "." + (cents%100));
    }
}





