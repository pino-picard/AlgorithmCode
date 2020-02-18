package code1.lesson6;

import java.util.Arrays;
import java.util.Stack;

public class Lesson6 {
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        int[] result = new int[stack.size()];
        int i = 0;
        while (!stack.empty()) {
            result[i] = stack.pop();
            i++;
        }
        return result;
    }

    public static void main(String[] args){
        Lesson6 l = new Lesson6();
        ListNode node = new ListNode(1);

        System.out.println(Arrays.toString(l.reversePrint(node)));
    }


}


