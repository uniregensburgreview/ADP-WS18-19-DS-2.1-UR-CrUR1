package de.ur.adp.schwer.SearchMultiples;

/**
 * Created by Alicia on 29.07.2017.
 */
public class ListNode {

    public String content;
    public ListNode successor = null;



    public ListNode(String cont) {
        this.content = cont;
    }

    public String content() {
        return this.content;
    }

    public ListNode successor() {
        return this.successor;
    }

    public void setSuccessor(ListNode node) {
        successor = node;
    }

    public static ListNode createList () {
        ListNode node1 = new ListNode("a");
        ListNode node2 = new ListNode("b");
        ListNode node3 = new ListNode("c");
        node1.setSuccessor(node2);
        node2.setSuccessor(node3);
        return node1;
    }

    public static ListNode createList2 () {
        ListNode node1 = new ListNode("b");
        ListNode node2 = new ListNode("b");
        ListNode node3 = new ListNode("d");
        node1.setSuccessor(node2);
        node2.setSuccessor(node3);
        return node1;
    }

    public static boolean areEqual(ListNode head1, ListNode head2) {
        int length1 = 0;
        int length2 = 0;
        ListNode currNode1 = head1;
        ListNode currNode2 = head2;

        while (currNode1 != null) {
            currNode1 = currNode1.successor();
            length1++;
        }
        while (currNode2 != null) {
            currNode2 = currNode2.successor();
            length2++;
        }

        if (length1 == length2) {
            while (head1 != null && head2 != null) {
                if (head1.successor().content().equals(head2.successor().content())) {
                    head1 = head1.successor();
                    head2 = head2.successor();
                }

            }
        }
        return false;
    }


}

