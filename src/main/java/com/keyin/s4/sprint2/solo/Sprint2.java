package com.keyin.s4.sprint2.solo;

import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;
import java.util.TreeSet;

import static java.lang.System.exit;

public class Sprint2 {

    public static void main(String[] args) {
        boolean keepGoing = true;
        boolean toDisplay = false;
        int userChoice;
        String userChoiceString;
        TreeSet<Integer> bst = new TreeSet<>();
        Scanner in = new Scanner(System.in);

        while(keepGoing){
            System.out.println("1. Enter a new array of numbers to be added to a tree");

            if(toDisplay){
                System.out.println("2. Add an element to tree");
                System.out.println("3. Delete an element from tree");
                System.out.println("4. Highest value in tree");
                System.out.println("5. Lowest value in tree");
            }

            System.out.println("9. Exit Program");

            // Getting the user choice
            userChoice = in.nextInt();

            // Loading the method that user chooses
            if(userChoice == 1){
                in.nextLine();

                do{
                    System.out.println();
                    System.out.println("Enter a new array of numbers, separated by a comma!");
                    userChoiceString = in.nextLine();
                } while(userChoiceString == "");


                bst = createBSTTree(userChoiceString);

                if(bst.size() != 0){
                    toDisplay = true;
                }

            }

            // Checking for if options 2 and 3 are available to choose
            else if(toDisplay){
                if(userChoice == 2){
                    System.out.println("Enter the element you want to add to the tree: ");
                    userChoice = in.nextInt();

                    bst.add(userChoice);

                    // Add an element to Array
                    System.out.println("Added element " + userChoice + " to tree");
                    System.out.println("Here is the updated tree: " + bst);
                    System.out.println();
                }

                else if(userChoice == 3){
                    // Delete an element from Array
                    System.out.println("Enter the element you wish to delete from the tree: ");
                    userChoice = in.nextInt();

                    bst.remove(userChoice);

                    System.out.println("Deleted element " + userChoice + " from tree");
                    System.out.println("Here is the updated sorted tree: " + bst);
                    System.out.println();
                }

                else if(userChoice == 4){
                    // Display the highest value in tree
                    System.out.println("The highest value stored in the tree is: " + bst.pollLast());
                    System.out.println();
                }

                else if(userChoice == 5){
                    // Display lowest value in tree
                    System.out.println("The lowest value stored in the tree is: " + bst.pollFirst());
                    System.out.println();
                }
            }

            else if(userChoice == 9){
                exit(0);
            } else {
                System.out.println("You entered an incorrect value, please re-enter!");
                System.out.println();
            }
        }
    }

    public static TreeSet<Integer> createBSTTree(String userEnteredValue){
        String[] userArray;
        TreeSet<Integer> bst = new TreeSet<>();

        // Getting user input and changing to string array
        userArray = userEnteredValue.split(", ");

        // Changing from String to Int and adding to tree
        for(int i = 0; i < userArray.length; i++){
            bst.add(Integer.valueOf(userArray[i]));
        }

        System.out.println("Entered Sorted Array with values of: " + bst);
        System.out.println();
        return bst;
    }
}
