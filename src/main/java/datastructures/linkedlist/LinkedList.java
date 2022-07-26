package main.java.datastructures.linkedlist;

public class LinkedList {
    //[1, 5, 8, -2, 23]
    public static Node createNewList(int[] nums) {
        if(nums.length == 0) { //check
            return null;
        }

        Node head = new Node();//head.myData == 1
        head.myData = nums[0];
        head.myNext = null;
        Node curr = head;//curr.myData == 1

        for(int i = 1; i < nums.length; i++) { //starting at 5
            Node temp = new Node();
            temp.myData = nums[i];
            temp.myNext = null;

            curr.myNext = temp;
            curr = curr.myNext;
        }
        return head;
    }
}