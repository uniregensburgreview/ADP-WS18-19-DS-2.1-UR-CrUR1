package de.ur.adp;

import de.ur.adp.schwer.SearchMultiples.ListNode;

public class Program {

    public static ListNode list1 = ListNode.createList();
    public  static ListNode list2 = ListNode.createList2();
    private static boolean equal;

    public static void main(String[] args) {
        equal = ListNode.areEqual(list1, list2);
        System.out.print(equal);
    }
}
