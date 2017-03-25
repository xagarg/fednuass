package com.base.functionality;

public class Main {

    public static void main(String[] args) {
        Details details = new Details();
        Helper.displayLine();
        Helper.displayInfo();
        Helper.displayLine();
        Helper.displayMenu();
       /*boolean optionBol=(option < 1 && option<5)?false:true;
       while (optionBol){
           System.out.println("Value must be between 1 and 5. Please try again:");
           option=Helper.input.nextInt();
           optionBol=(option < 1 && option<5)?false:true;
       }
        /*System.out.println("=============="+option);*//*
        while (option != 5) {
            if (option == 1) {
                Helper.displayMenuForOptionOne();
                int op = Helper.input.nextInt();
                Helper.optionOneForOne(op);
            } else if (option == 2) {
                System.out.println("=========" + option);
            } else if (option == 3) {
                System.out.println("=========" + option);
            } else if (option == 4) {
                System.out.println("=========" + option);
            } else if (option == 5) {
                System.out.println("=========" + option);
            } else {
                System.out.println("=========" + option);
            }
        }*/
    }

}
