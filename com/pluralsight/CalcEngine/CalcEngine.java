package com.pluralsight.CalcEngine;

public class CalcEngine {
    public static void main(String[] args){
        int x = 25;
        int y = 50; 
        int total = 1;
        char letter = 'a';

        switch(letter){
            case 'm':
                total = x + y;
                break;
            case 'a':
                total = y - x;
                break;
            default:
                System.out.println("Not valid entry");
                break;
            }
            System.out.println(total);
    }
}
