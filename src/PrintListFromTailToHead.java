/**
 * created by Zheng Jiateng on 2019/4/9.
 */

import base.ListNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 从尾到头打印链表: 通常打印是一个只读操作，我们不希望打印时修改原输入数据，后进先出，栈
 *
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 */
public class PrintListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> result = new ArrayList<>();
        if (listNode == null) {
            return result;
        }
        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()) {
            result.add(stack.pop());
        }
        return result;
    }
}
