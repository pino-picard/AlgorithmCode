package code1.lesson18;

import java.util.Date;

public class Lesson18 {
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) {
            return null;
        } else if (head.val == val) {
            return head.next;
        } else {
            ListNode pre = head;
            ListNode temp = head.next;
            while (temp != null) {
                if (temp.val == val) {
                    pre.next = temp.next;
                    break;
                } else {
                    pre = temp;
                    temp = temp.next;
                }
            }
            return head;
        }
    }

    public static void main(String[] args) {

    }
}
