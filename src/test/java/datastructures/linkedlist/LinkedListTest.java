package test.java.datastructures.linkedlist;


import main.java.datastructures.linkedlist.LinkedList;
import main.java.datastructures.linkedlist.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListTest {


    @Test
    public void createNewList_arrayOf3Nums() {
        int[] nums = {2, 9, 17};
        Node firstNum = LinkedList.createNewList(nums);
        Node secondNum = firstNum.myNext;
        Node thirdNum = secondNum.myNext;

        Assertions.assertEquals(nums[0], firstNum.myData);
        Assertions.assertEquals(nums[1], secondNum.myData);
        Assertions.assertEquals(nums[2], thirdNum.myData);
    }
}
