package com.keyin.s4.sprint2.solo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Sprint2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean enterMoreNumbers = true;
        String userInput;
        TreeSet<Integer> bst = new TreeSet<Integer>();

        System.out.println("Enter a number and hit enter");

        while (enterMoreNumbers){

            userInput = in.nextLine();

            if(userInput.toLowerCase().equals("end")){
                enterMoreNumbers = false;
                break;
            } else {
                bst.add(Integer.valueOf(userInput));
            }
            System.out.println("Enter another number? (End to Quit)");
        }
        System.out.println(bst);
    }
}
