package com.keyin.s4.sprint2.solo;

import com.sun.source.tree.Tree;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import java.util.TreeSet;

import static com.keyin.s4.sprint2.solo.Sprint2.createBSTTree;

public class Sprint2Test {

    String userInput;
    TreeSet<Integer> bst1 = new TreeSet<>();
    Object[] bst1ArrayList;
    int arraySize;

    @Test
    public void createBSTTreeTest(){
        userInput = "23, 1, 3, 44, 21, 5";
        arraySize = 6;

        bst1 = createBSTTree(userInput);
        bst1ArrayList = bst1.toArray();

        Assertions.assertEquals(arraySize, bst1.size());
        Assertions.assertNotEquals(10, bst1.size());

        // Checking each position to ensure it has the correct value
        Assertions.assertEquals(1, bst1ArrayList[0]);
        Assertions.assertEquals(3, bst1ArrayList[1]);
        Assertions.assertEquals(5, bst1ArrayList[2]);
        Assertions.assertEquals(21, bst1ArrayList[3]);
        Assertions.assertEquals(23, bst1ArrayList[4]);
        Assertions.assertEquals(44, bst1ArrayList[5]);
    }

    @Test
    public void addElementToTreeTest(){
        userInput = "23, 1, 3, 44, 21, 5";
        arraySize = 6;
        bst1 = createBSTTree(userInput);

        // Add an element to tree
        bst1.add(15);
        bst1ArrayList = bst1.toArray();

        Assertions.assertEquals(arraySize + 1, bst1.size());
        Assertions.assertEquals(15, bst1ArrayList[3]);
    }

    @Test
    public void deleteElementFromTreeTest(){
        userInput = "23, 1, 3, 44, 21, 5";
        arraySize = 6;

        bst1 = createBSTTree(userInput);
        bst1ArrayList = bst1.toArray();

        // Will delete number 3 from tree
        Assertions.assertEquals(arraySize, bst1.size());
        Assertions.assertEquals(3, bst1ArrayList[1]);

        // Deletion of number 3 from tree
        bst1.remove(3);
        bst1ArrayList = bst1.toArray();

        //Running same tests to show object was deleted
        Assertions.assertEquals(arraySize-1, bst1.size());
        Assertions.assertEquals(5, bst1ArrayList[1]);


    }
}
